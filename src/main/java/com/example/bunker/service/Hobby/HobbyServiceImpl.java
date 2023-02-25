package com.example.bunker.service.Hobby;

import com.example.bunker.model.Health;
import com.example.bunker.model.Hobby;
import com.example.bunker.repository.HobbyRepository;
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
public class HobbyServiceImpl implements HobbyService {
    private static final Logger LOG = LogManager.getLogger(HobbyServiceImpl.class);

    @Resource
    private final HobbyRepository hobbyRepository;

    @Override
    public Hobby findRandomHobby() {
        List<Hobby> listHobby = hobbyRepository.findAll();
        List<Long> elements = new ArrayList<>();
        for (Hobby hobby : listHobby) {
            elements.add(hobby.getId());
        }
        return hobbyRepository.findById(elements.get((int) new Random().nextLong(elements.size())))
                .orElseThrow();
    }
}
