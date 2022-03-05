package behavioral.chainOfResponsibility;

public class SecurityCheckIsAdmin implements SecurityCheck{
    protected SecurityCheck nextHandler;

    public SecurityCheckIsAdmin(SecurityCheck nextHandler) {
        this.nextHandler = nextHandler;
    }


    @Override
    public void handle(String request) throws ClassNotFoundException {
        if (request.contains("admin")) {
            nextHandler.handle(request);
            return;
        }
        throw new ClassNotFoundException();
    }
}
