package com.example.bunker.dto;

import com.example.bunker.model.*;
import com.example.bunker.service.PlayerCard.PlayerCardServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerCardDto {
    private String professions;
    private String health;
    private String hobby;
    private String fact1;
    private String fact2;
    private String baggage;
    private String phobia;
    private String biologicalCharacteristics;
    private String actionCards1;
    private String actionCards2;


    public PlayerCardDto(PlayerCard playerCard) {
        this.professions = playerCard.getProfessions().getTitle();
        this.health = playerCard.getHealth().getHealth();
        this.hobby = playerCard.getHobby().getTitle();
        this.fact1 = playerCard.getFact1().getTitle();
        this.fact2 = playerCard.getFact2().getTitle();
        this.baggage = playerCard.getBaggage().getTitle();
        this.phobia = playerCard.getPhobia().getExplanation() + " --> " + playerCard.getPhobia().getTitle();
        this.biologicalCharacteristics = playerCard.getBiologicalCharacteristics().getGender() + " "
                + playerCard.getBiologicalCharacteristics().getAge();
        this.actionCards1 = playerCard.getActionCards1().getTitle();
        this.actionCards2 = playerCard.getActionCards2().getTitle();
    }

    public static PlayerCardDto getPlayerCardDto(PlayerCard playerCard) {
        return new PlayerCardDto(playerCard);
    }
}
