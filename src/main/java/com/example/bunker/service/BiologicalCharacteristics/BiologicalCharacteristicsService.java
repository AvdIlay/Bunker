package com.example.bunker.service.BiologicalCharacteristics;

import com.example.bunker.model.BiologicalCharacteristics;
import org.springframework.stereotype.Service;

@Service
public interface BiologicalCharacteristicsService {
    BiologicalCharacteristics findRandomBiologicalCharacteristics();
}
