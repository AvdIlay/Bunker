package com.example.bunker.repository;


import com.example.bunker.model.Phobia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhobiaRepository extends JpaRepository<Phobia, Long> {
}
