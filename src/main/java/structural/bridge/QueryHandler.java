package structural.bridge;

public class QueryHandler extends Handler{
    public QueryHandler(HandlerService service) {
        super(service);
    }

    @Override
    public void handleUpdate(String update, boolean isAdmin, boolean hasMessage, boolean hasCallback) {
       if (isAdmin && hasCallback) {
           service.handleUpdate("CallBacks only: " + update);
       }
    }
}
