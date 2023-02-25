package com.example.bunker.service.Fact;

import com.example.bunker.model.Fact;
import org.springframework.stereotype.Service;

@Service
public interface FactService {
    Fact findRandomFact();
}
