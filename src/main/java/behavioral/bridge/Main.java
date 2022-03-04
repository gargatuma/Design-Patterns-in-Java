package behavioral.bridge;

public class Main {
    public static void main(String[] args) {
        HandlerService serviceCallbacks = new HandlerServiceCallbacks();
        HandlerService serviceMessages = new HandlerServiceMessages();
        String updateWithMessage = "this is update with message only";
        String updateWithCallbakc = "this is update with callback only";

        Handler handler = new QueryHandler(serviceCallbacks);
        handler.handleUpdate(updateWithCallbakc, true, false, true);

        handler.setService(serviceMessages);
        handler.handleUpdate(updateWithMessage, true, true, false);

    }
}
