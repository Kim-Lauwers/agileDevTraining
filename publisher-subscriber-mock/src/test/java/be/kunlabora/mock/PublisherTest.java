package be.kunlabora.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PublisherTest {
    private static final String MESSAGE = "This is awesome";
    private Publisher publisher;

    @Before
    public void setUp() {
        publisher = new Publisher();
    }

    @Test
    public void oneSubscriberReceivesAMessage() {
    }
}