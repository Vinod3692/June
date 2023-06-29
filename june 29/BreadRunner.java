class Bread {
    String name = "";
    double price = 20;
    String color = "";
    double quantity = 1;

    Bread() {
        System.out.println("Bread const is running");
    }
}

public class BreadRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Bread ref = new Bread();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.color);
        System.out.println(ref.quantity);

    }
}