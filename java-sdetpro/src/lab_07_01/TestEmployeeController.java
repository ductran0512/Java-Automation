package lab_07_01;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee();
        Employee contractor = new ContractorEmployee();
        int totalSalary = EmployeeController.totalSalary(Arrays.asList(fte,fte,fte,contractor,contractor));
        System.out.printf("Total salary is %d ",totalSalary);
    }
}
