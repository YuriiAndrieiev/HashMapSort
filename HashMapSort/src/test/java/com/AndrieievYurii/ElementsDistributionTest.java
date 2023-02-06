package com.AndrieievYurii;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;


public class ElementsDistributionTest {

    @Test
    void shouldReturnSortedResultWhenWeGetStringInput(){
        ElementsDistribution elementsDistribution = new ElementsDistribution();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('D',3);
        expectedCharToCount.put('L',3);
        expectedCharToCount.put('O',2);
        expectedCharToCount.put('!',1);
        expectedCharToCount.put('R',1);
        expectedCharToCount.put('E',1);
        expectedCharToCount.put('W',1);
        expectedCharToCount.put('H',1);
        elementsDistribution.consoleOutput(expectedCharToCount);
        String input = "Hello worlddd!";
        HashMap<Character, Integer> charToCount = elementsDistribution.elementDistribution(input);
        elementsDistribution.consoleOutput(charToCount);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void shouldReturnSortedResultWhenWeGetStringInputSecondCase(){
        ElementsDistribution elementsDistribution = new ElementsDistribution();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('I',4);
        expectedCharToCount.put('!',2);
        expectedCharToCount.put('R',2);
        expectedCharToCount.put('E',2);
        expectedCharToCount.put('A',1);
        expectedCharToCount.put('D',1);
        expectedCharToCount.put('U',1);
        expectedCharToCount.put('V',1);
        expectedCharToCount.put('Y',1);
        expectedCharToCount.put('N',1);
        elementsDistribution.consoleOutput(expectedCharToCount);
        String input = "Yurii Andrieiev!!";
        HashMap<Character, Integer> charToCount = elementsDistribution.elementDistribution(input);
        elementsDistribution.consoleOutput(charToCount);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void shouldReturnSortedResultWhenWeGetStringInputThirdCase(){
        ElementsDistribution elementsDistribution = new ElementsDistribution();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('I',6);
        expectedCharToCount.put('A',2);
        expectedCharToCount.put('D',2);
        expectedCharToCount.put('N',2);
        expectedCharToCount.put('U',2);
        expectedCharToCount.put('!',1);
        expectedCharToCount.put('H',1);
        expectedCharToCount.put('L',1);
        expectedCharToCount.put('M',1);
        expectedCharToCount.put('P',1);
        expectedCharToCount.put('R',1);
        expectedCharToCount.put('T',1);
        expectedCharToCount.put('V',1);
        elementsDistribution.consoleOutput(expectedCharToCount);
        String input = "Vladimir Putin Idi Na Hui!";
        HashMap<Character, Integer> charToCount = elementsDistribution.elementDistribution(input);
        elementsDistribution.consoleOutput(charToCount);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void shouldReturnSortedResultWhenWeGetStringInputFourthCase(){
        ElementsDistribution elementsDistribution = new ElementsDistribution();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('A',2);
        expectedCharToCount.put('R',2);
        expectedCharToCount.put('I',2);
        expectedCharToCount.put('S',1);
        expectedCharToCount.put('E',1);
        expectedCharToCount.put('W',1);
        expectedCharToCount.put('H',1);
        expectedCharToCount.put('M',1);
        expectedCharToCount.put('N',1);
        expectedCharToCount.put('O',1);
        elementsDistribution.consoleOutput(expectedCharToCount);
        String input = "MarinaIsWhore";
        HashMap<Character, Integer> charToCount = elementsDistribution.elementDistribution(input);
        elementsDistribution.consoleOutput(charToCount);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void shouldReturnSortedResultWhenWeGetStringInputLastCase(){
        ElementsDistribution elementsDistribution = new ElementsDistribution();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('T',3);
        expectedCharToCount.put('A',2);
        expectedCharToCount.put('S',2);
        expectedCharToCount.put('E',2);
        expectedCharToCount.put('I',2);
        expectedCharToCount.put('B',1);
        expectedCharToCount.put('U',1);
        expectedCharToCount.put('Z',1);
        expectedCharToCount.put('L',1);
        expectedCharToCount.put('N',1);
        elementsDistribution.consoleOutput(expectedCharToCount);
        String input = "Zaebali unit tests";
        HashMap<Character, Integer> charToCount = elementsDistribution.elementDistribution(input);
        elementsDistribution.consoleOutput(charToCount);
        assertEquals(expectedCharToCount, charToCount);
    }
}
