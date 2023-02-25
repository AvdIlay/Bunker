package com.example.bunker.service.Professions;

import com.example.bunker.model.Professions;
import org.springframework.stereotype.Service;

@Service
public interface ProfessionsService {
    Professions findRandomProfessions();
}
