package be.kunlabora.refactoring.decomposeconditional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JULY;
import static java.util.Calendar.JUNE;
import static java.util.Calendar.MARCH;
import static java.util.Calendar.MAY;
import static java.util.Calendar.NOVEMBER;
import static java.util.Calendar.OCTOBER;
import static java.util.Calendar.SEPTEMBER;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class TireChangeSummerTest {

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
                {MARCH},
                {APRIL},
                {MAY},
                {JUNE},
                {JULY},
                {AUGUST},
                {SEPTEMBER},
                {OCTOBER},
                {NOVEMBER}

        });
    }

    private int month;

    public TireChangeSummerTest(int month) {
        this.month = month;
    }

    @Test
    public void summerCharge() {
        assertThat(QUANTITY * SUMMERRATE).isEqualTo(tireChange.charge(month));
    }
}