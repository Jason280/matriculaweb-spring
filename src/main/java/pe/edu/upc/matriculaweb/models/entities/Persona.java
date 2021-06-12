package pe.edu.upc.matriculaweb.models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personas")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NNombre", length = 50, nullable = false)
	private String nNombre;

	@Column(name = "NApellido", length = 50, nullable = false)
	private String nApellido;

	@Column(name = "TCorreo", length = 50, nullable = false)
	private String tCorreo;

	@Column(name = "DNacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dNacimiento;

	@Column(name = "TDireccion", length = 35, nullable = false)
	private String tDireccion;

	@Column(name = "TFoto", length = 40, nullable = false)
	private String tFoto;

	@Column(name = "DIngreso", nullable = false)
	private Date dIngreso;

	@Column(name = "BAdmin", nullable = false)
	private Boolean bitAdmin;

	@OneToMany(mappedBy = "persona")
	private List<Alumno> alumnos;

	@OneToMany(mappedBy = "persona")
	private List<Docente> docentes;
	
	public Persona() {
		alumnos = new ArrayList<Alumno>();
		docentes = new ArrayList<Docente>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnNombre() {
		return nNombre;
	}

	public void setnNombre(String nNombre) {
		this.nNombre = nNombre;
	}

	public String getnApellido() {
		return nApellido;
	}

	public void setnApellido(String nApellido) {
		this.nApellido = nApellido;
	}

	public String gettCorreo() {
		return tCorreo;
	}

	public void settCorreo(String tCorreo) {
		this.tCorreo = tCorreo;
	}

	public Date getdNacimiento() {
		return dNacimiento;
	}

	public void setdNacimiento(Date dNacimiento) {
		this.dNacimiento = dNacimiento;
	}

	public String gettDireccion() {
		return tDireccion;
	}

	public void settDireccion(String tDireccion) {
		this.tDireccion = tDireccion;
	}

	public String gettFoto() {
		return tFoto;
	}

	public void settFoto(String tFoto) {
		this.tFoto = tFoto;
	}

	public Date getdIngreso() {
		return dIngreso;
	}

	public void setdIngreso(Date dIngreso) {
		this.dIngreso = dIngreso;
	}



	public Boolean getBitAdmin() {
		return bitAdmin;
	}

	public void setBitAdmin(Boolean bitAdmin) {
		this.bitAdmin = bitAdmin;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	
	
	

}
