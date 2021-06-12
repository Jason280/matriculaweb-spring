package pe.edu.upc.matriculaweb.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.matriculaweb.models.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

	List<Curso> findByNumNivel(Integer numNivel) throws Exception;
}
