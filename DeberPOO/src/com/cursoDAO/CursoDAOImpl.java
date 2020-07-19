package com.cursoDAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entidades.Cursos;
import com.interfaz.CursosDAO;
import com.util.Util;

public class CursoDAOImpl implements CursosDAO {
	 

	@Override
	public List<Cursos> getCursos() {
		List<Cursos> cursos = new ArrayList<>(); 
		Connection con; 
	        
         try 
       {
           con = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
           
           
      
           String sql ="SELECT id_cur, nombres_cur FROM public.cursos;";
           
           PreparedStatement stm = con.prepareStatement(sql);
           ResultSet rs = stm.executeQuery();
           while(rs.next()){
              Cursos curso = new Cursos(rs.getInt(1), rs.getString(2));
              cursos.add(curso) ;        
            }       
           
       }   
         catch (SQLException e) 
         
       {
       	 e.printStackTrace();
       }	
		
		
		
		return cursos;
	}

	@Override
	public void ingresar(Cursos curso) {
      String  query ="INSERT INTO public.cursos(nombres_cur)VALUES (?);";
		
		
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setString(1, curso.getNombre());
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

	@Override
	public void actualizar(Cursos curso) {
		String query = "UPDATE public.cursos SET id_cur=?, nombres_cur=? WHERE id=?;";
		
		 Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setString(1, curso.getNombre());
			stm.setInt(2, curso.getId());
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

	@Override
	public void eliminar(int id) {
		String query ="DELETE FROM public.cursos WHERE id_cur=?";
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setInt(1, id);
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
