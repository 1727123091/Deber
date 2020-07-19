package com.interfaz;

import java.util.List;

import com.entidades.Estudiante;

public interface EstudianteDAO {
	List<Estudiante>getEstudiante();
	public void ingresar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);
	
	

}
