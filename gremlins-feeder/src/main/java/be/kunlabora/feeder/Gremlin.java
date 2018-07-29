package be.kunlabora.feeder;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.HOUR_OF_DAY;

public class Gremlin {
        public boolean canEat(final Date eatingTime) {
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(eatingTime);
            final int eatingHour = calendar.get(HOUR_OF_DAY);
            return eatingHour > 7;
        }
}