package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements ICalculateService {

    @Override
    public double calculation(String number, double number1, double number2) {
        double result = 0;

        switch (number) {
            case "Addition (+)":
                result = number1 + number2;
                break;
            case "Subtraction (-)":
                result = number1 - number2;
                break;
            case "Multiplication (x)":
                result = number1 * number2;
                break;
            case "Division (/)":
                if (number2 != 0)
                    result = number1 / number2;
                break;
            default:
                break;
        }
        return result;
    }
}

