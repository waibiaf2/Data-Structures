import linear.Array;
import linear.LinkedList;
import practice.ArrayPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice(3);

        arrayPractice.insert(10);
        arrayPractice.insert(20);
        arrayPractice.insert(30);
        arrayPractice.insert(40);
        arrayPractice.insert(50);
        arrayPractice.insert(60);

        arrayPractice.removeAt(2);

        arrayPractice.print();

       /* Array array = new Array(3);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(70);

        array.removeAt(2);

        array.print();*/
    }
}