class Candy {
    String name = "lolipop";
    double price;
    String size;
    double date;

    Candy() {
        System.out.println("Candy const is running");
    }
}

public class CandyRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Candy ref = new Candy();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.size);
        System.out.println(ref.date);

    }
}