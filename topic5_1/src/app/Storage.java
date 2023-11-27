package app;

public class Storage<T> {
    private T s;

    public Storage(T data) {
        this.s = data;
    }

    // Getter method
    public T getData() {
        return s;
    }

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>("The Chicken Coop");
        String stringData = stringStorage.getData();
        System.out.println("String Data: " + stringData);

        Storage<Integer> integerStorage = new Storage<>(42);
        Integer integerData = integerStorage.getData();
        System.out.println("Integer Data: " + integerData);
    }
}
