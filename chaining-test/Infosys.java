public class Infosys {
    String founderName;
    String founderWifeName;
    int founded;
    int totalEmployees;

    Infosys(String founderName) {
        System.out.println("running Info -sys const with founderName ");
        this.founderName = founderName;
    }

    Infosys(String founderName, String founderWifeName) {
        this(founderName);
        System.out.println("running Infosys const with founderName and founderWifeName ");
        this.founderWifeName = founderWifeName;
    }

    Infosys(String founderName, String founderWifeName, int founded) {
        this(founderName, founderWifeName);
        System.out.println("running Infosys const with founderName,founderWifeName and founded ");
        this.founded = founded;
    }

    Infosys(String founderName, String founderWifeName, int founded, int totalEmployees) {
        this(founderName, founderWifeName, founded);
        System.out.println("running Infosys const with founderName,founderWifeName,founded and totalEmployees ");
        this.totalEmployees = totalEmployees;
    }
}
