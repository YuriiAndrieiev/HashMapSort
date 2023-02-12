package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print input");
        String input = scanner.nextLine();
        UniqueCharCounter uniqueCharCounter = new UniqueCharCounter();
        HashMapCach hashMapCach = new HashMapCach();
        Map <Character,Integer> charToCount = uniqueCharCounter.distributeElements(input);
        Map<String,HashMap<Character,Integer>> cachedWords = hashMapCach.getCachedWords();
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.printOutput(charToCount);
        UniqueCharCounter uniqueCharCounter1 = new UniqueCharCounter();
        uniqueCharCounter1.distributeElements(input);
    }
}
