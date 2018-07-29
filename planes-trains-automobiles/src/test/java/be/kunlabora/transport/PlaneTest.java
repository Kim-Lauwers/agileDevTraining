package be.kunlabora.transport;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlaneTest {


    @Test
    public void customerSatisfaction() {
        assertThatThrownBy(() -> new Plane().customerSatisfaction())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("We never run late!");
    }
}