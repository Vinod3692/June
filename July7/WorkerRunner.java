class Worker {
    String name;
    int salary;
    String workShift;
    int hours;
    String address;

    Worker(String name, int salary, String workShift, int hours, String address) {
        this.name = name;
        this.salary = salary;
        this.workShift = workShift;
        this.hours = hours;
        this.address = address;
    }

    void displayWorker() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(workShift);
        System.out.println(hours);
        System.out.println(address);
    }
}

public class WorkerRunner {
    public static void main(String[] args) {
        System.out.println("running main of WorkerRunner");
        Worker worker = new Worker("Alice", 35000, "night", 8, "HCL company");
        worker.displayWorker();
        System.out.println("after updating variables of WorkerRunner ");
        worker.name = "suraj";
        worker.salary = 38000;
        worker.workShift = "day";
        worker.hours = 6;
        worker.address = "majestic";
        worker.displayWorker();
    }
}
