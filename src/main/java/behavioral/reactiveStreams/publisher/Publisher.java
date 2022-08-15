package behavioral.reactiveStreams.publisher;

import behavioral.reactiveStreams.subscriber.Subscriber;

public interface Publisher<T> {
    void subscribe(Subscriber<? super T> s);
}
