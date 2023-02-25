package com.example.bunker.service.PlayerCard;

import com.example.bunker.repository.PlayerCardRepository;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerCardServiceImpl implements PlayerCardService{
    private static final Logger LOG = LogManager.getLogger(PlayerCardServiceImpl.class);

    @Resource
    private final PlayerCardRepository playerCardRepository;
}
