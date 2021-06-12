package pe.edu.upc.matriculaweb.services;

import java.util.Optional;

import pe.edu.upc.matriculaweb.models.entities.Persona;

public interface PersonaService extends CrudService<Persona, Integer>{

	Optional<Persona> findByBitAdmin(Boolean bitAdmin) throws Exception;
}
