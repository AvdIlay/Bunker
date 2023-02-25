package com.example.bunker.service.Phobia;

import com.example.bunker.model.Hobby;
import com.example.bunker.model.Phobia;
import com.example.bunker.repository.PhobiaRepository;
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
public class PhobiaServiceImpl implements PhobiaService{
    private static final Logger LOG = LogManager.getLogger(PhobiaServiceImpl.class);

    @Resource
    private final PhobiaRepository phobiaRepository;

    @Override
    public Phobia findRandomPhobia() {
        List<Phobia> listPhobia = phobiaRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (Phobia phobia : listPhobia) {
            elements.add(phobia.getId());
        }
        return phobiaRepository.findById(elements.get((int) new Random().nextLong(elements.size())))
                .orElseThrow();
    }
}
