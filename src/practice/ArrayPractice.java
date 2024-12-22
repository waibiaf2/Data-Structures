package practice;

public class ArrayPractice {
    int[] items;
    int count = 0;

    public ArrayPractice(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if(count == items.length) {
            int[] newItems = new int[items.length * 2];

            System.arraycopy(items, 0, newItems, 0, count);

            newItems[count++] = item;
            items = newItems;
            return;
        }

        items[count++] = item;
    }

    //removeAt
    public void removeAt(int index) {

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < items.length; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    //indexOf
    public int indexOf(int item) {

        for (int i = 0; i < count; i++) {
            if(items[i] == item ) {
                return i;
            }
        }

        return -1;
    }

    //print
    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
