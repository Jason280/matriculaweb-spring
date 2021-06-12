package pe.edu.upc.matriculaweb.models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "matriculas")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "DFecha_matricula", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dFechaMatricula;
	
	
	@ManyToOne
	@JoinColumn(name = "alumno_id")
	private Alumno alumno;
	
	@OneToMany(mappedBy = "matricula")
	private List<DetalleMatricula> detalles_matriculas;
	
	public Matricula() {
		
		detalles_matriculas=new ArrayList<DetalleMatricula>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getdFechaMatricula() {
		return dFechaMatricula;
	}

	public void setdFechaMatricula(Date dFechaMatricula) {
		this.dFechaMatricula = dFechaMatricula;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public List<DetalleMatricula> getDetalles_matriculas() {
		return detalles_matriculas;
	}

	public void setDetalles_matriculas(List<DetalleMatricula> detalles_matriculas) {
		this.detalles_matriculas = detalles_matriculas;
	}

	
	
	
	

}
