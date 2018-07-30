package be.kunlabora.refactoring.introduceparameterobject;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlowBetweenTest {
    private Account account;

    @Before
    public void setUp() {
        account = new Account();
    }

    @Test
    public void beforeIntervalIsExcluded() {
        final Entry beforeInterval = new Entry(10.0, createDate(1, 3));
        account.getEntries().add(beforeInterval);

        final double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void onStartOfIntervalIsIncluded() {
        final Entry startOfInterval = new Entry(10.0, createDate(1, 4));
        account.getEntries().add(startOfInterval);

        final double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(10.0, result, 0.0);
    }

    @Test
    public void middleOfIntervalIsIncluded() {
        final Entry middleOfInterval = new Entry(10.0, createDate(2, 2));
        account.getEntries().add(middleOfInterval);

        final double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(10.0, result, 0.0);
    }

    @Test
    public void onEndOfIntervalIsIncluded() {
        final Entry endOfInterval = new Entry(10.0, createDate(2, 4));
        account.getEntries().add(endOfInterval);

        final double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(10.0, result, 0.0);
    }

    @Test
    public void afterIntervalIsExcluded() {
        final Entry before = new Entry(10.0, createDate(2, 5));
        account.getEntries().add(before);

        final double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void multipleEntriesInIntervalAreAccumulated() {
        final Entry middleOfInterval = new Entry(10.0, createDate(2, 2));
        final Entry endOfInterval = new Entry(10.0, createDate(2, 4));
        account.getEntries().add(middleOfInterval);
        account.getEntries().add(endOfInterval);

        final double result = account.getFlowBetween(createDate(1, 4), createDate(2, 4));
        assertEquals(20.0, result, 0.0);
    }

    private Date createDate(final int month, final int day) {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(2018, month, day, 0, 0, 0);
        return calendar.getTime();
    }
}