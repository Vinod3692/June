
public class ScissorRunner {
    public static void main(String[] args) {
        System.out.println("running main of ScissorRunner");

        Scissor first1 = new Scissor("X-men");

        System.out.println(first1.brand);

        Scissor first2 = new Scissor("X-men", "Gray");

        System.out.println(first2.brand);
        System.out.println(first2.color);

        Scissor first3 = new Scissor("X-men", "Gray", "Standard-Scissor");

        System.out.println(first3.brand);
        System.out.println(first3.color);
        System.out.println(first3.type);

        Scissor first4 = new Scissor("X-men", "Gray", "Standard-Scissor", "Cutting-Paper");

        System.out.println(first4.brand);
        System.out.println(first4.color);
        System.out.println(first4.type);
        System.out.println(first4.usage);

        Scissor first5 = new Scissor("X-men", "Gray", "Standard-Scissor", "Cutting-Paper", 'M');

        System.out.println(first5.brand);
        System.out.println(first5.color);
        System.out.println(first5.type);
        System.out.println(first5.usage);
        System.out.println(first5.size);

        Scissor first6 = new Scissor("X-men", "Gray", "Standard-Scissor", "Cutting-Paper", 'M', 700);

        System.out.println(first6.brand);
        System.out.println(first6.color);
        System.out.println(first6.type);
        System.out.println(first6.usage);
        System.out.println(first6.size);
        System.out.println(first6.price);

        Scissor first7 = new Scissor("X-men", "Gray", "Standard-Scissor", "Cutting-Paper", 'M', 700, "Stainless-Steel");

        System.out.println(first7.brand);
        System.out.println(first7.color);
        System.out.println(first7.type);
        System.out.println(first7.usage);
        System.out.println(first7.size);
        System.out.println(first7.price);
        System.out.println(first7.material);

    }
}