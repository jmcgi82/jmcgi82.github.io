package com.application.wedding.service;

import com.application.wedding.entities.Party;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RsvpData {

    private Party party;

    private String success;

    public RsvpData(){}

}
