package com.example.bunker.service.Health;

import com.example.bunker.model.Health;
import org.springframework.stereotype.Service;

@Service
public interface HealthService {
    Health findRandomHealth();
}
