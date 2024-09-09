package com.datastructures;

import com.datastructures.practice.arrays.FindMissingNumber;
import com.datastructures.practice.linkedLists.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(55);
        list.addFirst(66);
        list.addLast(77);
        list.addFirst(88);
        list.addLast(100);


        int[] arrayList = list.toArray();
        System.out.println(Arrays.toString(arrayList));
        System.out.println(list.indexOf(77));
        System.out.println("==================================================");


       /* list.deleteFirst();
        list.deleteFirst();*/
        list.add(2,700);
        list.add(500);
        list.add(589);
        list.add(1,800);
        list.add(7,555);

        int[] arrayList2 = list.toArray();
        System.out.println(Arrays.toString(arrayList2));
        System.out.println(list.indexOf(555));
        System.out.println(list.size());
        System.out.println(list.indexOf(9000));

    }
}
