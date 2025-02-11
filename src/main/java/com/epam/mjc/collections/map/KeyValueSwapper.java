package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> Map = new HashMap<>();
        for (int key : sourceMap.keySet()) {
            Map.putIfAbsent(sourceMap.get(key), key);
        }
        return Map;
    }
}
