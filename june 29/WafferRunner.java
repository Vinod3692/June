class Waffer {
    String name = "potato";
    double price = 80;
    String color;
    double quantity;

    Waffer() {
        System.out.println("Waffer const is running");
    }
}

public class WafferRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Waffer ref = new Waffer();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.color);
        System.out.println(ref.quantity);

    }
}