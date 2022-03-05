package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        SecurityCheck lastStep = new SecurityCheckHasAccess();
        SecurityCheck secondStep = new SecurityCheckIsAdmin(lastStep);
        SecurityCheck firstStep = new SecurityCheckUserExist(secondStep);

        String successRequest = "user admin access";
        String firstStepFail = "admin access";
        String secondStepFail = "user access";
        String lastStepFail = "user admin";

        //Change passed Request String to use when request fails
        firstStep.handle(successRequest);
    }
}
