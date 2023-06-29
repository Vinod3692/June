class Sweet {
    String name = "laddu";
    double price;
    String size;
    double quantity = 1;

    Sweet() {
        System.out.println("sweet const is running");
    }
}

public class SweetRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Sweet ref = new Sweet();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.size);
        System.out.println(ref.quantity);

    }
}