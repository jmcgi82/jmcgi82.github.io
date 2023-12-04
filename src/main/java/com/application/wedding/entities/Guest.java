package com.application.wedding.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="guests")
@Data
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="party-id")
    private Party party_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="meal-id", referencedColumnName = "id")
    private Meal meal_id;

    public Guest(){};
}
