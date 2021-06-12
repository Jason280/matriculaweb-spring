package pe.edu.upc.matriculaweb.services;

import java.util.List;

import pe.edu.upc.matriculaweb.models.entities.Curso;

public interface CursoService extends CrudService<Curso, Integer> {
	
	List<Curso> findByNumNivel(Integer numNivel) throws Exception;

}
