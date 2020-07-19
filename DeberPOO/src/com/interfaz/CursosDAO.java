package com.interfaz;

import java.util.List;

import com.entidades.Cursos;

public interface CursosDAO {

	List<Cursos> getCursos();
	public void ingresar(Cursos curso);
	public void actualizar(Cursos curso);
	public void eliminar(int id);
	
	
	
	
}
