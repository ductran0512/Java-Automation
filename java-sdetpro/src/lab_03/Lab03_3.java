package lab_03;

public class Lab03_3 {
    public static void main(String[] args) {
        int[] myArray = new int[]{12, 34, 1, 16, 28};
        for (int index1 = 0; index1 < myArray.length -1; index1++) {
            for (int index2 = index1 + 1; index2 < myArray.length ; index2++) {
                if (myArray[index1] > myArray[index2]) {
                    int temp = myArray[index1];
                    myArray[index1] = myArray[index2];
                    myArray[index2] = temp;
                }
            }
        }
        for (int index = 0; index < myArray.length; index++) {
            System.out.printf("Number from min to max %d \n", myArray[index]);
        }
    }
}
