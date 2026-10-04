import java.util.List;

public class PayrollService {

    public void processPayroll(List<Employee> employees) {

        for (Employee employee : employees) {

            System.out.println("\n-----------------------------");

            System.out.println("Employee: "
                    + employee.getEmployeeName());

            System.out.println("Gross Salary: €"
                    + employee.calculateGrossSalary());

            System.out.println("Deduction: €"
                    + employee.calculateDeduction());

            System.out.println("Net Salary: €"
                    + employee.calculateNetSalary());
        }
    }
}