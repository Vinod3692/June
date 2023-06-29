class Biscuit {
    String name = "dark fantacy";
    float price;
    String specification = "good";
    double quantity;

    Biscuit() {
        System.out.println("Biscuit const is running");
    }
}

public class BiscuitRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Biscuit ref = new Biscuit();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.specification);
        System.out.println(ref.quantity);

    }
}