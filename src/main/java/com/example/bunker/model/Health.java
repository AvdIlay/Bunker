package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "health")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Health {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,
            generator = "native")
    private Long id;

    @Column
    private String health;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Health health = (Health) o;
        return id != null && Objects.equals(id, health.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
