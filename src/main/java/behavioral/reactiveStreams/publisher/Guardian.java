package behavioral.reactiveStreams.publisher;

import behavioral.reactiveStreams.News;
import behavioral.reactiveStreams.subscriber.Subscriber;
import behavioral.reactiveStreams.subscription.GuardianApp;

public class Guardian implements Publisher<News> {

    @Override
    public void subscribe(Subscriber<? super News> s) {
        s.onSubscribe(new GuardianApp());
    }
}
