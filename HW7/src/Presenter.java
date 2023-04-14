import model.Calculator;
import model.Logger;
import num.ComplexNumber;
import view.View;

import java.io.IOException;
import java.util.Date;

public class Presenter {
    Calculator calculator;
    View view;
    Logger logger;

    public Presenter(Calculator calculator, View view, Logger logger) {
        this.calculator = calculator;
        this.view = view;
        this.logger = logger;
    }

    public void buttonClick() throws IOException {
        logger.setPath(view.nameLogFile());
        view.welcome();
        boolean repeat = true;
        while (repeat) {
            Date date = new Date();
            ComplexNumber num1 = view.getComplexNumber("1");
            ComplexNumber num2 = view.getComplexNumber("2");
            ComplexNumber res = new ComplexNumber(0, 0);
            String operation = view.inputOperations();
            boolean check = true;
            switch (operation) {
                case "+":
                    res = calculator.addition(num1, num2);
                    break;
                case "-":
                    res = calculator.subtraction(num1, num2);
                    break;
                case "*":
                    res = calculator.mulitplication(num1, num2);
                    break;
                case "/":
                    res = calculator.division(num1, num2);
                    break;
                default:
                    System.out.println("Некорректная команда!");
                    check = false;

            }
            if (check) {
                view.printResult(res);
                logger.FileWrite(date.toString());
                logger.FileWrite("(" + num1.toString() + ") " + operation + " (" + num2.toString() + ") = " + res.toString() + "\n");
            }
            repeat = view.repeat();
        }
    }
}