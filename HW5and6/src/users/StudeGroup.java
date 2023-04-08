package users;

import java.util.List;

public class StudeGroup {
    public int groupID;
    public Teacher teacher;
    public List<Student> students;

    public StudeGroup() {
    }

    ;

    public StudeGroup(int groupID, Teacher teacher, List<Student> students) {
        this.groupID = groupID;
        this.teacher = teacher;
        this.students = students;
    }
}
