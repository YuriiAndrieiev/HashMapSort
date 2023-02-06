package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;


public class ElementsDistribution {

    public HashMap<Character, Integer> elementDistribution(String input) {
        HashMap<String,HashMap<Character,Integer>> words = new HashMap<>();
        HashMap<Character, Integer> charToCount = new HashMap<>();
        String inputUpperCase = input.toUpperCase();
        String[] inputSplit = inputUpperCase.split(" ");
        for(int i = 0; i < inputSplit.length; i++) {
            char[] inputArray = inputSplit[i].toCharArray();
            for (char array : inputArray) {
                if (!charToCount.containsKey(array)) {
                    charToCount.put(array, 0);
                }
                charToCount.put(array, charToCount.get(array) + 1);
            }
            if (words.containsKey(inputSplit[i])){
                System.out.println("this word has already been added to cash, "+inputSplit[i]);
            }
            words.put(inputSplit[i],charToCount);
        }
        return charToCount;
    }

    public void consoleOutput (HashMap<Character, Integer> charToCount) {
        charToCount.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
