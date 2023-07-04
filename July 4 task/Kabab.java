class Kabab {
    String name;
    double price;
    String hotelName;
    int noOfPieces;
    boolean takeAway;

    Kabab(String name) {
        System.out.println("running kabab const with name");
        this.name = name;
    }

    Kabab(String name, double price) {
        System.out.println("running kabab const with name and type");
        this.name = name;
        this.price = price;
    }

    Kabab(String name, double price, String hotelName) {
        System.out.println("running kabab const with name and type");
        this.name = name;
        this.price = price;
        this.hotelName = hotelName;
    }

    Kabab(String name, double price, String hotelName, int noOfPieces) {
        System.out.println("running kabab const with name and type");
        this.name = name;
        this.price = price;
        this.hotelName = hotelName;
        this.noOfPieces = noOfPieces;
    }

    public Kabab(String name, double price, String hotelName, int noOfPieces, boolean takeAway) {
        System.out.println("running kabab const with name and type");
        this.name = name;
        this.price = price;
        this.hotelName = hotelName;
        this.noOfPieces = noOfPieces;
        this.takeAway = takeAway;
    }
}
