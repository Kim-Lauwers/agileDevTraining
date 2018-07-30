package be.kunlabora.refactoring.renamemethod;

import org.junit.Before;
import org.junit.Test;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    private final String firstName = randomAlphabetic(5);
    private final String secondName = randomAlphabetic(3);
    private Customer customer;

    @Before
    public void setup() {
        customer = new Customer(firstName, secondName);
    }

    @Test
    public void test_FN() {
        assertThat(customer.getFN()).isEqualTo(firstName);
    }

    @Test
    public void test_SN() {
        assertThat(customer.getSN()).isEqualTo(secondName);
    }
}