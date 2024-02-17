package com.only_cloths.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "detalles")
public class DetalleOrden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "nombres", nullable = false, length = 50)
	private String Nombre;
	
	@Column(name = "cantidad", nullable = false, length = 50)
	private double Cantidad;
	
	@Column(name = "precio", nullable = false, length = 40)
	private double Precio;
	
	@Column(name = "total", nullable = false, length = 50)
	private double Total;
	
	@OneToOne
	private Orden orden;
	
	@ManyToOne
	private Producto producto; 
	
	public DetalleOrden() {
		
	}

	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
		super();
		Id = id;
		Nombre = nombre;
		Cantidad = cantidad;
		Precio = precio;
		Total = total;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public double getCantidad() {
		return Cantidad;
	}


	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public double getTotal() {
		return Total;
	}


	public void setTotal(double total) {
		Total = total;
	}


	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleOrden [Id=" + Id + ", Nombre=" + Nombre + ", Cantidad=" + Cantidad + ", Precio=" + Precio
				+ ", Total=" + Total + "]";
	}

}
