package be.kunlabora.transport;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TrainTest {
    private Train train;

    @Before
    public void setUp() {
        train = new Train();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void delay_HoursDelayedIsSet() {
        train.delay(2);

        assertThat(train.getHoursDelayed()).isEqualTo(2);
    }

    @Test
    public void customerSatisfaction() {
        assertThatThrownBy(() -> train.customerSatisfaction())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("We never run late!");
    }
}