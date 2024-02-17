package com.only_cloths.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "nombres", nullable = false, length = 80)
	private String Nombre;
	
	@Column(name = "descripcion", nullable = false, length = 100)
	private String Descripcion;
	
	@Column(name = "imagen", nullable = false, length = 30)
	private String Imagen;
	
	@Column(name = "precios", nullable = false, length = 30)
	private double Precio;
	
	@Column(name = "cantidad", nullable = false, length = 50)
	private int Cantidad;
	
	@ManyToOne
	private Usuario usuario;
	
	public Producto() {
		
	}

	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad) {
		super();
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		Imagen = imagen;
		Precio = precio;
		Cantidad = cantidad;
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

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Imagen=" + Imagen
				+ ", Precio=" + Precio + ", Cantidad=" + Cantidad + "]";
	}

}
