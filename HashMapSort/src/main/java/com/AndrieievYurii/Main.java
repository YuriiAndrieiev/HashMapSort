package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print input");
        String input = scanner.nextLine();
        ElementsDistribution elementsDistribution = new ElementsDistribution();
        HashMap<Character, Integer> charToCount = elementsDistribution.elementDistribution(input);
        elementsDistribution.consoleOutput(charToCount);
    }
}
