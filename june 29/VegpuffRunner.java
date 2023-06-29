class Vegpuff {
    String name;
    double price;
    String shape = "diamond shape";
    double quantity = 1;

    Vegpuff() {
        System.out.println("Vegpuff const is running");
    }
}

public class VegpuffRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Vegpuff ref = new Vegpuff();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.shape);
        System.out.println(ref.quantity);

    }
}