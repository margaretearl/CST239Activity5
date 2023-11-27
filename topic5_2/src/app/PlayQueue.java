package app;

import java.util.LinkedList;
import java.util.Queue;

public class PlayQueue {
    public static void main(String[] args) {
        
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);


        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("One");
        stringQueue.add("Two");
        stringQueue.add("Three");
        stringQueue.add("Four");
        stringQueue.add("Five");

        System.out.println("Size of Integer Queue: " + integerQueue.size());
        System.out.println("Is Integer Queue empty? " + integerQueue.isEmpty());
        System.out.println("Head element of Integer Queue: " + integerQueue.peek());

        System.out.println("Size of String Queue: " + stringQueue.size());
        System.out.println("Is String Queue empty? " + stringQueue.isEmpty());
        System.out.println("Head element of String Queue: " + stringQueue.peek());

        System.out.println("Integer Queue: " + integerQueue.toString());

        System.out.println("String Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}