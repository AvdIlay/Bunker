package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "baggage")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Baggage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,
            generator = "native")
    private Long id;
    @Column
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Baggage baggage = (Baggage) o;
        return id != null && Objects.equals(id, baggage.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
