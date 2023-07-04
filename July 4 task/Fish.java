class Fish {
    String name;
    String type;
    int price;
    String location;

    Fish(String name) {
        System.out.println("running fish const with name");
        this.name = name;
    }

    Fish(String name, String type) {
        System.out.println("running fish const with name and type");
        this.name = name;
        this.type = type;
    }

    Fish(String name, String type, int price) {
        System.out.println("running fish const with name,type and price");
        this.name = name;
        this.type = type;
        this.price = price;
    }

    Fish(String name, String type, int price, String location) {
        System.out.println("running fish const with name");
        this.name = name;
        this.type = type;
        this.price = price;
        this.location = location;
    }
}