package pe.edu.upc.matriculaweb.services;

import java.util.Optional;

import pe.edu.upc.matriculaweb.models.entities.Seccion;

public interface SeccionService extends CrudService<Seccion, Integer>{
	Optional<Seccion> findByTxSeccion(String txSeccion) throws Exception;

}
