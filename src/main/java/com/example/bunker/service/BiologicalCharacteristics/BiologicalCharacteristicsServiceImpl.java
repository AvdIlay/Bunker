package com.example.bunker.service.BiologicalCharacteristics;

import com.example.bunker.model.Baggage;
import com.example.bunker.model.BiologicalCharacteristics;
import com.example.bunker.repository.BiologicalCharacteristicsRepository;
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
public class BiologicalCharacteristicsServiceImpl implements BiologicalCharacteristicsService {
    private static final Logger LOG = LogManager.getLogger(BiologicalCharacteristicsServiceImpl.class);

    @Resource
    private final BiologicalCharacteristicsRepository biologicalCharacteristicsRepository;


    @Override
    public BiologicalCharacteristics findRandomBiologicalCharacteristics() {
        List<BiologicalCharacteristics> listBiologicalCharacteristics = biologicalCharacteristicsRepository.findAll();
        System.out.println(listBiologicalCharacteristics);
        List<Long> elements = new ArrayList<>();
        for (BiologicalCharacteristics biologicalCharacteristic : listBiologicalCharacteristics) {
            elements.add(biologicalCharacteristic.getId());
        }
        return biologicalCharacteristicsRepository.findById(elements.get((int) new Random().nextLong(elements.size())))
                .orElseThrow();
    }
}
