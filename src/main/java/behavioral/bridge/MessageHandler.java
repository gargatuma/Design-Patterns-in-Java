package behavioral.bridge;

public class MessageHandler extends Handler{

    public MessageHandler(HandlerService service) {
        super(service);
    }

    @Override
    public void handleUpdate(String update, boolean isAdmin, boolean hasMessage, boolean hasQuery) {
        if (isAdmin && hasMessage) {
            service.handleUpdate("Message only: " + update);
        }
    }
}
