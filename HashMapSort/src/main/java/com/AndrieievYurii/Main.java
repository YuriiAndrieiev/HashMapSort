package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print input");
        String input = scanner.nextLine();
        MapsManipulations mapsManipulations = new MapsManipulations();
        HashMapCach hashMapCach = new HashMapCach();
        Map <Character,Integer> charToCount = mapsManipulations.distributeElements(input);
        Map<String,HashMap<Character,Integer>> cachedWords = hashMapCach.getCachedWords();
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.printOutput(charToCount);
        MapsManipulations mapsManipulations1 = new MapsManipulations();
        mapsManipulations1.distributeElements(input);
    }
}
