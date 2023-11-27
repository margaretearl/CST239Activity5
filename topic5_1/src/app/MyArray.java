package app;

public class MyArray {
 
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
 
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'M', 'A', 'R', 'G', 'O'};

        MyArray.printArray(intArray);
        MyArray.printArray(doubleArray);
        MyArray.printArray(charArray);
    }
}