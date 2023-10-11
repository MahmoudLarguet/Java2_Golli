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
	
	public Connexion() {
		try {
					
					connection = DriverManager.getConnection(connexionString,username,password);
					System.out.println("Connected Successfully");
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}

	public String getConnexionString() {
		return connexionString;
	}

	public void setConnexionString(String connexionString) {
		this.connexionString = connexionString;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	
	
}
