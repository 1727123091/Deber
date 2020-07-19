package com.entidades;

public class Estudiante {

	private int id_es;
	private String nombres_es;
	private String apellidos;
	private String email;
	public int getId_es() {
		return id_es;
	}
	public void setId_es(int id_es) {
		this.id_es = id_es;
	}
	public String getNombres_es() {
		return nombres_es;
	}
	public void setNombres_es(String nombres_es) {
		this.nombres_es = nombres_es;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Estudiante(int id_es, String nombres_es, String apellidos, String email) {
		super();
		this.id_es = id_es;
		this.nombres_es = nombres_es;
		this.apellidos = apellidos;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Estudiante [id_es=" + id_es + ", nombres_es=" + nombres_es + ", apellidos=" + apellidos + ", email="
				+ email + "]";
	}
	
	
	
	
	
	
}
