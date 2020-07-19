package conn.estudiantesonline;



import java.util.List;

import com.cursoDAO.CursoDAOImpl;
import com.cursoDAO.EstudianteDAOImpl;
import com.entidades.Cursos;
import com.entidades.Estudiante;
import com.interfaz.CursosDAO;
import com.interfaz.EstudianteDAO;

public class Main {
	  static String URL = "jdbc:postgresql://localhost:5433/sistema";
	  static String USUARIO = "postgres";
	  static String CLAVE = "1727123";
	

	  public static void main(String[] args) {
		  
		  EstudianteDAO estudianteDAO = new EstudianteDAOImpl();     
		  Estudiante estudiante;
		estudianteDAO.ingresar(estudiante);		 
		  List<Estudiante> Estudiante = estudianteDAO.getEstudiante(); 
          System.out.println(Estudiante);
          
		  
          /*
  		Connection conn;
  		try {
  			conn = DriverManager.getConnection(url, user, password);
  			System.out.println("Conexion Exitosa");
  			 String sql="SELECT idcurso,nombre FROM CURSO";
  			 
  			PreparedStatement stm=conn.prepareStatement(sql);
  			ResultSet rs = stm.executeQuery();
  			while(rs.next()) {
  				System.out.println(rs.getInt()+ " "+ rs.getString(2));
  			}
  			
  		} catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  	}
  	*/
	
	}

}
