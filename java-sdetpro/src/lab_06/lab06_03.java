package lab_06;

public class lab06_03 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String myNumber = "";
        char[] charArr = myStr.toCharArray();
        for (char character : charArr) {
            if (Character.isDigit(character)) {
                myNumber = myNumber + character;
            }
        }
        System.out.println(myNumber);
    }
}
