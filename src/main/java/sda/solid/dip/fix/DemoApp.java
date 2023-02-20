package sda.solid.dip.fix;

public class DemoApp {

    public static void main(String[] args) {
        Repository repository = new FileRepository();

        TaskService service = new TaskService(repository);

        service.addTask("First");
        service.addTask("Second");
        service.removeTask("First");
    }
}
