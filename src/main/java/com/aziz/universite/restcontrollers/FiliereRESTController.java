package com.aziz.universite.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aziz.universite.entities.Filiere;
import com.aziz.universite.repos.FiliereRepository;

@RestController
@RequestMapping("/api/fil")
@CrossOrigin("*")
public class FiliereRESTController {

    @Autowired
    FiliereRepository filiereRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Filiere> getAllFilieres() {
        return filiereRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Filiere getFiliereById(@PathVariable("id") Long id) {
        return filiereRepository.findById(id).get();
    }
}
