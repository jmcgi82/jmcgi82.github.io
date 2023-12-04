package com.application.wedding.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="meal-items")
@Getter
@Setter
public class MealItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="meal-item-name")
    private String mealItemName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal-id", insertable = false, updatable = false)
    private Meal meal;

    public MealItem(){};
}
