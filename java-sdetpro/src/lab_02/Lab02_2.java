package lab_02;

import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input any integer number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 2 == 0) {
            System.out.printf("Number %d is an even number.", inputNumber);
        } else {
            System.out.printf("Number %d is an odd number.", inputNumber);
        }
    }
}
