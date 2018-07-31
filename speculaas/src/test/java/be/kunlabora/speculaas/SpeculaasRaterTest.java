package be.kunlabora.speculaas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SpeculaasRaterTest {
    @Test
    public void rateSpeculaas() {
        assertThatThrownBy(() -> new SpeculaasRater().rateSpeculaas(null))
                .isInstanceOf(UnsupportedOperationException.class)
                .hasMessage("I know nothing");
    }
}