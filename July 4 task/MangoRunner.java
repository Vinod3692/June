public class MangoRunner {
    public static void main(String[] args) {
        System.out.println("running main of MangoRunner");

        Mango first1 = new Mango("sweet mango");
        System.out.println(first1.name);

        Mango first2 = new Mango("sweet mango", 40);
        System.out.println(first2.name);
        System.out.println(first2.price);

        Mango first3 = new Mango("sweet mango", 40, "yellow");
        System.out.println(first3.name);
        System.out.println(first3.price);
        System.out.println(first3.color);
    }
}