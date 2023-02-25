package com.example.bunker.service.Professions;

import com.example.bunker.model.Phobia;
import com.example.bunker.model.Professions;
import com.example.bunker.repository.ProfessionsRepository;
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
public class ProfessionsServiceImpl implements ProfessionsService{
    private static final Logger LOG = LogManager.getLogger(ProfessionsServiceImpl.class);

    @Resource
    private final ProfessionsRepository professionsRepository;


    @Override
    public Professions findRandomProfessions() {
        List<Professions> listProfessions = professionsRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (Professions professions : listProfessions) {
            elements.add(professions.getId());
        }
        return professionsRepository.findById(elements.get((int) new Random().nextLong(elements.size())))
                .orElseThrow();
    }
}
