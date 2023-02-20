package sda.solid.dip.fix;

public class TaskService {

    private Repository repository;

    public TaskService(Repository repository) {
        this.repository = repository;
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }
}
