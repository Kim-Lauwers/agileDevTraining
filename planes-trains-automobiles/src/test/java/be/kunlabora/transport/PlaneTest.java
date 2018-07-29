package be.kunlabora.transport;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlaneTest {
    private Plane plane;

    @Before
    public void setUp() {
        plane = new Plane();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void delay_HoursDelayedIsSet() {
        plane.delay(2);

        assertThat(plane.getHoursDelayed()).isEqualTo(2);
    }

    @Test
    public void customerSatisfaction() {
        assertThatThrownBy(() -> plane.customerSatisfaction())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("We never run late!");
    }
}