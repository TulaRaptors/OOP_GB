package model;

import num.ComplexNumber;

public class Calculator implements Calculations {

    @Override
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
        double a = num1.getRe();
        double b = num1.getIm();
        double c = num2.getRe();
        double d = num2.getIm();
        double reRes = a + c;
        double imRes = b + d;
        return new ComplexNumber(reRes, imRes);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2) {
        double a = num1.getRe();
        double b = num1.getIm();
        double c = num2.getRe();
        double d = num2.getIm();
        double reRes = a - c;
        double imRes = b - d;
        return new ComplexNumber(reRes, imRes);
    }

    @Override
    public ComplexNumber mulitplication(ComplexNumber num1, ComplexNumber num2) {
        double a = num1.getRe();
        double b = num1.getIm();
        double c = num2.getRe();
        double d = num2.getIm();
        double reRes = (a * c) - (b * d);
        double imRes = (b * c) + (a * d);
        return new ComplexNumber(reRes, imRes);
    }

    @Override
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        double a = num1.getRe();
        double b = num1.getIm();
        double c = num2.getRe();
        double d = num2.getIm();
        double reRes = ((a * c) + (b * d)) / ((c * c) + (d * d));
        double imRes = ((b * c) - (a * d)) / ((c * c) + (d * d));
        return new ComplexNumber(reRes, imRes);
    }
}