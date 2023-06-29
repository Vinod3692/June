class Cake {
    String name = "honey cake";
    double price = 70;
    String size;
    double quantity;

    Cake() {
        System.out.println("Cake const is running");
    }
}

public class CakeRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Cake ref = new Cake();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.size);
        System.out.println(ref.quantity);

    }
}