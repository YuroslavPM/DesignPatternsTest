import Arrival.TeleportArrival;
import Powers.SuperFocus;
import Powers.Telepathy;
import Student.FitnessStudent;
import Student.Student;
import University.University;

public class Main {
    public static void main(String[] args) {
        University uni = University.getInstance();

        Student student = new FitnessStudent();
        student.setArrivalStrategy(new TeleportArrival());
        student.arriveAtUniversity();

        student = new SuperFocus(student);
        student = new Telepathy(student);

        uni.conductExam(student);
    }
}
