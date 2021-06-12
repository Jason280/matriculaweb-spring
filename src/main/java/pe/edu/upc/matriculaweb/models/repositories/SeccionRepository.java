package pe.edu.upc.matriculaweb.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.matriculaweb.models.entities.Seccion;

public interface SeccionRepository extends JpaRepository<Seccion, Integer> {

	Optional<Seccion> findByTxSeccion(String txSeccion) throws Exception;
}
