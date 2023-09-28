package lab_03;

import java.sql.SQLOutput;

public class Lab03_4 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{1, 12, 16, 28, 34};
        int[] myArray2 = new int[]{1, 13, 16, 27, 99};
        int[] mergeArray = new int[myArray1.length + myArray2.length];
        for (int index = 0; index < myArray1.length; index++) {
            mergeArray[index] = myArray1[index];
        }
        for (int index = 0; index < myArray2.length; index++) {
            mergeArray[myArray1.length + index] = myArray2[index];
        }
        for (int index1 = 0; index1 < mergeArray.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 < mergeArray.length; index2++) {
                if (mergeArray[index1] > mergeArray[index2]) {
                    int temp = mergeArray[index1];
                    mergeArray[index1] = mergeArray[index2];
                    mergeArray[index2] = temp;
                }
            }
        }
        for (int index = 0; index < mergeArray.length; index++) {
            System.out.printf("%d\t", mergeArray[index]);
        }
    }
}
