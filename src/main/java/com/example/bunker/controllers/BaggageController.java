package com.example.bunker.controllers;

import com.example.bunker.model.ActionCards;
import com.example.bunker.model.Baggage;
import com.example.bunker.repository.BaggageRepository;
import com.example.bunker.service.Baggage.BaggageServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaggageController {
    @Resource
    private BaggageRepository baggageRepository;

    @Resource
    private BaggageServiceImpl baggageService;


    @GetMapping(value = "/baggage/{id}")
    Baggage getQuote(@PathVariable("id") Long id) {
        return baggageRepository.findById(id).orElseThrow();
    }

    @GetMapping(value = "/baggages")
    List<Baggage> getQuotes() {
        return baggageRepository.findAll();
    }

    @GetMapping(value = "/randomBaggage")
    Baggage getRandomQuote() {
        return baggageService.findRandomBaggage();
    }

}
