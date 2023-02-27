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

    public static PlayerCardDto getPlayerCardDto(PlayerCard playerCard) {
        PlayerCardDto playerCardDto = new PlayerCardDto();
        playerCardDto.setActionCards1(playerCard.getActionCards1().getTitle());
        playerCardDto.setActionCards2(playerCard.getActionCards2().getTitle());
        playerCardDto.setBaggage(playerCard.getBaggage().getTitle());
        playerCardDto.setPhobia(playerCard.getPhobia().getTitle() + " " + playerCard.getPhobia().getExplanation());
        playerCardDto.setBiologicalCharacteristics(playerCard.getBiologicalCharacteristics().getAge()
                + " " + playerCard.getBiologicalCharacteristics().getGender());
        playerCardDto.setFact1(playerCard.getFact1().getTitle());
        playerCardDto.setFact2(playerCard.getFact2().getTitle());
        playerCardDto.setHobby(playerCard.getHobby().getTitle());
        playerCardDto.setHealth(playerCard.getHealth().getHealth());
        playerCardDto.setProfessions(playerCard.getProfessions().getTitle());
        return playerCardDto;
    }
}
