class Owner {
    String name;
    String ownwershipOf;
    double wealth;
    int noOfBuildings;
    int noOfCars;

    Owner(String name, String ownershipOf, double wealth, int noOfBuildings, int noOfCars) {
        this.name = name;
        this.ownwershipOf = ownershipOf;
        this.wealth = wealth;
        this.noOfBuildings = noOfBuildings;
        this.noOfCars = noOfCars;
    }

    void displayOwner() {
        System.out.println(name);
        System.out.println(ownwershipOf);
        System.out.println(wealth);
        System.out.println(noOfBuildings);
        System.out.println(noOfCars);
    }
}

public class OwnerRunner {
    public static void main(String[] args) {
        System.out.println("running main of OwnerRunner");
        Owner owner = new Owner("chandru", "jeevandeep", 85.40, 4, 5);
        owner.displayOwner();
        System.out.println("after updating variables of owner");
        owner.name = "shweta";
        owner.ownwershipOf = "coaching";
        owner.wealth = 4.80;
        owner.noOfBuildings = 1;
        owner.noOfCars = 3;
        owner.displayOwner();
    }
}
