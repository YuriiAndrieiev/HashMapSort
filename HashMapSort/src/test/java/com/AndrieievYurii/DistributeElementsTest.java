package com.AndrieievYurii;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DistributeElementsTest {
    @Test
    void distributeElementsShouldReturnOutputWhenInputFirstCase(){
        UniqueCharCounter uniqueCharCounter = new UniqueCharCounter();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('D',3);
        expectedCharToCount.put('L',3);
        expectedCharToCount.put('O',2);
        expectedCharToCount.put('!',1);
        expectedCharToCount.put('R',1);
        expectedCharToCount.put('E',1);
        expectedCharToCount.put('W',1);
        expectedCharToCount.put('H',1);
        String input = "HelloWorlddd!";
        HashMap<Character, Integer> charToCount = uniqueCharCounter.distributeElements(input);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void distributeElementsShouldReturnOutputWhenInputSecondCase(){
        UniqueCharCounter uniqueCharCounter = new UniqueCharCounter();
        HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
        expectedCharToCount.put('2',4);
        expectedCharToCount.put('1',3);
        expectedCharToCount.put('0',2);
        String input = "222211100";
        HashMap<Character, Integer> charToCount = uniqueCharCounter.distributeElements(input);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void distributeElementsShouldReturnOutputWhenInputThirdCase(){
        UniqueCharCounter uniqueCharCounter = new UniqueCharCounter();
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
        String input = "Vladimir Putin Idi Na Hui!";
        HashMap<Character, Integer> charToCount = uniqueCharCounter.distributeElements(input);
        assertEquals(expectedCharToCount, charToCount);
    }

    @Test
    void testExpectedException(){
        assertThrows(Exception.class, () -> {
            UniqueCharCounter uniqueCharCounter = new UniqueCharCounter();
            HashMap<Character, Integer> expectedCharToCount = new HashMap<>();
            expectedCharToCount = null;
            String input = null;
            HashMap<Character, Integer> charToCount = uniqueCharCounter.distributeElements(input);
            assertEquals(expectedCharToCount, charToCount);
        });
    }

    @Test
    void distributeElementsShouldReturnOutputWhenInputFifthCase(){
        UniqueCharCounter uniqueCharCounter = new UniqueCharCounter();
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
        String input = "Zaebali unit tests";
        HashMap<Character, Integer> charToCount = uniqueCharCounter.distributeElements(input);
        assertEquals(expectedCharToCount, charToCount);
    }
}
