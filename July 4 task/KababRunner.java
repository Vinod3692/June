
public class KababRunner {
    public static void main(String[] args) {
        System.out.println("running main of KababRunner");

        Kabab first1 = new Kabab("Tandoori Kabab");
        System.out.println(first1.name);

        Kabab first2 = new Kabab("Tandoori Kabab", 400);
        System.out.println(first2.name);
        System.out.println(first2.price);

        Kabab first3 = new Kabab("Tandoori Kabab", 400, "Minar Biriyani");
        System.out.println(first3.name);
        System.out.println(first3.price);
        System.out.println(first3.hotelName);

        Kabab first4 = new Kabab("Tandoori Kabab", 400, "Minar Biriyani", 4);
        System.out.println(first4.name);
        System.out.println(first4.price);
        System.out.println(first4.hotelName);
        System.out.println(first4.noOfPieces);

        Kabab first5 = new Kabab("Tandoori Kabab", 400, "Minar Biriyani", 4, true);
        System.out.println(first5.name);
        System.out.println(first5.price);
        System.out.println(first5.hotelName);
        System.out.println(first5.noOfPieces);
        System.out.println(first5.takeAway);
    }
}