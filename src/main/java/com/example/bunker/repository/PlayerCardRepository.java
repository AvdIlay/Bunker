package com.example.bunker.repository;

import com.example.bunker.model.PlayerCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerCardRepository extends JpaRepository<PlayerCard, Long> {
}
