import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "3000, 500, 200, 3700",
            "4000, 600, 300, 4900",
            "5000, 1000, 500, 6500"
    })
    void shouldCalculatePermanentEmployeeGrossSalary(
            double basicSalary,
            double houseAllowance,
            double transportAllowance,
            double expectedGrossSalary) {

        PermanentEmployee employee =
                new PermanentEmployee(
                        "EMP001",
                        "Test Employee",
                        basicSalary,
                        houseAllowance,
                        transportAllowance
                );

        assertEquals(
                expectedGrossSalary,
                employee.calculateGrossSalary()
        );
    }
}
