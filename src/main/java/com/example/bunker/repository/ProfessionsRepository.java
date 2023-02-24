package com.example.bunker.repository;



import com.example.bunker.model.Professions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionsRepository extends JpaRepository<Professions, Long> {
}
