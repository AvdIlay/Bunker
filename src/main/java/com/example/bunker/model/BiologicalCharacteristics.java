package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "biologicalCharacteristics")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BiologicalCharacteristics {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,
            generator = "native")
    private Long id;
    @Column
    private Gender gender;
    @Column
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BiologicalCharacteristics that = (BiologicalCharacteristics) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
