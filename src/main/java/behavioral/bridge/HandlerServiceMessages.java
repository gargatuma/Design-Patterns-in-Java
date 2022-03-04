package behavioral.bridge;

public class HandlerServiceMessages implements HandlerService{

    @Override
    public void handleUpdate(String update) {
        System.out.println("I work only with messages");
        System.out.println(update);
    }
}
