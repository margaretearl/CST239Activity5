package app;

import java.util.Stack;

public class PlayStack {
    public static void main(String[] args) {
        
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        
        Stack<String> stringStack = new Stack<>();
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");
        stringStack.push("Four");
        stringStack.push("Five");

       
        System.out.println("Size of Integer Stack: " + integerStack.size());
        System.out.println("Is Integer Stack empty? " + integerStack.isEmpty());
        if (integerStack.size() >= 2) {
            System.out.println("2nd element of Integer Stack: " + integerStack.elementAt(1));
        }

        System.out.println("Size of String Stack: " + stringStack.size());
        System.out.println("Is String Stack empty? " + stringStack.isEmpty());
        if (stringStack.size() >= 2) {
            System.out.println("2nd element of String Stack: " + stringStack.elementAt(1));
        }


        System.out.println("Integer Stack: " + integerStack.toString());

       
        System.out.println("String Stack:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}