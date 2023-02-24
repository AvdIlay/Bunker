package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "playerCard")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class PlayerCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,
            generator = "native")
    private Long id;

    @JoinColumn
    @OneToOne
    private Professions professions;
    @JoinColumn
    @OneToOne
    private Health health;
    @JoinColumn
    @OneToOne
    private Hobby hobby;
    @JoinColumn
    @OneToOne
    private Fact fact1;
    @JoinColumn
    @OneToOne
    private Fact fact2;
    @JoinColumn
    @OneToOne
    private Baggage baggage;
    @JoinColumn
    @OneToOne
    private BiologicalCharacteristics biologicalCharacteristics;
    @JoinColumn
    @OneToOne
    private ActionCards actionCards1;
    @JoinColumn
    @OneToOne
    private ActionCards actionCards;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlayerCard that = (PlayerCard) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
