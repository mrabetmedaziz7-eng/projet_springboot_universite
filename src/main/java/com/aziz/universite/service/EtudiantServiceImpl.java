package com.aziz.universite.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aziz.universite.entities.Etudiant;
import com.aziz.universite.entities.Filiere;
import com.aziz.universite.repos.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    //@Autowired
    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
		super();
		this.etudiantRepository = etudiantRepository;
	}

	@Override
    public Etudiant saveEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
    
    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiant(Etudiant e) {
        etudiantRepository.delete(e);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> findByNomEtudiant(String nom) {
        return etudiantRepository.findByNomEtudiant(nom);
    }

    @Override
    public List<Etudiant> findByNomEtudiantContains(String nom) {
        return etudiantRepository.findByNomEtudiantContains(nom);
    }

    @Override
    public List<Etudiant> findByNomDate(String nom, Date date) {
        return etudiantRepository.findByNomDate(nom, date);
    }

    @Override
    public List<Etudiant> findByFiliere(Filiere filiere) {
        return etudiantRepository.findByFiliere(filiere);
    }

    @Override
    public List<Etudiant> findByFiliereIdFiliere(Long id) {
        return etudiantRepository.findByFiliereIdFiliere(id);
    }

    @Override
    public List<Etudiant> findByOrderByNomEtudiantAsc() {
        return etudiantRepository.findByOrderByNomEtudiantAsc();
    }

    @Override
    public List<Etudiant> trierEtudiantsNomsDate() {
        return etudiantRepository.trierEtudiantsNomsDate();
    }
}