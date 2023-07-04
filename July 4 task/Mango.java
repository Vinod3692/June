public class Mango {
    String name;
    double price;
    String color;

    Mango(String name) {
        System.out.println("running mango const with name");
        this.name = name;
    }

    Mango(String name, double price) {
        System.out.println("running mango const with name and type");
        this.name = name;
        this.price = price;
    }

    Mango(String name, double price, String color) {
        System.out.println("running mango const with name and type");
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
