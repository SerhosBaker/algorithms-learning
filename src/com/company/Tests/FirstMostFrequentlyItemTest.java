package com.company.Tests;

import java.util.HashMap;

/*
 * Есть заданная строка - Bootlegger
 * Задача - найти первый наиболее часто повторяющийся символ в строке
 */
public class FirstMostFrequentlyItemTest {
    public String test(String inputString) {
        var mapsOfChars = new HashMap<Character, Integer>();
        var max = 1;
        char maxChar = ' ';
        var charsArray = inputString.toCharArray();
        for (var char1 : charsArray) {
            if (mapsOfChars.containsKey(char1)) {
                int value = mapsOfChars.get(char1) + 1;
                mapsOfChars.put(char1, value);
                if (max < value) {
                    max = value;
                    maxChar = char1;
                }
            } else
                mapsOfChars.put(char1, 1);
        }
        return Character.toString(maxChar);
    }
}