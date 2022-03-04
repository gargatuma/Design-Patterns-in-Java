package structural.bridge;

public class HandlerServiceCallbacks implements HandlerService{

    @Override
    public void handleUpdate(String update) {
        System.out.println("I work only with callback");
        System.out.println(update);
    }
}
