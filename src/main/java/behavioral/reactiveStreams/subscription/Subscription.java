package behavioral.reactiveStreams.subscription;

public interface Subscription<T> {
    void request(long n);
    void cancel();
}
