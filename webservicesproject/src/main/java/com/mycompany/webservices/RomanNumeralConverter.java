/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservices;

public class RomanNumeralConverter {

    public RomanNumeralConverter() {
        super();
    }
    //https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java code came from stackoverflow
    public String IntegerToRomanNumeral(int userInput) {
        if (userInput < 1 || userInput > 4999) {
            return "Invalid Roman Number Value";
        }
        String s = "";
        while (userInput >= 1000) {
            s += "M";
            userInput -= 1000;
        }
        while (userInput >= 900) {
            s += "CM";
            userInput -= 900;
        }
        while (userInput >= 500) {
            s += "D";
            userInput -= 500;
        }
        while (userInput >= 400) {
            s += "CD";
            userInput -= 400;
        }
        while (userInput >= 100) {
            s += "C";
            userInput -= 100;
        }
        while (userInput >= 90) {
            s += "XC";
            userInput -= 90;
        }
        while (userInput >= 50) {
            s += "L";
            userInput -= 50;
        }
        while (userInput >= 40) {
            s += "XL";
            userInput -= 40;
        }
        while (userInput >= 10) {
            s += "X";
            userInput -= 10;
        }
        while (userInput >= 9) {
            s += "IX";
            userInput -= 9;
        }
        while (userInput >= 5) {
            s += "V";
            userInput -= 5;
        }
        while (userInput >= 4) {
            s += "IV";
            userInput -= 4;
        }
        while (userInput >= 1) {
            s += "I";
            userInput -= 1;
        }
        return s;
    }

    //http://www.anyforum.in/question/corejava/string-handling/Roman-Numbers-in-java/796
    // This function returns value of a Roman symbol 
    int value(char r) {
        if (r == 'I') {
            return 1;
        }
        if (r == 'V') {
            return 5;
        }
        if (r == 'X') {
            return 10;
        }
        if (r == 'L') {
            return 50;
        }
        if (r == 'C') {
            return 100;
        }
        if (r == 'D') {
            return 500;
        }
        if (r == 'M') {
            return 1000;
        }
        return -1;
    }

     //http://www.anyforum.in/question/corejava/string-handling/Roman-Numbers-in-java/796
    // Finds decimal value of a given romal numeral 
    int romanToDecimal(String usersString) {
        // Initialize result 
        int res = 0;

        for (int i = 0; i < usersString.length(); i++) {
            // Getting value of symbol s[i] 
            int s1 = value(usersString.charAt(i));

            // Getting value of symbol s[i+1] 
            if (i + 1 < usersString.length()) {
                int s2 = value(usersString.charAt(i + 1));

                // Comparing both values 
                if (s1 >= s2) {
                    // Value of current symbol is greater 
                    // or equalto the next symbol 
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++; // Value of current symbol is 
                    // less than the next symbol 
                }
            } else {
                res = res + s1;
                i++;
            }
        }

        return res;
    }
}
