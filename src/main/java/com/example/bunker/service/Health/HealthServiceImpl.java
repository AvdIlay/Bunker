package com.example.bunker.service.Health;

import com.example.bunker.model.Fact;
import com.example.bunker.model.Health;
import com.example.bunker.repository.HealthRepository;
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
public class HealthServiceImpl implements HealthService{
    private static final Logger LOG = LogManager.getLogger(HealthServiceImpl.class);

    @Resource
    private final HealthRepository healthRepository;

    @Override
    public Health findRandomHealth() {
        List<Health> listHealth = healthRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (Health health : listHealth) {
            elements.add(health.getId());
        }
        return healthRepository.findById(elements.get((int) new Random().nextLong(elements.size())))
                .orElseThrow();
    }
}
