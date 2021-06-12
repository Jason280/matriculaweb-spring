package pe.edu.upc.matriculaweb.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.matriculaweb.models.entities.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}
