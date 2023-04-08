package users;

import java.util.Date;

/**
 * Liskov substitution principle (принцип подстановки Лисков)
 * Родительский класс имеет только самые общие поля, которые будут справедливы для всех наследников,
 * а уже наследники добавляют свой расширенный функционал
 */
public class Student extends User {

    public Student(int id, String firstLastName, Date dateBirth) {

        super(id, firstLastName, dateBirth);
    }
}