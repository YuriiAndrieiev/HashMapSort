package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharCounter {

    public HashMap<Character, Integer> distributeElements(String input ) {
        HashMapCach hashMapCach = new HashMapCach();
        Map<String,HashMap<Character,Integer>> cachHashMap = hashMapCach.getCachedWords();
        Map<Character, Integer> charToCount = new HashMap<>();
        String inputUpperCase = input.toUpperCase();
        String[] inputSplit = inputUpperCase.split(" ");
        if (!cachHashMap.containsKey(input)) {
            for(int i = 0; i < inputSplit.length; i++) {
                char[] inputArray = inputSplit[i].toCharArray();
                for (char array : inputArray) {
                    if (!charToCount.containsKey(array)) {
                        charToCount.put(array, 0);
                    }
                    charToCount.put(array, charToCount.get(array) + 1);
                }
            }
            cachHashMap.put(input, (HashMap<Character, Integer>) charToCount);
            return (HashMap<Character, Integer>) charToCount;
        }else if (cachHashMap.containsKey(input)){
            cachHashMap.get(input);
            System.out.println("this word has already been added to cash, "+input);
        }
        return (HashMap<Character, Integer>) charToCount;
    }
}
