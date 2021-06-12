package pe.edu.upc.matriculaweb.services;

import java.util.Optional;

import pe.edu.upc.matriculaweb.models.entities.Especialidad;

public interface EspecialidadService extends CrudService<Especialidad, Integer> {

	Optional<Especialidad> findByNomEspecialidad(String nomEspecialidad) throws Exception;

}
