package Powers;

import Student.Student;

public class FastWriter extends StudentDecorator {
    public FastWriter(Student student) {
        super(student);
    }

    @Override
    public String getAbilities() {
        return super.getAbilities() + ", Бързопис";
    }
}