package be.kunlabora.transport;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TrainTest {

    @Test
    public void customerSatisfaction() {
        assertThatThrownBy(() -> new Train().customerSatisfaction())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("We never run late!");
    }
}