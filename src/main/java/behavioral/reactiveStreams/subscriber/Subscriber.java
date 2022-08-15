package behavioral.reactiveStreams.subscriber;

import behavioral.reactiveStreams.subscription.Subscription;

public interface Subscriber<T> {
    void onSubscribe(Subscription subscription);
    void onNext(T next);
    void onError(Throwable throwable);
    void onComplete();
}
