package com.AndrieievYurii;

import java.util.HashMap;
import java.util.Map;

public class HashMapCach {
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
}
