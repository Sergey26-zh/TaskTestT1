package com.example.tasktestt1.controller;

import com.example.tasktestt1.service.OutputService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class OutputController {
    private final OutputService outputService;

    @PostMapping("/symbolFrequency")
    public Map<Character, Integer> symbolFrequency(@RequestBody String input) {
        return outputService.symbolFrequency(input);
    }

}
