package com.example.EmailSenderDemo.repositories;

import com.example.EmailSenderDemo.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmailRepository extends JpaRepository<Email,Long> {

    @Query("SELECT s FROM Email s WHERE s.email =?1")
    Optional<Email> findSameEmail(String email);

    @Query("SELECT email FROM Email")
    List<String> getAllEmails();// you can use built in method findAll
}
