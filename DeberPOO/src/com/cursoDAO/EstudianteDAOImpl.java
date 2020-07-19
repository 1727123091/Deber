package com.cursoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entidades.Estudiante;
import com.interfaz.EstudianteDAO;
import conn.util.Util;

public class EstudianteDAOImpl implements EstudianteDAO {

	@Override
	public List<Estudiante> getEstudiante() {
		List<Estudiante> estudiante = new ArrayList<>(); 
		Connection con; 
	        
		try 
	       {
	           con = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
	           
	           
	      
	           String sql ="SELECT id_es, nombre_es, apellidos, email FROM public.estudiantes;";
	           
	           PreparedStatement stm = con.prepareStatement(sql);
	           ResultSet rs = stm.executeQuery();
	           while(rs.next()){
	        	   Estudiante estudiant = new Estudiante(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
	        	   estudiante.add(estudiant) ;        
	            }      +
	           
	       }   
	         catch (SQLException e) {
	        	 e.printStackTrace();
	         }
			return estudiante;
		
		
	}

	@Override
	public void ingresar(Estudiante estudiante) {
		
		String query ="INSERT INTO public.estudiantes(id_es, nombre_es, apellidos, email)VALUES (?, ?, ?, ?)";
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setInt(1, estudiante.getId_es());
			stm.setString(2, estudiante.getNombres_es());
			stm.setString(3, estudiante.getApellidos());
			stm.setString(4, estudiante.getEmail());
			
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		String query ="UPDATE public.estudiantes SET nombre_es=?, WHERE=?;";
		Connection conn;
	try
	   {
		conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		PreparedStatement stm = conn.prepareStatement(query);  
		stm.setString(1, estudiante.getNombres_es());
		stm.setString(2, estudiante.getApellidos());
		stm.setString(3, estudiante.getEmail());	
		stm.setInt(4, estudiante.getId_es());
		stm.execute();
		   
	   }
	   	   
         catch (SQLException e) {
	// TODO Auto-generated catch block
	      e.printStackTrace();
        }

	}

	@Override
	public void eliminar(int id_es) {
		String query ="DELETE FROM public.estudiantes WHERE = ?;";
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setInt(1, id_es);
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		

	}

}
