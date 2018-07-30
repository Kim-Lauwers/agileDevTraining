package be.kunlabora.refactoring.introduceparameterobject;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Account {
    private Set<Entry> entries = new HashSet<Entry>();

    Account() {
    }

    double getFlowBetween(final Date start, final Date end) {
        double result = 0;
        for (final Iterator<Entry> iter = entries.iterator(); iter.hasNext(); ) {
            final Entry each = iter.next();
            final Date entryDate = each.getDate();
            if (entryDate.equals(start)
                    || entryDate.equals(end)
                    || (entryDate.after(start) && entryDate.before(end))) {
                result += each.getValue();
            }
        }
        return result;
    }

    Set<Entry> getEntries() {
        return entries;
    }

    void setEntries(final Set<Entry> entries) {
        this.entries = entries;
    }
}