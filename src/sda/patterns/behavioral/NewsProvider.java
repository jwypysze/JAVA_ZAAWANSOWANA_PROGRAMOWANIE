package sda.patterns.behavioral;

public abstract class NewsProvider {
    private String message;

    //metoda do implementacji
    public abstract boolean authorize();

    //metoda - część algorytmu, już zaimplementowana, niezmienna
    private final boolean sendMessage() {
        System.out.println("Wysyłanie wiadomości: " + message);
        return true;
    }

    //metoda do implementacji
    public abstract boolean endConnection();

    //metoda z algorytmem - niezmienna
    public final void provideNews() {
        if(authorize()) {
            sendMessage();
            endConnection();
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
