package model;

import users.StudeGroup;
import users.Student;
import users.Teacher;

import java.io.IOException;
import java.util.List;

/**
 * Interface segregation principle (принцип разделения интерфейсов)
 * В данной задаче он отсутствует, так как есть отдельный класс с логикой,
 * который имплементирует этот интерфейс.
 * Но если расширять функционал далее, то, например, для учителя был бы интерфейс
 * с возможностью формировать расписание, выставлять оценки в группе и т.д.,
 * а учеников получение расписания, сдачи д/з в формате файла и т.д.
 */
public interface StudeGroupService {

    public StudeGroup createStudeGroup(Teacher teacher, List<Student> students);

    public List<Teacher> getTeachers() throws IOException;

    public List<Student> getStudents() throws IOException;

    public Teacher getTeacher() throws IOException;


}
