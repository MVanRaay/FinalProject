package mypack;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        List<Integer> ll = new LinkedList<Integer>();
        Queue<Integer> qu = new PriorityQueue<Integer>();

        qu.add(10);
        qu.offer(20);
        qu.offer(30);
        qu.offer(40);
        qu.offer(50);

        for (int item : qu) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println(qu.size());
        System.out.println(qu.remove());
        System.out.println(qu.size());
        System.out.println(qu.peek());
        System.out.println(qu.size());
    }
}

// Which DS can represent all others