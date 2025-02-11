package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordCounterMap = new HashMap<>();
        if(sentence.equals("")) {
            return wordCounterMap;

        }        int i;
        String[] strings = sentence.toLowerCase().replace('.', ' ').replace(',', ' ').trim().split("\\s+");
        for (String str : strings) {
            int repeated = 0;
            for (i = 0; i < strings.length; i++) {
                if (str.equals(strings[i])) {
                    repeated++;
                }
            }
            wordCounterMap.put(str, repeated);
        }
        return wordCounterMap;
    }
}
