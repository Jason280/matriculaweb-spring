package pe.edu.upc.matriculaweb.services;

import java.util.List;

import pe.edu.upc.matriculaweb.models.entities.Alumno;

public interface AlumnoService extends CrudService<Alumno, Integer>{

	List<Alumno> findByBitHabilitado(Boolean bitHabilitado) throws Exception;

}
