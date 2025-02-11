package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsKey(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculatedMap = new HashMap<>();
        int count = 0;
        for (int key : sourceList) {
            int calculated = 5 * key + 2;
            calculatedMap.put(calculated, count);
            count++;
        }
        return calculatedMap;
    }
}
