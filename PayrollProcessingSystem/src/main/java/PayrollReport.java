import java.util.List;

public class PayrollReport {

    public void displayReport(List<Employee> employees) {

        System.out.println("\n========== PAYROLL REPORT ==========");

        for (Employee employee : employees) {

            System.out.println(
                    employee.getEmployeeId()
                            + " | "
                            + employee.getEmployeeName()
                            + " | Gross: €"
                            + employee.calculateGrossSalary()
                            + " | Deduction: €"
                            + employee.calculateDeduction()
                            + " | Net: €"
                            + employee.calculateNetSalary()
            );
        }

        System.out.println("====================================");
    }
}