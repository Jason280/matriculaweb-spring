package pe.edu.upc.matriculaweb.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carrera_universitarias")
public class CarreraUniversitaria {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NCarrera", length = 25, nullable = false )
	private String nomCarrera;
	


	@OneToMany(mappedBy = "carreraUniversitaria")
	private List<Alumno> alumnos;
	
	@OneToMany(mappedBy = "carreraUniversitaria")
	private List<Curso> cursos;
	
	
	public CarreraUniversitaria() {
		alumnos = new ArrayList<Alumno>();
		cursos = new ArrayList<Curso>();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNomCarrera() {
		return nomCarrera;
	}


	public void setNomCarrera(String nomCarrera) {
		this.nomCarrera = nomCarrera;
	}



	public List<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
	
	
	
	
	
}
