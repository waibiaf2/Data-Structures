package linear;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        //If the array is full
        if (count == items.length) {
            //Create a new array (twice the size)
            int[] newItems = new int[items.length * 2];

            //Copy all the elements in the in items into the new array
            System.arraycopy(
                items, 0,
                newItems, 0,
                count
            );

            newItems[count++] = item;

            //Assign the newItems to items and return
            items = newItems;
            return;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        /**
         * validate the index, if it is invalid throw an exception
         * ie. if the index is less than 0 or greater than or equal to the count
         *
         * Loop over all the items starting from the index
         * Move each item one step to the left
         *
         * Decrement the count
         * */

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        /**
         * Loop over all the items,
         * If we find the item return the index,
         * otherwise return -1
         * */
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
