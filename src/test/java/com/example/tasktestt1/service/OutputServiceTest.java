package com.example.tasktestt1.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OutputServiceTest {
    @InjectMocks
    private OutputService outputService;

    private String input;

    @BeforeEach
    void setUp(){
        input = "aaabbbbbcc";
    }

    @Test
    public void symbolFrequency_correctAnswer() {
        assertEquals(3, outputService.symbolFrequency(input).get('a'));
        assertEquals(5, outputService.symbolFrequency(input).get('b'));
        assertEquals(2, outputService.symbolFrequency(input).get('c'));
    }

    @Test
    public void symbolFrequency_correctSort() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 5);
        map.put('a', 3);
        map.put('c', 2);

        Integer[] expected = map.values().toArray(new Integer[map.size()]);
        Integer[] result = outputService.symbolFrequency(input).values().toArray(new Integer[outputService.symbolFrequency(input).size()]);

        assertArrayEquals(expected, result);
    }

    @Test
    public void symbolFrequency_throwException() {
        String str = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> outputService.symbolFrequency(str));

        assertEquals("input cannot be empty", exception.getMessage());
    }
}