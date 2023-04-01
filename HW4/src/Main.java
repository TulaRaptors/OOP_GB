import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calc<Number> calc1 = new Calc<>();
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(33);
        System.out.println(calc1.sum(numbers)); // сумма
        System.out.println(calc1.subtraction(10, 1.5)); // вычитание
        System.out.println(calc1.multiply(3.14, 2)); // умножение
        System.out.println(calc1.div(111, 5)); // деление
        System.out.println(calc1.bynaryTranslation(102));
        System.out.println(calc1.bynaryTranslation(102.0));
    }
}