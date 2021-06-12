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
@Table(name = "secciones")
public class Seccion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "TSeccion", length = 4, nullable = false)
	private String 	txSeccion;
	
	@OneToMany(mappedBy = "seccion")
	private List<Curso> cursos;
	
	public Seccion() {
		
		cursos = new ArrayList<Curso>();
	}



	

	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getTxSeccion() {
		return txSeccion;
	}

	public void setTxSeccion(String txSeccion) {
		this.txSeccion = txSeccion;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
	
	
}
