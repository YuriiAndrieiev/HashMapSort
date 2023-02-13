package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharCounter {

    static Map<String, HashMap<Character,Integer>> cachedWords = new HashMap<>();

    public static HashMap<String, HashMap<Character, Integer>> getCachedWords() {
        return (HashMap<String, HashMap<Character, Integer>>) cachedWords;
    }

    @Override
    public String toString() {
        return "HashMapCach{" +
                "cachedWords=" + cachedWords +
                '}';
    }

    public HashMap<Character, Integer> distributeElements(String input ) {
        Map<String,HashMap<Character,Integer>> cachedWords = getCachedWords();
        Map<Character, Integer> charToCount = new HashMap<>();
        String inputUpperCase = input.toUpperCase();
        String[] inputSplit = inputUpperCase.split(" ");
        if (!cachedWords.containsKey(input)) {
            for(int i = 0; i < inputSplit.length; i++) {
                char[] inputArray = inputSplit[i].toCharArray();
                for (char array : inputArray) {
                    if (!charToCount.containsKey(array)) {
                        charToCount.put(array, 0);
                    }
                    charToCount.put(array, charToCount.get(array) + 1);
                }
            }
            cachedWords.put(input, (HashMap<Character, Integer>) charToCount);
            return (HashMap<Character, Integer>) charToCount;
        }else if (cachedWords.containsKey(input)){
            return cachedWords.get(input);
        }
        return (HashMap<Character, Integer>) charToCount;
    }
}
