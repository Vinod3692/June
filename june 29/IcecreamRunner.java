class Icecream {
    String name = "vanilla";
    double price = 35;
    String size;
    float mfgdate;

    Icecream() {
        System.out.println("Icecream const is running");
    }
}

public class IcecreamRunner {
    public static void main(String[] args) {
        System.out.println("main method is running...");
        Icecream ref = new Icecream();
        System.out.println(ref.name);
        System.out.println(ref.price);
        System.out.println(ref.size);
        System.out.println(ref.mfgdate);

    }
}