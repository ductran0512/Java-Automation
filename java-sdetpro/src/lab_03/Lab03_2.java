package lab_03;

public class Lab03_2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int min = myArray[0];
        int max = myArray[0];
        for (int index = 1; index < myArray.length; index++) {
            if (myArray[index] < min) {
                min = myArray[index];
            } else if (myArray[index] > max) {
                max = myArray[index];
            }
        }
        System.out.printf("Minimum is: %d\n", min);
        System.out.printf("Maximum is: %d", max);
    }
}
