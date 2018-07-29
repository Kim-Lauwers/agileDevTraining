package be.kunlabora.refactoring.decomposeconditional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.JANUARY;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class TireChangeWinterTest {

    private static final int SUMMERRATE = 20;
    private static final int WINTERSERVICECHARGE = 15;
    private static final int WINTERRATE = 10;
    private static final int QUANTITY = 2;
    private TireChange tireChange;

    @Before
    public void setUp() {
        tireChange = new TireChange(QUANTITY, WINTERRATE, WINTERSERVICECHARGE, SUMMERRATE);
    }

    @Parameterized.Parameters()
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {DECEMBER},
                {JANUARY},
                {FEBRUARY}

        });
    }

    private int month;

    public TireChangeWinterTest(int month) {
        this.month = month;
    }

    @Test
    public void winterCharge() {
        assertThat(QUANTITY * WINTERRATE + WINTERSERVICECHARGE).isEqualTo(tireChange.charge(month));
    }
}