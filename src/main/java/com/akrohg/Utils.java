package com.akrohg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Utils {
    public static String shuffleLetters(String input) {
        List<String> letters = Arrays.asList(input.split(""));
        Collections.shuffle(letters);
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

    public static String reverseLetters(String input) {
        return new StringBuilder().append(input).reverse().toString();
    }
}