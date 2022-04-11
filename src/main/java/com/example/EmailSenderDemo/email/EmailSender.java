package com.example.EmailSenderDemo.email;

import javax.mail.MessagingException;
import java.util.List;

public interface EmailSender {

     void sendMail(String from, List<String> to, String subject) throws MessagingException;
}
