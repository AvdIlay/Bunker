package com.example.bunker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "playerCard")
@Getter
@Setter
@ToString
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
    private Phobia phobia;
    @JoinColumn
    @OneToOne
    private BiologicalCharacteristics biologicalCharacteristics;
    @JoinColumn
    @OneToOne(fetch = FetchType.LAZY)
    private ActionCards actionCards1;
    @JoinColumn
    @OneToOne
    private ActionCards actionCards2;

//    public PlayerCard() {
//        this.id = getId();
//        this.professions = getProfessions();
//        this.health = getHealth();
//        this.hobby = getHobby();
//        this.fact1 = getFact1();
//        this.fact2 = getFact2();
//        this.baggage = getBaggage();
//        this.phobia = getPhobia();
//        this.biologicalCharacteristics = getBiologicalCharacteristics();
//        this.actionCards1 = getActionCards1();
//        this.actionCards2 = getActionCards2();
//    }

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
