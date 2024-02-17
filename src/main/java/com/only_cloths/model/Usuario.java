package com.only_cloths.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "nombres", nullable = false, length = 80)
	private String Nombre;
	
	@Column(name = "nombreUsuario", nullable = false, length = 50)
	private String UserName;
	
	@Column(name = "email", nullable = false, length = 50)
	private String Email;
	
	@Column(name = "direccion", nullable = false, length = 80)
	private String Direccion;
	
	@Column(name = "telefono", nullable = false, length = 20)
	private String Telefono;
	
	@Column(name = "tipo", nullable = false, length = 40)
	private String Tipo;
	
	@Column(name = "password", nullable = false, length = 20)
	private String Password;
	
	@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;
	
	@OneToMany(mappedBy = "usuario")
	private List<Orden> ordenes;
	
	public Usuario() {
	
	}

	public Usuario(Integer id, String nombre, String userName, String email, String direccion, String telefono,
			String tipo, String password) {
		super();
		Id = id;
		Nombre = nombre;
		UserName = userName;
		Email = email;
		Direccion = direccion;
		Telefono = telefono;
		Tipo = tipo;
		Password = password;
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

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}

	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", Nombre=" + Nombre + ", UserName=" + UserName + ", Email=" + Email
				+ ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Tipo=" + Tipo + ", Password=" + Password
				+ "]";
	}

}
