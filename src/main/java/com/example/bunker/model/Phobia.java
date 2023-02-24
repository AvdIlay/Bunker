package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "phobia")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Phobia {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,
            generator = "native")
    private Long id;
    @Column
    private String title;
    @Column
    private String explanation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Phobia phobia = (Phobia) o;
        return id != null && Objects.equals(id, phobia.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
