package abstraction;

public class EmailService {

    // The only method the user needs to know about (Public)
    public void sendEmail(String to, String message) {
        connectToServer();
        authenticate();
        System.out.println("Sending email to " + to + ": " + message);
        disconnect();
    }

    // Complex details hidden from the user (Private)
    private void connectToServer() {
        System.out.println("Connecting to email server...");
    }

    private void authenticate() {
        System.out.println("Authenticating credentials...");
    }

    private void disconnect() {
        System.out.println("Disconnecting from server...");
    }
}
