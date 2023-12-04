package com.application.wedding.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="parties")
@Data
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="party-name")
    private String partyName;

    @Column(name="party-size")
    private BigInteger partySize;

    @Column(name="party-email")
    private String partyEmail;

    @Column(name="party-phone")
    private String partyPhone;

    @Column(name="dietary-restrictions")
    private String dietaryRestrictions;

    @Column(name="create-time")
    @CreationTimestamp
    private Date createTime;

    @OneToMany(mappedBy = "party_id", cascade = CascadeType.ALL)
    private Set<Guest> guests;

    public Party(){};
}
