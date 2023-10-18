package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class ProfilDao {
	private Connection connection;
	public ProfilDao() {
		
	}
	public ProfilDao(Connection connection) {
		this.connection = connection;
	}
	public ArrayList<String> select_profiles() {
		ArrayList<String> profiles =new ArrayList<String>();
		try {
			String sqlQuery = "SELECT * FROM profil order by idprofil";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
			    // Retrieve data from columns
			    String profile = resultSet.getString("libelle");
			    profiles.add(profile);

			
			}
		}
		catch(Exception e) {
			
		}
	
		return profiles;
	}
	public ArrayList<Profil> selectOrderedProfiles() {
		ArrayList<Profil> profiles =new ArrayList<Profil>();
		try {
			String sqlQuery = "SELECT * FROM profil order by idprofil";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
			    // Retrieve data from columns
			    String libb = resultSet.getString("libelle");
			    int idlib = resultSet.getInt("idprofil");
			    profiles.add(new Profil(idlib,libb));

			
			}
		}
		catch(Exception e) {
			
		}
		
		return profiles;
	}
	public int insertProfil(Profil profile) {
		if(getLibelleId(profile.getLibelle())==0) {
			try {
				String insertSql = "INSERT INTO PROFIL (libelle) values (?)";
				 PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
				 preparedStatement.setString(1, profile.getLibelle());
				 preparedStatement.execute();
				 preparedStatement.close();
				
				
			}
			catch(Exception e) {
				
				return 0;
			}
			return 1;
		}
		return 0;
		
	}
	public int getLibelleId(String libelle) {
		int idprofil = 0;
		
		try {
			String sqlQuery = "SELECT * FROM profil where libelle = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, libelle);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
			    // Retrieve data from columns
			    idprofil = resultSet.getInt("idprofil");
			    

			
			}
		}
		catch(Exception e) {
		
		}
		return idprofil;
	}
	public String selectProfileById(int id) {
		String profil = "";
		
		try {
			String sqlQuery = "SELECT * FROM profil where idprofil = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
			    // Retrieve data from columns
			    profil = resultSet.getString("libelle");
			    

			
			}
		}
		catch(Exception e) {
		
		}
		return profil;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
}
