package com.example.bunker.service.Phobia;

import com.example.bunker.model.Phobia;
import org.springframework.stereotype.Service;

@Service
public interface PhobiaService {
    Phobia findRandomPhobia();
}
