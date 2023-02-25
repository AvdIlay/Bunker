package com.example.bunker.service.Baggage;

import com.example.bunker.model.ActionCards;
import com.example.bunker.model.Baggage;
import com.example.bunker.repository.ActionCardsRepository;
import com.example.bunker.repository.BaggageRepository;
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
public class BaggageServiceImpl implements BaggageService {
    private static final Logger LOG = LogManager.getLogger(BaggageServiceImpl.class);
    @Resource
    private final BaggageRepository baggageRepository;

    @Override
    public Baggage findRandomBaggage() {
        List<Baggage> listBaggage = baggageRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (Baggage baggage : listBaggage) {
            elements.add(baggage.getId());
        }
        return baggageRepository.findById(elements.get((int) new Random().nextLong(elements.size()))).orElseThrow();
    }
}
