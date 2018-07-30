package be.kunlabora.refactoring.introduceparameterobject;

import java.util.Date;

public class Entry {
    private final Date chargeDate;
    private final double value;

    Entry(final double value, final Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    Date getDate() {
        return chargeDate;
    }

    double getValue() {
        return value;
    }
}
