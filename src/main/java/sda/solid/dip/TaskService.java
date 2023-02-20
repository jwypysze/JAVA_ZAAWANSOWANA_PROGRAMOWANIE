package sda.solid.dip;

/**
 * To co widać, czyli generowanie jednego obiektu wewnątrz drugiego
 * to tzw. High Coupling - silne wiązanie, czyli mamy dwa obiekty
 * z których jeden mocno zależy od drugiego i "umie" go utworzyć,
 * co w sumie łamie SRP :) bo powinien zająć się swoimi zadaniami
 * a nie tworzeniem innych obiektów
 */
public class TaskService {
    private FileRepository repository = new FileRepository();

    public void addTask(String filename) {
        repository.saveTask(filename);
    }

    public void removeTask(String filename) {
        repository.deleteTask(filename);
    }
}
