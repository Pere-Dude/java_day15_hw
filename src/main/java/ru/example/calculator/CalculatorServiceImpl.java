package ru.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String welcome() {
        return "Добро пожаловать";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
