package sda.patterns.behavioral;

public class EmailNewsProvider extends NewsProvider {

    private String email;

    public EmailNewsProvider(String email) {
        this.email = email;
    }

    @Override
    public boolean authorize() {
        return email.contains("@");
    }

    @Override
    public boolean endConnection() {
        return true;
    }
}
