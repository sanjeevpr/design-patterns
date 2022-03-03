package Observer.listeners;

public class EmailAlertsListener implements EventListener {

    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String email) {
        System.out.println("Updated " + email + " from EmailAlertsListener");
    }
}
