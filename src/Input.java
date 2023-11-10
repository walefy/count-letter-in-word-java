import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String readInput(String message) {
        System.out.print(message);

        return scanner.nextLine();
    }
}
