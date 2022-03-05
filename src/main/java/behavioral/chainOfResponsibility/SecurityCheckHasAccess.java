package behavioral.chainOfResponsibility;

public class SecurityCheckHasAccess implements SecurityCheck{

    @Override
    public void handle(String request) throws ClassNotFoundException {
        if (request.contains("access")) {
            System.out.println("Success!");
            return;
        }
        throw new ClassNotFoundException();
    }
}
