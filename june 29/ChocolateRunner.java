class Chocolate {
    String name = "milky Bar";
    double price;
    String color = "white";
    double size;

    Chocolate() {
        System.out.println("Chocolate const is running");
    }
}

public class ChocolateRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Chocolate ref = new Chocolate();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.size);
        System.out.println(ref.color);

    }
}