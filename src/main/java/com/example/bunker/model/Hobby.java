package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "hobby")
@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Hobby {
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
        Hobby hobby = (Hobby) o;
        return id != null && Objects.equals(id, hobby.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
