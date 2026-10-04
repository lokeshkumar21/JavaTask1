public class Main {

    public static void main(String[] args) {

        Employee employee;

        employee = new PermanentEmployee(
                "EMP101",
                "Arun",
                3000,
                500,
                200
        );

        System.out.println("Permanent Employee Gross: €"
                + employee.calculateGrossSalary());


        employee = new ContractEmployee(
                "EMP102",
                "Bala",
                3000,
                400
        );

        System.out.println("Contract Employee Gross: €"
                + employee.calculateGrossSalary());


        employee = new Manager(
                "EMP103",
                "Kumar",
                5000,
                800,
                300,
                1000
        );

        System.out.println("Manager Gross: €"
                + employee.calculateGrossSalary());
    }
}



//public class Main {
//
//    public static void main(String[] args) {
//
//        Employee employee = new PermanentEmployee(
//                "EMP101",
//                "Arun",
//                3000,
//                500,
//                200
//        );
//
//        Payroll payroll = new Payroll(employee);
//
//        payroll.processPayroll();
//
//        payroll.generatePayslip();
//    }
//}
