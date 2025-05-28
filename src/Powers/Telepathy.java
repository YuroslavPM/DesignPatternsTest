package Powers;

import Student.Student;

public class Telepathy extends StudentDecorator {
    public Telepathy(Student student) {
        super(student);
    }

    @Override
    public String getAbilities() {
        return super.getAbilities() + ", Телепатия";
    }
}
