class Bun {
    String name = "Cream Bun";
    double price;
    String color;
    float quantity = 100;

    Bun() {
        System.out.println("Bun const is running");
    }
}

public class BunRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Bun ref = new Bun();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.color);
        System.out.println(ref.quantity);

    }
}