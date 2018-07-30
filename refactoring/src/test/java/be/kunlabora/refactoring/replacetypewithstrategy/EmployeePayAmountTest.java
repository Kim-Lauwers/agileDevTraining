package be.kunlabora.refactoring.replacetypewithstrategy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeePayAmountTest {

    private static final int BONUS = 560;
    private static final int COMMISION = 200;
    private static final int MONTHLY_SALARY = 3500;

    @Test
    public void engineerPayAmountIsMonthlySalary() {
        final Employee employee = createEmployee(Employee.ENGINEER);

        final int result = employee.payAmount();
        assertThat(MONTHLY_SALARY).isEqualTo(result);
    }

    @Test
    public void salesmanPayAmountIsMonthlySalaryPlusCommision() {
        final Employee employee = createEmployee(Employee.SALESMAN);

        final int result = employee.payAmount();
        assertThat(MONTHLY_SALARY + COMMISION).isEqualTo(result);
    }

    @Test
    public void managerPayAmountIsMonthlySalaryPlusBonus() {
        final Employee employee = createEmployee(Employee.MANAGER);

        final int result = employee.payAmount();
        assertThat(MONTHLY_SALARY + BONUS).isEqualTo(result);
    }

    @Test
    public void engineerBusinessCardPaperQuality() {
        final Employee employee = createEmployee(Employee.ENGINEER);

        final String result = employee.businessCardPaperQuality();
        assertThat("recycled").isEqualTo(result);
    }

    @Test
    public void salesmanBusinessCardPaperQuality() {
        final Employee employee = createEmployee(Employee.SALESMAN);

        final String result = employee.businessCardPaperQuality();
        assertThat("high quality white").isEqualTo(result);
    }

    @Test
    public void managerBusinessCardPaperQuality() {
        final Employee employee = createEmployee(Employee.MANAGER);

        final String result = employee.businessCardPaperQuality();
        assertThat("superb quality with shiny finish").isEqualTo(result);
    }

    private Employee createEmployee(final int employeeType) {
        final Employee employee = new Employee(employeeType);
        employee.setMonthlySalary(MONTHLY_SALARY);
        employee.setCommision(COMMISION);
        employee.setBonus(BONUS);
        return employee;
    }
}