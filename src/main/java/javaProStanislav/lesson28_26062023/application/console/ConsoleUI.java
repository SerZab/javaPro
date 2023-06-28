package javaProStanislav.lesson28_26062023.application.console;

import javaProStanislav.lesson28_26062023.application.domain.Task;
import javaProStanislav.lesson28_26062023.application.service.TaskService;

import java.util.Scanner;

public class ConsoleUI {

    private TaskService service = new TaskService();

    public void execute(){
        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("1. Create task");
                System.out.println("2. Find all task");
                System.out.println("3. Find task by ID");
                System.out.println("4. Exit");

                int userInput = scanner.nextInt();

                switch (userInput) {
                    case 1:
                        long newID = createTask();
                        System.out.println("Create success! New record id: " + newID);
                        break;
                    case 2:
                        System.out.println(service.findAll());
                        break;
                    case 3:
                        Task findTask = findTask();
                        if (findTask != null) {
                            System.out.println("Find record: " + findTask);
                        } else {
                            System.out.println("Record not found!");
                        }
                        break;
                    case 4:
                        return;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private long createTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter task name:");
        String name = scanner.nextLine();
        System.out.println("Please, enter task description:");
        String description = scanner.nextLine();

        Task newTask = new Task();
        newTask.setName(name);
        newTask.setDescription(description);

        return service.saveTask(newTask);

    }

    private Task findTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter task id:");
        Long id = scanner.nextLong();

        return service.findById(id);
    }


}