package behavioral.chainOfResponsibility;

public class SecurityCheckUserExist implements SecurityCheck{
    protected SecurityCheck nextHandler;

    public SecurityCheckUserExist(SecurityCheck nextHandler) {
        this.nextHandler = nextHandler;
    }


    @Override
    public void handle(String request) throws ClassNotFoundException{
        if (request.contains("user")) {
            nextHandler.handle(request);
            return;
        }
        throw new ClassNotFoundException();
    }
}
