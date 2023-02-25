package com.example.bunker.controllers;

import com.example.bunker.model.ActionCards;
import com.example.bunker.repository.ActionCardsRepository;
import com.example.bunker.service.ActionCards.ActionCardsServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActionCardsController {

    @Resource
    private ActionCardsRepository actionCardsRepository;

    @Resource
    private ActionCardsServiceImpl actionCardsService;

    @GetMapping(value = "/actionCards/{id}")
    ActionCards getQuote(@PathVariable("id") Long id) {
        return actionCardsRepository.findById(id).orElseThrow();
    }

    @GetMapping(value = "/actionCards")
    List<ActionCards> getQuotes() {
        return actionCardsRepository.findAll();
    }

    @GetMapping(value = "/randomActionCards")
    ActionCards getRandomQuote() {
        return actionCardsService.findRandomActionCard();
    }


}
