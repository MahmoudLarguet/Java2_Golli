package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connexion {
	private String connexionString = "jdbc:oracle:thin:@localhost:1521";
	private String username = "mahmoud";
	private String password = "hello";
	private Connection connection;
	private String SELECT_ALL_PROFIL = "select * from profil";
	private String SELECT_ALL_EMPLOYE = "select * from employe";
	
	public Connexion() {
		try {
					
					connection = DriverManager.getConnection(connexionString,username,password);
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
	
	
}
