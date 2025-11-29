class TestBox<T> 
{
    private T value;

    public T (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        TestBox<Integer> intBox = new TestBox<>(123);
        System.out.println("Integer Value: " + intBox.getValue());

        TestBox<String> strBox = new TestBox<>("Hello Generics");
        System.out.println("String Value: " + strBox.getValue());
    }
}