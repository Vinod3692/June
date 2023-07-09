class FireExtinguisher {
    String madeOf;
    String containsGas;
    String usedFor;
    double weight;
    int dischargeTime;

    FireExtinguisher(String madeOf, String containsGas, String usedFor, double weight, int dischargeTime) {
        this.madeOf = madeOf;
        this.containsGas = containsGas;
        this.usedFor = usedFor;
        this.weight = weight;
        this.dischargeTime = dischargeTime;
    }

    void displayFireExtinguisher() {
        System.out.println(madeOf);
        System.out.println(containsGas);
        System.out.println(usedFor);
        System.out.println(weight);
        System.out.println(dischargeTime);
    }
}

class FireExtinguisherRunner {
    public static void main(String[] args) {
        System.out.println("running main of FireExtinguisher");
        FireExtinguisher extinguisher = new FireExtinguisher("aluminium", "co2", "off fire", 4.50, 40);
        extinguisher.displayFireExtinguisher();
        System.out.println("after updating variables of FireExtinguisher");
        extinguisher.madeOf = "iron";
        extinguisher.containsGas = "carbon dioxide";
        extinguisher.usedFor = "spray";
        extinguisher.weight = 7.00;
        extinguisher.dischargeTime = 25;
        extinguisher.displayFireExtinguisher();
    }
}
