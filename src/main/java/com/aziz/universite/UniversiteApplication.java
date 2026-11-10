package com.aziz.universite;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.aziz.universite.entities.Etudiant;
import com.aziz.universite.entities.Filiere;
import com.aziz.universite.entities.Role;
import com.aziz.universite.entities.User;
import com.aziz.universite.service.UserService;

@SpringBootApplication
public class UniversiteApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UniversiteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Etudiant.class, Filiere.class);
    }

    /*
    @PostConstruct
    void init_users() {
        // Rôles
        userService.addRole(new Role(null, "ADMIN"));
        userService.addRole(new Role(null, "USER"));

        // Utilisateurs
        userService.saveUser(new User(null, "admin", "123", true, null));
        userService.saveUser(new User(null, "aziz", "123", true, null));
        userService.saveUser(new User(null, "yassine", "123", true, null));

        // Affectation des rôles
        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("aziz", "USER");
        userService.addRoleToUser("yassine", "USER");
    }
    */
}
