package app;

public class MyNumberArray {
    
    public static <N extends Number> void printArray(N[] array) {
        for (N element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        
        MyArray.printArray(intArray);
        MyArray.printArray(doubleArray);
    }
}