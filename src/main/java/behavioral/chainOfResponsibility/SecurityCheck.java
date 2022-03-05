package behavioral.chainOfResponsibility;

public interface SecurityCheck {
    void handle(String request) throws ClassNotFoundException;
}
