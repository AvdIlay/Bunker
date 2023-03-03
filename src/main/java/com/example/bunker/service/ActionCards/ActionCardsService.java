package com.example.bunker.service.ActionCards;

import com.example.bunker.model.ActionCards;
import org.springframework.stereotype.Service;

@Service
public interface ActionCardsService {
    ActionCards findRandomActionCard();
}
