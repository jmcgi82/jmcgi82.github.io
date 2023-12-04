package com.application.wedding.dao;

import com.application.wedding.entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface PartyRepository extends JpaRepository<Party, Long> {
}
