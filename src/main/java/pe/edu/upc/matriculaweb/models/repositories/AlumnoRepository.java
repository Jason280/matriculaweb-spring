package pe.edu.upc.matriculaweb.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.matriculaweb.models.entities.Alumno;


@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

	List<Alumno> findByBitHabilitado(Boolean bitHabilitado) throws Exception;
	
}
