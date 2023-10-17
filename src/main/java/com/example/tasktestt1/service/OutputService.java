package com.example.tasktestt1.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OutputService {

    public Map<Character, Integer> symbolFrequency (String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("input cannot be empty");
        }

        Map<Character, Integer> result = new HashMap<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            Integer count = result.get(ch);
            if (count == null) {
                count = 0;
            }
            result.put(ch, ++count);
        }
        return result;
    }
}