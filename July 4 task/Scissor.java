class Scissor {
    String brand;
    String color;
    String type;
    String usage;
    char size;
    double price;
    String material;

    Scissor(String brand) {
        System.out.println("running Scissor const with brand");
        this.brand = brand;

    }

    Scissor(String brand, String color) {
        System.out.println("running Scissor const with brand and color ");
        this.brand = brand;
        this.color = color;

    }

    Scissor(String brand, String color, String type) {
        System.out.println("running Scissor const with brand,color and type");
        this.brand = brand;
        this.color = color;
        this.type = type;

    }

    Scissor(String brand, String color, String type, String usage) {
        System.out.println("running Scissor const with brand,color,type and usage");
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.usage = usage;
    }

    Scissor(String brand, String color, String type, String usage, char size) {
        System.out.println("running Scissor const with brand,color,type,usage and size");
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.usage = usage;
        this.size = size;

    }

    Scissor(String brand, String color, String type, String usage, char size, double price) {
        System.out.println("running Scissor const with brand,color,type,usage,size and price");
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.usage = usage;
        this.size = size;
        this.price = price;

    }

    Scissor(String brand, String color, String type, String usage, char size, double price, String material) {
        System.out.println("running Scissor const with brand,color,type,usage,size,price and material");
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.usage = usage;
        this.size = size;
        this.price = price;
        this.material = material;

    }
}
