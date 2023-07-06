public class Metro {
    String line;
    String start;
    String destination;
    int distance;
    int capacity;

    Metro(String line) {
        System.out.println("running Metro const with line ");
        this.line = line;
    }

    Metro(String line, String start) {
        this(line);
        System.out.println("running Metro const with line and start ");
        this.start = start;
    }

    Metro(String line, String start, String destination) {
        this(line, start);
        System.out.println("running Metro const with line,start and denomination ");
        this.destination = destination;
    }

    Metro(String line, String start, String destination, int distance) {
        this(line, start, destination);
        System.out.println("running Metro const with line,start,destination and type ");
        this.distance = distance;
    }

    Metro(String line, String start, String destination, int distance, int capacity) {
        this(line, start, destination, distance);
        System.out.println("running Metro const with line,start,destination and type ");
        this.capacity = capacity;
    }
}
