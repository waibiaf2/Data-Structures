package com.datastructures;

import com.datastructures.queues.PriorityQueueSt;

public class Main {
    public static void main(String[] args) {
        PriorityQueueSt pq = new PriorityQueueSt();
        pq.add(5);
        pq.add(3);
        pq.add(6);
        pq.add(4);
        pq.add(1);
        pq.add(2);

        System.out.println(pq);
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
