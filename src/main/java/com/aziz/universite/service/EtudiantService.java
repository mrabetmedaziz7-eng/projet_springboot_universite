package com.aziz.universite.service;

import java.util.Date;
import java.util.List;
import com.aziz.universite.entities.Etudiant;
import com.aziz.universite.entities.Filiere;

public interface EtudiantService {
    Etudiant saveEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    void deleteEtudiant(Etudiant e);
    void deleteEtudiantById(Long id);
    Etudiant getEtudiant(Long id);
    List<Etudiant> getAllEtudiants();

    List<Etudiant> findByNomEtudiant(String nom);
    List<Etudiant> findByNomEtudiantContains(String nom);
    List<Etudiant> findByNomDate(String nom, Date date);
    List<Etudiant> findByFiliere(Filiere filiere);
    List<Etudiant> findByFiliereIdFiliere(Long id);
    List<Etudiant> findByOrderByNomEtudiantAsc();
    List<Etudiant> trierEtudiantsNomsDate();
}

