package com.example.bunker.service.ActionCards;

import com.example.bunker.model.ActionCards;
import com.example.bunker.repository.ActionCardsRepository;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class ActionCardsServiceImpl implements ActionCardsService{
    private static final Logger LOG = LogManager.getLogger(ActionCardsServiceImpl.class);
    @Resource
    private final ActionCardsRepository actionCardsRepository;

    @Override
    public ActionCards findRandomActionCard() {
        List<ActionCards> listActionCards = actionCardsRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (ActionCards actionCards : listActionCards) {
            elements.add(actionCards.getId());
        }

        return actionCardsRepository.findById(elements.get((int) new Random().nextLong(elements.size()))).orElseThrow();

    }
}
