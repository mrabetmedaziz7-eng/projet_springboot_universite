package com.aziz.universite;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.aziz.universite.entities.Etudiant;
import com.aziz.universite.entities.Filiere;
import com.aziz.universite.repos.EtudiantRepository;

@SpringBootTest
class UniversiteApplicationTests {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    public void testCreateEtudiant() {
        Etudiant e = new Etudiant("Ben Ali", "Sami", new Date());
        etudiantRepository.save(e);
    }

    @Test
    public void testFindEtudiant() {
        Etudiant e = etudiantRepository.findById(1L).get();
        System.out.println(e);
    }

    @Test
    public void testUpdateEtudiant() {
        Etudiant e = etudiantRepository.findById(1L).get();
        e.setPrenomEtudiant("Ahmed");
        etudiantRepository.save(e);
    }

    @Test
    public void testDeleteEtudiant() {
        etudiantRepository.deleteById(1L);
    }

    @Test
    public void testListerTousEtudiants() {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }
    @Test
    public void testFindByNomEtudiant() {
        List<Etudiant> etudiants = etudiantRepository.findByNomEtudiant("Ben Ali");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindByNomEtudiantContains() {
        List<Etudiant> etudiants = etudiantRepository.findByNomEtudiantContains("Ben");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindByNomDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 0, 1);
        List<Etudiant> etudiants = etudiantRepository.findByNomDate("Ben", cal.getTime());
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindByFiliere() {
        Filiere f = new Filiere();
        f.setIdFiliere(1L);
        List<Etudiant> etudiants = etudiantRepository.findByFiliere(f);
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindByFiliereIdFiliere() {
        List<Etudiant> etudiants = etudiantRepository.findByFiliereIdFiliere(1L);
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindByOrderByNomEtudiantAsc() {
        List<Etudiant> etudiants = etudiantRepository.findByOrderByNomEtudiantAsc();
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Test
    public void testTrierEtudiantsNomsDate() {
        List<Etudiant> etudiants = etudiantRepository.trierEtudiantsNomsDate();
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }
}