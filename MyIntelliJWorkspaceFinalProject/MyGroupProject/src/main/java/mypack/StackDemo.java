package mypack;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        st.add(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        for (int item : st) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
