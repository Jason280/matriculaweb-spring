package pe.edu.upc.matriculaweb.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.matriculaweb.models.entities.CarreraUniversitaria;

@Repository
public interface CarreraUniversitariaRepository extends JpaRepository<CarreraUniversitaria, Integer> {

	Optional<CarreraUniversitaria> findByNomCarrera(String nomCarrera) throws Exception;
}
