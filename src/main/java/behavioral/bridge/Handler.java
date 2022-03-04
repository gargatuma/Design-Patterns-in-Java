package behavioral.bridge;

public abstract class Handler {
    protected HandlerService service;

    public Handler(HandlerService service) {
        this.service = service;
    }

    protected abstract void handleUpdate(String update, boolean isAdmin, boolean hasMessage, boolean hasCallback);

    protected void setService(HandlerService service) {
        this.service = service;
    }
}
