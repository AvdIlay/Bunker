package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "fact")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Fact {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,
            generator = "native")
    private Long id;
    @Column
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Fact fact = (Fact) o;
        return id != null && Objects.equals(id, fact.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
