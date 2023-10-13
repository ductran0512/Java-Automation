package lab_06;

import java.util.Scanner;

public class lab06_02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int userInput = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your password!: ");
            String userInputPassword = scanner.nextLine();
            if (userInputPassword.equals(myPassword)) {
                System.out.println("Password correctly");
                break;
            } else {
                userInput++;
                System.out.println("Password incorrect");
            }
        } while (userInput < 3);
        if (userInput == 3) {
            System.out.println("You have inputted incorrectly more than 3 times. The program automatically exits");
        }
    }
}
