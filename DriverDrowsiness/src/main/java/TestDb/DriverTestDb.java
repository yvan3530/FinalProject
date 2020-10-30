package TestDb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
/**
 * Servlet implementation class DriverTestDb
 */
@WebServlet("/DriverTestDb")
public class DriverTestDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String user= "root";
		String password ="";
		String jdbcUrl = "jdbc:mysql://localhost:3306/finalproject?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			
			PrintWriter printwriter = response.getWriter();
			printwriter.println("connetion to db" + jdbcUrl);
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
			printwriter.println("sucessss!!!!!!");
			conn.close();
		}
		catch(Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
			
		}
				
	}


}
