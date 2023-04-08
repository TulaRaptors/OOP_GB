package view;

import users.StudeGroup;
import users.Student;
import users.Teacher;

import java.util.List;

public class View{
    public void Menu(){
        System.out.println("Основное меню:");
        System.out.println("1. Просмотр учителей");
        System.out.println("2. Просмотр студентов");
        System.out.println("3. Формирование учебной группы");
    }

    /**
     *
     * @param teachers список преподавателей
     */
    public void PrintTeachers(List<Teacher> teachers){
        System.out.println("Фамилия Имя (id) преподавателя:");
        for (Teacher item: teachers) {
            System.out.printf("%s (%d)\n",item.firstLastName,item.id);
        }
    }

    /**
     *
     * @param students список студентов
     */
    public void PrintStudents(List<Student> students){
        System.out.println("Фамилия Имя (id) студента:");
        for (Student item: students) {
            System.out.printf("%s (%d)\n",item.firstLastName,item.id);
        }
    }

    /**
     *
     * @param studeGroup учебная группа
     */
    public void PrintStudeGroup(StudeGroup studeGroup){
        System.out.printf("Группа %d\n",studeGroup.groupID);
        System.out.printf("Преподаватель - %s\n",studeGroup.teacher.firstLastName);
        System.out.println("Список студентов:");
        PrintStudents(studeGroup.students);
    }
}
