package com.application.wedding.service;

import com.application.wedding.dao.PartyRepository;
import com.application.wedding.entities.Party;
import jakarta.servlet.http.Part;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class RsvpDataService implements RsvpService {

    private final PartyRepository repo;


    public RsvpDataService(PartyRepository repo) {
        this.repo = repo;
    }

    @Override
    public RsvpDataResponse respond(RsvpData data) {
        Party party = data.getParty();

        List<Party> parties = this.repo.findAll();
        RsvpDataResponse success = new RsvpDataResponse();

        for (Party p : parties) {
            if (p.getPartyEmail().equalsIgnoreCase(party.getPartyEmail())) {
                success.setSuccess("email");
                return success;
            }

            if (p.getPartyPhone().equalsIgnoreCase(party.getPartyPhone())) {
                success.setSuccess("phone");
                return success;
            }
        }

        this.repo.save(party);

        success.setSuccess("true");

        return success;
    }
}
