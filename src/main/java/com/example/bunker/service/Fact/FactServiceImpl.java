package com.example.bunker.service.Fact;

import com.example.bunker.model.BiologicalCharacteristics;
import com.example.bunker.model.Fact;
import com.example.bunker.repository.FactRepository;
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
public class FactServiceImpl implements FactService{
    private static final Logger LOG = LogManager.getLogger(FactServiceImpl.class);

    @Resource
    private final FactRepository factRepository;

    @Override
    public Fact findRandomFact() {
        List<Fact> listFacts = factRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (Fact fact : listFacts) {
            elements.add(fact.getId());
        }
        return factRepository.findById(elements.get((int) new Random().nextLong(elements.size())))
                .orElseThrow();
    }
}
