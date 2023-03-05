package com.example.bunker.service.PlayerCard;

import com.example.bunker.dto.PlayerCardDto;
import com.example.bunker.model.PlayerCard;
import com.example.bunker.repository.PlayerCardRepository;
import com.example.bunker.service.ActionCards.ActionCardsServiceImpl;
import com.example.bunker.service.Baggage.BaggageServiceImpl;
import com.example.bunker.service.BiologicalCharacteristics.BiologicalCharacteristicsServiceImpl;
import com.example.bunker.service.Fact.FactServiceImpl;
import com.example.bunker.service.Health.HealthServiceImpl;
import com.example.bunker.service.Hobby.HobbyServiceImpl;
import com.example.bunker.service.Phobia.PhobiaServiceImpl;
import com.example.bunker.service.Professions.ProfessionsServiceImpl;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerCardServiceImpl implements PlayerCardService {
    private static final Logger LOG = LogManager.getLogger(PlayerCardServiceImpl.class);

    @Resource
    private final PlayerCardRepository playerCardRepository;
    @Resource
    private final ActionCardsServiceImpl actionCardsService;
    @Resource
    private final BaggageServiceImpl baggageService;
    @Resource
    private final FactServiceImpl factService;
    @Resource
    private final BiologicalCharacteristicsServiceImpl biologicalCharacteristicsService;
    @Resource
    private final HealthServiceImpl healthService;
    @Resource
    private final HobbyServiceImpl hobbyService;
    @Resource
    private final PhobiaServiceImpl phobiaService;
    @Resource
    private final ProfessionsServiceImpl professionsService;


    @Override
    public PlayerCard getRandomPlayerCard() {
        PlayerCard playerCard = new PlayerCard();
        playerCard.setActionCards1(actionCardsService.findRandomActionCard());
        playerCard.setActionCards2(actionCardsService.findRandomActionCard());
        playerCard.setBaggage(baggageService.findRandomBaggage());
        playerCard.setFact1(factService.findRandomFact());
        playerCard.setFact2(factService.findRandomFact());
        playerCard.setBiologicalCharacteristics(biologicalCharacteristicsService.findRandomBiologicalCharacteristics());
        playerCard.setHealth(healthService.findRandomHealth());
        playerCard.setHobby(hobbyService.findRandomHobby());
        playerCard.setPhobia(phobiaService.findRandomPhobia());
        playerCard.setProfessions(professionsService.findRandomProfessions());
        playerCardRepository.save(playerCard);
        return playerCard;
    }

}
