package com.example.bunker.service.Hobby;

import com.example.bunker.model.Hobby;
import org.springframework.stereotype.Service;

@Service
public interface HobbyService {
    Hobby findRandomHobby();
}
