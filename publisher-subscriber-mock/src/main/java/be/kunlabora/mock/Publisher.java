package be.kunlabora.mock;

public class Publisher {
    private Subscriber subscriber;

    public void setSubscriber(final Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public void publish(final String message) {
        subscriber.receive(message);
    }
}