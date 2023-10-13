package lab_06;

public class lab06_01 {
    public static void main(String[] args) {
        String stringHoursAndMins = "2hrs and 5minutes";
        String[] splitHoursAndMins = stringHoursAndMins.split(" and ");
        String stringHoursNumStr = splitHoursAndMins[0].replaceAll("[^0-9]","");
        String stringMinsNumStr = splitHoursAndMins[1].replaceAll("[^0-9]","");
        int hoursNum = Integer.parseInt(stringHoursNumStr);
        int minsNum = Integer.parseInt(stringMinsNumStr);
        System.out.printf("Total minutes is: %d",(hoursNum * 60) + minsNum);
    }
}
