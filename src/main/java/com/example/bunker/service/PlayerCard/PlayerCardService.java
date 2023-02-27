package com.example.bunker.service.PlayerCard;

import com.example.bunker.dto.PlayerCardDto;
import com.example.bunker.model.PlayerCard;
import org.springframework.stereotype.Service;

@Service
public interface PlayerCardService {
    PlayerCard getPlayerCard();
}
