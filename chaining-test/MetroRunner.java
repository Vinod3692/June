public class MetroRunner {
    public static void main(String[] args) {
        System.out.println("running main of MetroRunner");
        Metro ref1 = new Metro("green");
        System.out.println("line : " + ref1.line);
        System.out.println("currency : " + ref1.start);
        System.out.println("denomination : " + ref1.destination);
        System.out.println("distance : " + ref1.distance);

        Metro ref2 = new Metro("green", "majestic");
        System.out.println("line : " + ref2.line);
        System.out.println("currency : " + ref2.start);
        System.out.println("denomination : " + ref2.destination);
        System.out.println("distance : " + ref2.distance);

        Metro ref3 = new Metro("purple", "majestic", "kengeri");
        System.out.println("line : " + ref3.line);
        System.out.println("currency : " + ref3.start);
        System.out.println("denomination : " + ref3.destination);
        System.out.println("distance : " + ref3.distance);

        Metro ref4 = new Metro("purple", "majestic", "kengeri", 28);
        System.out.println("line : " + ref4.line);
        System.out.println("currency : " + ref4.start);
        System.out.println("denomination : " + ref4.destination);
        System.out.println("distance : " + ref4.distance);

        Metro ref5 = new Metro("purple", "majestic", "kengeri", 28, 300);
        System.out.println("line : " + ref5.line);
        System.out.println("currency : " + ref5.start);
        System.out.println("denomination : " + ref5.destination);
        System.out.println("distance : " + ref5.distance);
        System.out.println("capacity : " + ref5.capacity);

    }
}
