package lab_02;

import java.util.Scanner;

public class Lab02_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight (kg): ");
        float inputWeight = scanner.nextFloat();
        System.out.println("Please input your height (m): ");
        float inputHeight = scanner.nextFloat();
        float calculationBMI = inputWeight / (inputHeight * 2);
        System.out.printf("Your BMI is %.2f\n", calculationBMI);
        if (calculationBMI <= 18.5) {
            System.out.println("Underweight.");
            System.out.printf("You should increase your BMI about %.2f\n", 18.5 - calculationBMI);
        } else if (calculationBMI < 24.9) {
            System.out.println("Normal weight.");
            System.out.println("You should keep it like this.");
        } else if (calculationBMI < 29.9) {
            System.out.println("Overweight");
            System.out.printf("You should decrease your BMI about %.2f\n", calculationBMI - 18.5);
        } else {
            System.out.println("Obesity");
            System.out.printf("You should decrease more your BMI about %.2f\n", calculationBMI - 18.5);
        }
    }
}
