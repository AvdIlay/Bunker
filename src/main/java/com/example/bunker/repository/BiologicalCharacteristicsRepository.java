package com.example.bunker.repository;


import com.example.bunker.model.BiologicalCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiologicalCharacteristicsRepository extends JpaRepository<BiologicalCharacteristics, Long> {
}
