package com.aziz.universite.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.aziz.universite.entities.Filiere;

@RepositoryRestResource(path = "fil")
@CrossOrigin("http://localhost:4200/")
public interface FiliereRepository extends JpaRepository<Filiere, Long> {
}
