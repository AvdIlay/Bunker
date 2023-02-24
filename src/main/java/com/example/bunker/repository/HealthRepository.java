package com.example.bunker.repository;



import com.example.bunker.model.Health;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends JpaRepository<Health, Long> {
}
