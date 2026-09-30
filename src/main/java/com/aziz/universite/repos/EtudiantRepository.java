package com.aziz.universite.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.aziz.universite.entities.Etudiant;
import com.aziz.universite.entities.Filiere;

@RepositoryRestResource(path = "rest")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findByNomEtudiant(String nom);
	List<Etudiant> findByNomEtudiantContains(String nom);	

	@Query("select e from Etudiant e where e.nomEtudiant like %:nom and e.dateNaissance > :date")
	List<Etudiant> findByNomDate(@Param("nom") String nom, @Param("date") Date date);

	@Query("select e from Etudiant e where e.filiere = ?1")
	List<Etudiant> findByFiliere(Filiere filiere);

	List<Etudiant> findByFiliereIdFiliere(Long id);

	List<Etudiant> findByOrderByNomEtudiantAsc();

	@Query("select e from Etudiant e order by e.nomEtudiant ASC, e.dateNaissance DESC")
	List<Etudiant> trierEtudiantsNomsDate();
}
