package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;


public class UniqueCharCounter {

    private static Map<String, Map<Character,Integer>> cachedWords = new HashMap<>();

    public Map<Character, Integer> calculateUniqueChars(String input ) {
        Map<Character, Integer> charToCount = new HashMap<>();
        String inputUpperCase = input.toUpperCase();
        String[] inputSplit = inputUpperCase.split(" ");
        if (cachedWords.containsKey(input)) {
            return cachedWords.get(input);
        }
            for(int i = 0; i < inputSplit.length; i++) {
                char[] inputArray = inputSplit[i].toCharArray();
                for (char array : inputArray) {
                    if (!charToCount.containsKey(array)) {
                        charToCount.put(array, 0);
                    }
                    charToCount.put(array, charToCount.get(array) + 1);
                }
            }
            cachedWords.put(input,charToCount);
            return charToCount;
    }
}
