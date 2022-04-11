package com.example.EmailSenderDemo.controllers;

import com.example.EmailSenderDemo.entities.Email;
import com.example.EmailSenderDemo.services.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/email")
@AllArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @CrossOrigin("*") // use for testing code with multiple host, but not recommended
    @PostMapping
    public void insertEmail(@RequestBody Email email){
         emailService.addNewEmail(email);
    }

    @GetMapping
    public List<String> getAllEmails(){
        return emailService.getAllEmails();
    }

    @GetMapping(path = "/sendEmail")
    public void sendEmailToAllEmails(){
        emailService.sendMail("mint@stick-hub.com",getAllEmails(),"Hello there");
    }


}
