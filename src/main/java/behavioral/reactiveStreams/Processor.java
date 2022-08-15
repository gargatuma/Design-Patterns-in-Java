package behavioral.reactiveStreams;

import behavioral.reactiveStreams.publisher.Publisher;
import behavioral.reactiveStreams.subscriber.Subscriber;

public interface Processor<T, R> extends Publisher<T>, Subscriber<R> {
}
