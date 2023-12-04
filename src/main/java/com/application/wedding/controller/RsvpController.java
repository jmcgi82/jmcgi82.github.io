package com.application.wedding.controller;

import com.application.wedding.service.RsvpData;
import com.application.wedding.service.RsvpDataResponse;
import com.application.wedding.service.RsvpService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/parties")
public class RsvpController {

    private RsvpService service;

    public RsvpController(RsvpService service) { this.service = service;}


    @PostMapping("/rsvp")
    public RsvpDataResponse response(@RequestBody RsvpData rsvpData) {
        return this.service.respond(rsvpData);
    }

}
