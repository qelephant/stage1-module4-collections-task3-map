package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
         String lowerCaseSentence = sentence.toLowerCase();
        String cleanedSentence = lowerCaseSentence.replaceAll("[^a-zA-Z\\s]", "");
        String[] words = cleanedSentence.split("\\s+");
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        for (String word : words) {
            wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
        }

        return wordRepetitionMap;
    }
}
