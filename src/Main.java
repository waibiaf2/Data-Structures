import linear.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);

        array.insert(10);
        array.insert(44);
        array.insert(95);
        array.insert(60);
        array.insert(18);
        array.insert(30);

        array.print();

        System.out.println(array.indexOf(95));
    }
}