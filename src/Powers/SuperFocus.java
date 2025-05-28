package Powers;

import Student.Student;

public class SuperFocus extends StudentDecorator {
    public SuperFocus(Student student) {
        super(student);
    }

    @Override
    public String getAbilities() {
        return super.getAbilities() + ", Свръхконцентрация";
    }
}