package app;

import java.util.ArrayList;

public class PlayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");

        System.out.println("First element of Integer List: " + integerList.get(0));
        System.out.println("First element of String List: " + stringList.get(0));

        System.out.println("Integer List:");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();

        System.out.println("String List:");
        int j = 0;
        while (j < stringList.size()) {
            System.out.print(stringList.get(j) + " ");
            j++;
        }
    }
}