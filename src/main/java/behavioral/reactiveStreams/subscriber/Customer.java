package behavioral.reactiveStreams.subscriber;

import behavioral.reactiveStreams.News;
import behavioral.reactiveStreams.subscription.GuardianApp;
import behavioral.reactiveStreams.subscription.Subscription;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Customer implements Subscriber<News>{
    private final GuardianApp subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("New Subscription is successful!!!");
        subscription.request(10);
    }

    @Override
    public void onNext(News next) {

    }

    @Override
    public void onError(Throwable throwable) {
        subscription.cancel();
    }

    @Override
    public void onComplete() {

    }
}
