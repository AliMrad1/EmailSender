package com.example.EmailSenderDemo.repositories;

import com.example.EmailSenderDemo.entities.Email;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmailRepositoryTest {

    @Autowired
    private EmailRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void findSameEmail() {
        String email = "alimrad@gmail.com";

        Email email1 = new Email();
        email1.setEmail("alimrad@gmail.com");

        underTest.save(email1);

        Optional<Email> emailExist = underTest.findSameEmail(email);
        boolean expected = emailExist.isPresent();

        Assertions.assertThat(expected).isTrue();
    }

    @Test
    void getAllEmails() {
        Iterable<Email> emails = underTest.findAll();
        emails.forEach(System.out::println);

        Assertions.assertThat(emails.iterator()).isNotNull();
    }
}