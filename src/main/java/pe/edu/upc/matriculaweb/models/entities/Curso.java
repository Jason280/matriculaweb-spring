package pe.edu.upc.matriculaweb.models.entities;

import java.util.ArrayList;
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

@Entity
@Table(name = "cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name = "seccion_id", nullable = false)
	private Seccion seccion;
	
	
	@Column(name = "NCurso", length = 25, nullable = false)
	private String nCurso;
	
	
	@Column(name="TCurso", length = 70, nullable = false)
	private String tCurso;
	
	
	@Column(name = "NumNivel", nullable=false)
	private Integer numNivel;
	
	@Column(name="NumVacantes", nullable=false)
	private Integer numVacantes;
	
	

	@ManyToOne
	@JoinColumn(name = "carrera_universitaria_id")
	private CarreraUniversitaria carreraUniversitaria;
	
	

	@OneToMany(mappedBy = "curso")
	private List<DocenteCurso> docentes_cursos;
	
	@OneToMany(mappedBy = "curso")
	private List<DetalleHorario> detalles_horarios;
	
	@OneToMany(mappedBy = "curso")
	private List<DetalleMatricula> detalles_matriculas;
	
	
	
	public Curso() {
		
		docentes_cursos=new ArrayList<DocenteCurso>();
		detalles_horarios=new ArrayList<DetalleHorario>();
		detalles_matriculas=new ArrayList<DetalleMatricula>();
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Seccion getSeccion() {
		return seccion;
	}



	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}



	public String getnCurso() {
		return nCurso;
	}



	public void setnCurso(String nCurso) {
		this.nCurso = nCurso;
	}



	public String gettCurso() {
		return tCurso;
	}



	public void settCurso(String tCurso) {
		this.tCurso = tCurso;
	}



	public Integer getNumNivel() {
		return numNivel;
	}



	public void setNumNivel(Integer numNivel) {
		this.numNivel = numNivel;
	}



	public Integer getNumVacantes() {
		return numVacantes;
	}



	public void setNumVacantes(Integer numVacantes) {
		this.numVacantes = numVacantes;
	}






	public CarreraUniversitaria getCarreraUniversitaria() {
		return carreraUniversitaria;
	}



	public void setCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria) {
		this.carreraUniversitaria = carreraUniversitaria;
	}



	public List<DocenteCurso> getDocentes_cursos() {
		return docentes_cursos;
	}



	public void setDocentes_cursos(List<DocenteCurso> docentes_cursos) {
		this.docentes_cursos = docentes_cursos;
	}



	public List<DetalleHorario> getDetalles_horarios() {
		return detalles_horarios;
	}



	public void setDetalles_horarios(List<DetalleHorario> detalles_horarios) {
		this.detalles_horarios = detalles_horarios;
	}



	public List<DetalleMatricula> getDetalles_matriculas() {
		return detalles_matriculas;
	}



	public void setDetalles_matriculas(List<DetalleMatricula> detalles_matriculas) {
		this.detalles_matriculas = detalles_matriculas;
	}



	
	
	

}
