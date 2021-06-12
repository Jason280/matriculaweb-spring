package pe.edu.upc.matriculaweb.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "docentes")
public class Docente {

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "especialidad_id")
	private Especialidad especialidad;
	
	
	@OneToMany(mappedBy = "docente")
	private List<DocenteCurso> docentes_cursos;
	
	
	public Docente() {
		
		docentes_cursos = new ArrayList<DocenteCurso>();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Especialidad getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	public List<DocenteCurso> getDocentes_cursos() {
		return docentes_cursos;
	}


	public void setDocentes_cursos(List<DocenteCurso> docentes_cursos) {
		this.docentes_cursos = docentes_cursos;
	}


	

	
}
