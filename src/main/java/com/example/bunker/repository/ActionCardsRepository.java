package com.example.bunker.repository;


import com.example.bunker.model.ActionCards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionCardsRepository extends JpaRepository<ActionCards, Long> {
}
