package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            myArrayList.add(randomNumber);
        }
        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            int userOption = getMenu();
            switch (userOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    printAllNumber(myArrayList);
                    break;
                case 2:
                    printMaximumValue(myArrayList);
                    break;
                case 3:
                    printMinimumValue(myArrayList);
                    break;
                case 4:
                    searchNumber(myArrayList);
                    break;
                default:
                    System.out.println("Invalid option, please choose option again");
                    break;
            }
        }
        System.out.println("Goodbye!See you again");
    }


    public static void printAllNumber(List<Integer> myArrayList) {
        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index));
        }
    }

    public static void printMaximumValue(List<Integer> myArrayList) {
        int max = myArrayList.get(0);
        for (int index = 0; index < myArrayList.size(); index++) {
            if (myArrayList.get(index) > max) {
                max = myArrayList.get(index);
            }
        }
        System.out.println("Maximum value in the ArrayList is: " + max);
    }

    public static void printMinimumValue(List<Integer> myArrayList) {
        int min = myArrayList.get(0);
        for (int index = 0; index < myArrayList.size(); index++) {
            if (myArrayList.get(index) < min) {
                min = myArrayList.get(index);
            }
        }
        System.out.println("Minimum value in the ArrayList is: " + min);
    }

    public static void searchNumber(List<Integer> myArrayList) {
        System.out.print("Please input your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (myArrayList.contains(number)) {
            System.out.println("Your number is: " + number);
            System.out.println("Index number is: "+ myArrayList.indexOf(number));
        } else {
            System.out.println("The number you just entered is not in the ArrayList");
        }

    }

    public static void printMenu() {
        System.out.println("====MENU====");
        System.out.println("0. Exit");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
    }

    public static int getMenu() {
        System.out.println("Please input your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}


