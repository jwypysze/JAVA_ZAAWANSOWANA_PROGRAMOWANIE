package sda.solid.isp;

import java.util.ArrayList;
import java.util.List;

public class FullMessageService implements MessageService {

    private List<String> messages;

    public FullMessageService() {
        this.messages = new ArrayList<>();
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Adding '" + message + "' to messages");
        messages.add(message);
    }

    @Override
    public List<String> readMessages() {
        System.out.println("Returning all messages");
        return messages;
    }
}
