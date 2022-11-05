package RomanToInt;

import java.util.Arrays;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] romanNumbers = s.toCharArray();

        for (int letterIndex = 0; letterIndex < romanNumbers.length; letterIndex++){
            char currentLetter = romanNumbers[letterIndex];
            char nextLetter = (letterIndex+1 != romanNumbers.length ? romanNumbers[letterIndex+1] : 'I' );
            switch (currentLetter) {
                case 'I' -> result = (nextLetter == 'V' || nextLetter == 'X' ? result - 1 : result + 1);
                case 'V' -> result += 5;
                case 'X' -> result = (nextLetter == 'L' || nextLetter == 'C' ? result - 10 : result + 10);
                case 'L' -> result += 50;
                case 'C' -> result = (nextLetter == 'D' || nextLetter == 'M' ? result - 100 : result + 100);
                case 'D' -> result += 500;
                case 'M' -> result += 1000;
            }
        }

        return result;
    }
}
