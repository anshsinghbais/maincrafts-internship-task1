package com.example.demo.controller;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") 
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact) {
        return repo.save(contact);
    }
}