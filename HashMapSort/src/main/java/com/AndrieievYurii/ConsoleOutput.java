package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;

public class ConsoleOutput {
    public void printOutput (Map<Character, Integer> charToCount) {
        charToCount.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
