package se.edu.inclass;

import se.edu.inclass.data.DataManager;
import se.edu.inclass.task.Deadline;
import se.edu.inclass.task.Task;
import se.edu.inclass.task.TaskNameComparator;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    private TaskNameComparator taskNameComparator;

    public static void main(String[] args) {
        DataManager dm = new DataManager("./data/data.txt");
        ArrayList<Task> tasksData = dm.loadData();


        System.out.println("Printing deadlines");
        printDeadlines(tasksData);

        System.out.println("Total number of deadlines: " + countDeadlines(tasksData));
        printDeadlinesUsingStreams(tasksData);

<<<<<<< HEAD
        System.out.println(filterByString(tasksData, "11"));
=======
        printDataUsingStreams(tasksData);
        printDeadlinesUsingStreams(tasksData);
        System.out.println(getNumberOfDeadlines(tasksData));
>>>>>>> master
    }

    private static int countDeadlines(ArrayList<Task> tasksData) {
        int count = 0;
        for (Task t : tasksData) {
            if (t instanceof Deadline) {
                count++;
            }
        }
        return count;
    }

    public static void printData(ArrayList<Task> tasksData) {
        for (Task t : tasksData) {
            System.out.println(t);
        }
    }

<<<<<<< HEAD
    public static void printDeadlinesUsingStreams(ArrayList<Task> tasksData) {
        tasksData.stream()
                .filter((s) -> s instanceof Deadline)
                .sorted((a, b) -> a.getDescription().toLowerCase().compareTo(b.getDescription().toLowerCase()))
                .forEach(System.out::println);
    }

    public static ArrayList<Task> filterByString(ArrayList<Task> tasksData, String filterString) {
        ArrayList<Task> filteredTaskList;
        filteredTaskList = (ArrayList<Task>) tasksData.stream()
                .filter((s) -> s.getDescription().contains(filterString))
                .collect(Collectors.toList());
        return filteredTaskList;
=======
    public static void printDataUsingStreams(ArrayList<Task> tasksData) {
        System.out.println("Printing with Streams");
        tasksData.stream()
                .forEach(System.out::println);
    }

    public static void printDeadlinesUsingStreams(ArrayList<Task> tasksData) {
        System.out.println("Printing deadlines with Streams");
        tasksData.stream()
                .filter((t) -> t instanceof Deadline)
                .forEach(System.out::println);
    }

    public static int getNumberOfDeadlines(ArrayList<Task> tasksData) {
        System.out.print("Number of deadlines: ");
        int number;
        number = (int) tasksData.stream()
                .filter((t) -> t instanceof Deadline)
                .count();
        return number;
>>>>>>> master
    }

    public static void printDeadlines(ArrayList<Task> tasksData) {
        for (Task t : tasksData) {
            if (t instanceof Deadline) {
                System.out.println(t);
            }
        }
    }
}
