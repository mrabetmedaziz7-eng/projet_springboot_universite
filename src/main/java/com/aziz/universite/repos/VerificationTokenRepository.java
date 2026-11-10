package com.aziz.universite.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aziz.universite.entities.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}

