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
        Map <Character,Integer> charToCount = uniqueCharCounter.calculateUniqueChars(input);
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.printOutput(charToCount);
        UniqueCharCounter uniqueCharCounter1 = new UniqueCharCounter();
        uniqueCharCounter1.calculateUniqueChars(input);
    }
}
