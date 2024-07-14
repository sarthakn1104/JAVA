import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Task {
    int id;
    String name;
    String description;

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

public class Task3 {
    private List<Task> tasks;

    public Task3() {
        this.tasks = new ArrayList<>();
    }

    public void createTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter task name: ");
        String name = scanner.next();
        System.out.print("Enter task description: ");
        String description = scanner.next();
        Task newTask = new Task(id, name, description);
        tasks.add(newTask);
        System.out.println("Task created successfully!");
    }

    public void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println("Task ID: " + task.id + ", Name: " + task.name + ", Description: " + task.description);
            }
        }
    }

    public void updateTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task ID to update: ");
        int id = scanner.nextInt();
        for (Task task : tasks) {
            if (task.id == id) {
                System.out.print("Enter new task name: ");
                task.name = scanner.next();
                System.out.print("Enter new task description: ");
                task.description = scanner.next();
                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task ID to delete: ");
        int id = scanner.nextInt();
        for (Task task : tasks) {
            if (task.id == id) {
                tasks.remove(task);
                System.out.println("Task deleted successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public static void main(String[] args) {
        Task3 manager = new Task3();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create Task");
            System.out.println("2. Read Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.createTask();
                    break;
                case 2:
                    manager.readTasks();
                    break;
                case 3:
                    manager.updateTask();
                    break;
                case 4:
                    manager.deleteTask();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Developed By Sarthak");
        }
    }
}