package com.only_cloths.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "ordenes")
public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "numero", nullable = false, length = 50)
	private String Numero;
	
	@Column(name = "F.creacion", nullable = false, length = 20)
	private Date FechaCreacion;
	
	@Column(name = "F.recivida", nullable = false, length = 20)
	private Date FechaRecivida;
	
	@Column(name = "total", nullable = false, length = 50)
	private double Total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
	
	public Orden() {
		
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecivida, double total) {
		super();
		Id = id;
		Numero = numero;
		FechaCreacion = fechaCreacion;
		FechaRecivida = fechaRecivida;
		Total = total;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public Date getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public Date getFechaRecivida() {
		return FechaRecivida;
	}

	public void setFechaRecivida(Date fechaRecivida) {
		FechaRecivida = fechaRecivida;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [Id=" + Id + ", Numero=" + Numero + ", FechaCreacion=" + FechaCreacion + ", FechaRecivida="
				+ FechaRecivida + ", Total=" + Total + "]";
	}

}
