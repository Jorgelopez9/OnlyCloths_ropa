package com.only_cloths.service;

import java.util.List;
import java.util.Optional;


import com.only_cloths.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	List<Producto> listar();

}
