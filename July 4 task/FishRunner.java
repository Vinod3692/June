
public class FishRunner {
    public static void main(String[] args) {
        System.out.println("running main of FishRunner");
        Fish first = new Fish("shark");

        System.out.println(first.name);
        System.out.println(first.type);
        System.out.println(first.price);
        System.out.println(first.location);

    }
}