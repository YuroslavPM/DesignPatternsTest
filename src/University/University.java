package University;

import Student.Student;
import Task.Task;
import Task.TaskFactory;

public class University {
    private static University instance;

    private University() {
        System.out.println("Университетът е създаден.");
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public void conductExam(Student student) {
        Task task = TaskFactory.createTask(student);
        System.out.println(student.getType() + " получава задача: " + task.getDescription());
        System.out.println("Умения: " + student.getAbilities());
    }
}