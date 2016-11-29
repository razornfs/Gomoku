import java.util.Scanner;

public class InputHandler {
    private static Scanner in = new Scanner(System.in);

    public static int getRow() {
        return in.nextInt();
    }

    public static int getColumn() {
        return in.nextInt();
    }
}
