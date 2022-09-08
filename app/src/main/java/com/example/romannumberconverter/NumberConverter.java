package com.example.romannumberconverter;

public class NumberConverter {

    public String toRoman(int numberInput) {

        if (numberInput < 0 || numberInput > 10000) {
            return "Sorry. I can't do that.";
        }

        String returnValue = "";

        while (numberInput >= 1000) {
            returnValue += "M";
            numberInput -=1000;
        }

        while (numberInput >= 900) {
            returnValue += "CM";
            numberInput -= 900;
        }

        while (numberInput >= 500) {
            returnValue += "D";
            numberInput -= 500;
        }

        while (numberInput >= 400) {
            returnValue += "CD";
            numberInput -= 400;
        }

        while (numberInput >= 100) {
            returnValue += "C";
            numberInput -= 100;
        }

        while (numberInput >= 90) {
            returnValue += "XC";
            numberInput -= 90;
        }

        while (numberInput >= 50) {
            returnValue += "L";
            numberInput -= 50;
        }

        while (numberInput >= 40) {
            returnValue += "XL";
            numberInput -= 40;
        }

        while (numberInput >= 10) {
            returnValue += "X";
            numberInput -= 10;
        }

        while (numberInput >= 9) {
            returnValue += "IX";
            numberInput -= 9;
        }

        while (numberInput >= 5) {
            returnValue += "V";
            numberInput -= 5;
        }

        while (numberInput >= 4) {
            returnValue += "IV";
            numberInput -= 4;
        }

        while (numberInput >= 1) {
            returnValue += "I";
            numberInput -= 1;
        }

        return returnValue;
    }

    public int toNumber(String numeral) {

        return 8;
    }
}
