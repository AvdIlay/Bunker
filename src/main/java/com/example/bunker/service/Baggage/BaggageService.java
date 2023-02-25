package com.example.bunker.service.Baggage;

import com.example.bunker.model.Baggage;
import org.springframework.stereotype.Service;

@Service
public interface BaggageService {
    Baggage findRandomBaggage();
}
