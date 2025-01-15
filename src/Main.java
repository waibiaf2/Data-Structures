import linear.LinkedList;
import linear.QueueWithTwoStackMe;
import linear.QueueWithTwoStacksMosh;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addLast(10);
        myList.addLast(20);
        myList.addLast(30);
        myList.addLast(40);

        myList.addFirst(900);

        var listArray = myList.toArray();
        System.out.println(Arrays.toString(listArray));

    }
}