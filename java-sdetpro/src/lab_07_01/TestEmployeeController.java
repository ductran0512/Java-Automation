package lab_07_01;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        Employee fte1 = new FullTimeEmployee();
        Employee fte2 = new FullTimeEmployee();
        Employee fte3 = new FullTimeEmployee();
        Employee contractor1 = new ContractorEmployee();
        Employee contractor2 = new ContractorEmployee();
        int totalSalary = EmployeeController.totalSalary(Arrays.asList(fte1, fte2, fte3, contractor1, contractor2));
        System.out.printf("Total salary is %d ", totalSalary);
    }
}
