public class Money {
    String country;
    String currency;
    int denomination;
    int type;

    Money(String country) {
        System.out.println("running Money const with country ");
        this.country = country;
    }

    Money(String country, String currency) {
        this(country);
        System.out.println("running Money const with country and currency ");
        this.currency = currency;
    }

    Money(String country, String currency, int denomination) {
        this(country, currency);
        System.out.println("running Money const with country,currency and denomination ");
        this.denomination = denomination;
    }

    Money(String name, String currency, int denomination, int type) {
        this(name, currency, denomination);
        System.out.println("running Money const with country,currency,denomination and type ");
        this.type = type;
    }
}
