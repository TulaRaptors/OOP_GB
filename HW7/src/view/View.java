package view;

import num.ComplexNumber;

import java.util.Objects;
import java.util.Scanner;

public class View implements IView {

    Scanner in = new Scanner(System.in);

    @Override
    public void welcome() {
        System.out.println("Калькулятор комплексных чисел");
        System.out.println("Формат записи: a + b * i,");
    }

    @Override
    public ComplexNumber getComplexNumber(String title) {
        System.out.printf("Введите вещественную часть %s числа (a): ", title);
        double a = in.nextDouble();
        System.out.printf("Введите мнимую часть %s числа (b): ", title);
        double b = in.nextDouble();
        return new ComplexNumber(a, b);
    }

    @Override
    public String inputOperations() {
        System.out.println("Введите команду (+, -, *, /): ");
        return in.next();
    }

    @Override
    public void printResult(ComplexNumber res) {
        System.out.println("Результат: " + res.toString());
    }

    @Override
    public String nameLogFile() {
        String name = "log.txt";
        return name;
    }

    public boolean repeat() {
        System.out.println("Раcчёт закончен (Y/N)?");
        if (Objects.equals(in.next(), "N")) {
            return true;
        } else {
            return false;
        }
    }
}
