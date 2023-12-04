package com.application.wedding.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="meals")
@Getter
@Setter
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="meal-name")
    private String mealName;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private Set<MealItem> mealItemSet;

    public Meal(){};
}
