public class InfosysRunner {
    public static void main(String[] args) {
        System.out.println("running main of InfosysRunner");
        Infosys ref1 = new Infosys("narayan murthy");
        System.out.println("founderName : " + ref1.founderName);
        System.out.println("founderWifeName : " + ref1.founderWifeName);
        System.out.println("founded : " + ref1.founded);
        System.out.println("totalEmployees : " + ref1.totalEmployees);

        Infosys ref2 = new Infosys("narayan murthy", "sudha murthy");
        System.out.println("founderName : " + ref2.founderName);
        System.out.println("founderWifeName : " + ref2.founderWifeName);
        System.out.println("founded : " + ref2.founded);
        System.out.println("totalEmployees : " + ref2.totalEmployees);

        Infosys ref3 = new Infosys("narayan murthy", "sudha murthy", 1987);
        System.out.println("founderName : " + ref3.founderName);
        System.out.println("founderWifeName : " + ref3.founderWifeName);
        System.out.println("founded : " + ref3.founded);
        System.out.println("totalEmployees : " + ref3.totalEmployees);

        Infosys ref4 = new Infosys("narayan murthy", "sudha murthy", 1987, 5000);
        System.out.println("founderName : " + ref4.founderName);
        System.out.println("founderWifeName : " + ref4.founderWifeName);
        System.out.println("founded : " + ref4.founded);
        System.out.println("totalEmployees : " + ref4.totalEmployees);
    }
}
