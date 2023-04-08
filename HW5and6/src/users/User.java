package users;

import java.util.Date;

/**
 * Liskov substitution principle (принцип подстановки Лисков)
 * Родительский класс имеет только самые общие поля, которые будут справедливы для всех наследников,
 * а уже наследники добавляют свой расширенный функционал
 */
abstract public class User {
    public int id;
    public String firstLastName;
    public Date dateBirth;

    public User(int id, String firstLastName, Date dateBirth) {
        this.id = id;
        this.firstLastName = firstLastName;
        this.dateBirth = dateBirth;
    }
}