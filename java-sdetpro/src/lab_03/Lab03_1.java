package lab_03;

public class Lab03_1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] % 2 == 0) {
                evenNumbers++;
            }else {
                oddNumbers++;
            }
        }
        System.out.printf("Even Numbers is: %d\n", evenNumbers);
        System.out.printf("Odd Numbers is: %d", oddNumbers);
    }
}

