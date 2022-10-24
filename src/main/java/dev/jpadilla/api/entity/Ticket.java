package dev.jpadilla.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	//private Date created_at;
	private String created_by;
	private String equipo;
	private String incidencia;
	private String gravedad;
	private String version_sw;
	private String descripcion;
	private String estatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}*/

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public String getGravedad() {
		return gravedad;
	}

	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}

	public String getVersion_sw() {
		return version_sw;
	}

	public void setVersion_sw(String version_sw) {
		this.version_sw = version_sw;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		//return "ticket [id=" + id + ", titulo=" + titulo + ", created_at=" + created_at + ", created_by=" + created_by
		return "ticket [id=" + id + ", titulo=" + titulo + ", created_by=" + created_by
				+ ", equipo=" + equipo + ", incidencia=" + incidencia + ", gravedad=" + gravedad + ", version_sw="
				+ version_sw + ", descripcion=" + descripcion + ", estatus=" + estatus + "]";
	}

}
