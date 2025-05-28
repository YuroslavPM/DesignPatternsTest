package Task;

import Student.Student;

public class TaskFactory {
    public static Task createTask(Student student) {
        switch (student.getType()) {
            case "Вундеркинд": return new FunTask();
            case "Фитнес маниак": return new NotClearTask();
            case "Калитко": return new EasyTask();
            default: return new EasyTask();
        }
    }
}
