package model;

import num.ComplexNumber;

public interface Calculations {
    ComplexNumber addition(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber mulitplication(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber division(ComplexNumber num1, ComplexNumber num2);
}
