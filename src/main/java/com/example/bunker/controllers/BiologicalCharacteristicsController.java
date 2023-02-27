package com.example.bunker.controllers;

import com.example.bunker.model.Baggage;
import com.example.bunker.model.BiologicalCharacteristics;
import com.example.bunker.repository.BaggageRepository;
import com.example.bunker.repository.BiologicalCharacteristicsRepository;
import com.example.bunker.service.Baggage.BaggageServiceImpl;
import com.example.bunker.service.BiologicalCharacteristics.BiologicalCharacteristicsServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BiologicalCharacteristicsController {
    @Resource
    private BiologicalCharacteristicsRepository biologicalCharacteristicsRepository;

    @Resource
    private BiologicalCharacteristicsServiceImpl biologicalCharacteristicsService;


    @GetMapping(value = "/bio/{id}")
    BiologicalCharacteristics getQuote(@PathVariable("id") Long id) {
        return biologicalCharacteristicsRepository.findById(id).orElseThrow();
    }

    @GetMapping(value = "/bios")
    List<BiologicalCharacteristics> getQuotes() {
        return biologicalCharacteristicsRepository.findAll();
    }

    @GetMapping(value = "/randomBio")
    BiologicalCharacteristics getRandomQuote() {
        return biologicalCharacteristicsService.findRandomBiologicalCharacteristics();
    }

}
