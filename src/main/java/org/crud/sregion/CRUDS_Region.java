package org.crud.sregion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//app java ----> JDBC ----> oracle

public class CRUDS_Region {
	
	public static Connection connection = null;
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public static void connectDataBaseOracle() throws  IOException, SQLException{
		try {
			Class.forName(driver).newInstance();
			System.out.println("CARGO DRIVER: ojdbc6.jar");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		try {
			connection = DriverManager.getConnection(URL,"System","Tengohambre10");
			System.out.println("CONEXION EXITOSA: Oracle11g");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) throws IOException, SQLException{
		connectDataBaseOracle();
	}
	
}
