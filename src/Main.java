import linear.Array;
import linear.LinkedList;
import practice.ArrayPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        var myArray = list.toArray();

        System.out.println(Arrays.toString(myArray));

    }
}