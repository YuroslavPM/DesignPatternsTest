package Powers;

import Arrival.ArrivalStrategy;
import Student.Student;

public abstract class StudentDecorator extends Student {
    protected Student decoratedStudent;

    public StudentDecorator(Student decoratedStudent) {
        this.decoratedStudent = decoratedStudent;
    }

    @Override
    public String getType() {
        return decoratedStudent.getType();
    }

    @Override
    public void setArrivalStrategy(ArrivalStrategy strategy) {
        decoratedStudent.setArrivalStrategy(strategy);
    }

    @Override
    public void arriveAtUniversity() {
        decoratedStudent.arriveAtUniversity();
    }

    @Override
    public String getAbilities() {
        return decoratedStudent.getAbilities();
    }
}
