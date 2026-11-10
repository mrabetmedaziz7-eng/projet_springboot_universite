package com.aziz.universite.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aziz.universite.entities.Etudiant;
import com.aziz.universite.service.EtudiantService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EtudiantRESTController {

    @Autowired
    EtudiantService etudiantService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public Etudiant getEtudiantById(@PathVariable("id") Long id) {
        return etudiantService.getEtudiant(id);
    }

    @RequestMapping(path = "/addetud", method = RequestMethod.POST)
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.saveEtudiant(etudiant);
    }

    @RequestMapping(path = "/updateetud", method = RequestMethod.PUT)
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @RequestMapping(value = "/deletud/{id}", method = RequestMethod.DELETE)
    public void deleteEtudiant(@PathVariable("id") Long id) {
        etudiantService.deleteEtudiantById(id);
    }

    @RequestMapping(value = "/etudfiliere/{idFiliere}", method = RequestMethod.GET)
    public List<Etudiant> getEtudiantsByFiliere(@PathVariable("idFiliere") Long idFiliere) {
        return etudiantService.findByFiliereIdFiliere(idFiliere);
    }

    @RequestMapping(value = "/etudsByName/{nom}", method = RequestMethod.GET)
    public List<Etudiant> findByNomEtudiantContains(@PathVariable("nom") String nom) {
        return etudiantService.findByNomEtudiantContains(nom);
    }
}
