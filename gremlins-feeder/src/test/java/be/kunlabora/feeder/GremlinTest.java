package be.kunlabora.feeder;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.AUGUST;
import static org.assertj.core.api.Assertions.assertThat;

public class GremlinTest {
    private Gremlin gremlin;

    @Before
    public void setup() {
        gremlin = new Gremlin();
    }

    @Test
    public void canEat_givenDayTime_thenCanEat() {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(2018, AUGUST, 12, 16, 1);
        final Date eatingTime = calendar.getTime();

        assertThat(gremlin.canEat(eatingTime)).isTrue();
    }

    @Test
    public void canEat_givenNightTime_thenCannotEat() {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(2018, AUGUST, 12, 1, 1);
        final Date eatingTime = calendar.getTime();

        assertThat(gremlin.canEat(eatingTime)).isFalse();
    }
}