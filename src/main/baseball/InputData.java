package baseball;

import java.util.Scanner;

public class InputData {
    private Scanner scanner = new Scanner(System.in);

    public String getPlayerInput() {
        return scanner.nextLine();
    }

    public int getPlayerInputInt() {
        return scanner.nextInt();
    }
}
