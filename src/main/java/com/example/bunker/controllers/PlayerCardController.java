package com.example.bunker.controllers;


import com.example.bunker.dto.PlayerCardDto;
import com.example.bunker.model.PlayerCard;
import com.example.bunker.service.PlayerCard.PlayerCardServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.bunker.dto.PlayerCardDto.getPlayerCardDto;

@RestController
public class PlayerCardController {
    @Resource
    private PlayerCardServiceImpl actionCardsService;

    @GetMapping(value = "/randomPlayerCard")
    PlayerCardDto getRandomPlayerCard() {
        PlayerCard playerCard = actionCardsService.getPlayerCard();
        return getPlayerCardDto(playerCard);
    }



}
