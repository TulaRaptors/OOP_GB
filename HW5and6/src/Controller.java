import model.Model;
import users.StudeGroup;
import view.View;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    View view;
    Model model;

    public Controller() {
    }

    ;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void ButtonClick() throws IOException {
        view.Menu();
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("Введите номер операции: ");
        while (choice < 1 || choice > 3) {
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    view.PrintTeachers(model.getTeachers());
                    break;
                case 2:
                    view.PrintStudents(model.getStudents());
                    break;
                case 3:
                    StudeGroup studeGroup = model.createStudeGroup(model.getTeacher(), model.getStudents());
                    view.PrintStudeGroup(studeGroup);
                default:
                    System.out.println("Нет такого варианта!");
            }
        }
    }
}
