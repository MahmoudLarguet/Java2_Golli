package view;
import javax.swing.*;

import model.Connexion;
import model.EmployeDao;
import model.ProfilDao;
import model.Profil;
import model.Employe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import view.MenuBar;

public class MainFrame extends JFrame implements ActionListener {
	private MenuBar menuBar ;
	private TabMenu tabs;
	private Connection connection;
	private ProfilDao profilDao;
	private ArrayList<Employe> employes;
	private EmployeDao employeDao;
	private int currentEmployeIndex;
	public MainFrame() {
		super("Gestion Des Employes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		ImageIcon pic = new ImageIcon("image/welcome.jpg");
		setIconImage(pic.getImage());
		
		initComponents();
		initConnexion();
		initData();
		
		
		
	}
	public void initConnexion() {
		Connexion conn = new Connexion();
		connection = conn.getConnection();
		profilDao = new ProfilDao(connection);
		employeDao = new EmployeDao(connection);
		
		
	}
	public void initComponents() {
		menuBar = new MenuBar();
		tabs = new TabMenu();
		//Font f = new Font("Serif",Font.BOLD,25);
		//setFont(f);
		setSize(1300,700);
		setJMenuBar(menuBar);
		add(tabs);
		tabs.setEnabledAt(1, false);
		tabs.setEnabledAt(2,false);
		tabs.setEnabledAt(3,false);
		menuBar.getRedItem().addActionListener(this);
		menuBar.getBlueItem().addActionListener(this);
		menuBar.getGestionEmployerItem().addActionListener(this);
		menuBar.getGestionProfileItem().addActionListener(this);
		menuBar.getGestion_Emp_ProfileItem().addActionListener(this);
		menuBar.getQuitItem().addActionListener(this);
		menuBar.getCinItem().addActionListener(this);
		menuBar.getNomItem().addActionListener(this);
		tabs.getGestionEmpl().getAnnuler().addActionListener(this);
		tabs.getGestionProfil().getAjouter().addActionListener(this);
		tabs.getGestionProfil().getAnnuler().addActionListener(this);
		tabs.getGestionEmpl().getAjouter().addActionListener(this);
		tabs.getGestionEmpl().getNext().addActionListener(this);
		tabs.getGestionEmpl().getPrevious().addActionListener(this);
		tabs.getGestionEmpl().getModif().addActionListener(this);
		tabs.getGestionEmpl().getSuprimer().addActionListener(this);
		
	}
	public void initData() {
		tabs.getGestionEmpl().setProfileSelection(profilDao.select_profiles());
		tabs.getList().setProfileSelection(profilDao.select_profiles());
		employes = employeDao.selectEmployes();
		Employe employe = employes.get(currentEmployeIndex);
		tabs.getGestionEmpl().getCinfield().setText(employe.getCin());
		tabs.getGestionEmpl().getNom().setText(employe.getNom());
		tabs.getGestionEmpl().getPrenom().setText(employe.getPrenom());
		tabs.getGestionEmpl().getEmail().setText(employe.getEmail());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		tabs.getGestionEmpl().getDate().setText(sdf.format(employe.getDatnais()));
		tabs.getGestionEmpl().getGender().setSelectedItem(employe.getGenre());
		
		
	}
	
	public static void main(String[] args) {
		JFrame myFrame = new MainFrame();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuBar.getRedItem()) {
			Color color = Color.red;
			tabs.getWelcome().setBackground(color);
			tabs.getGestionProfil().getLeftPanel().setBackground(color);
			tabs.getGestionProfil().getTopPanel().setBackground(color);
			tabs.getGestionEmpl().getTopPane().setBackground(color);
			tabs.getGestionEmpl().getBottomPane().setBackground(color);
			
		}
		else if(e.getSource() == menuBar.getBlueItem()) {
			Color color = Color.blue;
			tabs.getWelcome().setBackground(color);
			tabs.getGestionProfil().getLeftPanel().setBackground(color);
			tabs.getGestionProfil().getTopPanel().setBackground(color);
			tabs.getGestionEmpl().getTopPane().setBackground(color);
			tabs.getGestionEmpl().getBottomPane().setBackground(color);
		}
		else if(e.getSource() == menuBar.getGestionEmployerItem()) {
			tabs.setEnabledAt(1, false);
			tabs.setEnabledAt(2,true);
			tabs.setEnabledAt(3,false);
			tabs.setSelectedIndex(2);
		}
		else if (e.getSource() == menuBar.getGestionProfileItem()) {
			tabs.setEnabledAt(1, true);
			tabs.setEnabledAt(2,false);
			tabs.setEnabledAt(3,false);
			tabs.setSelectedIndex(1);
		}
		else if (e.getSource() == menuBar.getGestion_Emp_ProfileItem()) {
			tabs.setSelectedIndex(3);
			tabs.setEnabledAt(1, false);
			tabs.setEnabledAt(2,false);
			tabs.setEnabledAt(3,true);
		}
		else if(e.getSource() == menuBar.getQuitItem()) {
			int secondResult = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure you want to exit?",
                    "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION
            );
			if (secondResult == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		else if (e.getSource() == menuBar.getCinItem()) {
			String retour=JOptionPane.showInputDialog(null, "Saisissez cin SVP:");
			System.out.print(retour);
		}
		else if( e.getSource() == menuBar.getNomItem()){
			String retour;
			do {
				retour=JOptionPane.showInputDialog(null, "Saisissez Nom employe SVP:");
				if(retour == null) {
					break;
				}
			}while(retour.equals(""));
			
		}
		else if(e.getSource()== tabs.getGestionEmpl().getAnnuler()) {
			//cinfieldc,nomc,prenomc,emailc
			SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
			tabs.getGestionEmpl().getCinfieldc().setText("");
			tabs.getGestionEmpl().getNomc().setText("");
			tabs.getGestionEmpl().getPrenomc().setText("");
			tabs.getGestionEmpl().getEmailc().setText("");
			tabs.getGestionEmpl().getDatec().setText(f.format(new Date()));
			
		}
		else if (e.getSource() == tabs.getGestionProfil().getAjouter()) {
			profilDao.insertProfil(new Profil(tabs.getGestionProfil().getLibelleField().getText()));
			tabs.getGestionProfil().getLibelleField().setText("");
			
		}
		else if (e.getSource()== tabs.getGestionProfil().getAnnuler()) {
			tabs.getGestionProfil().getLibelleField().setText("");
		}
		else if(e.getSource() == tabs.getGestionEmpl().getAjouter()) {
			String cin = tabs.getGestionEmpl().getCinfieldc().getText();
			String nom = tabs.getGestionEmpl().getNomc().getText();
			String prenom = tabs.getGestionEmpl().getPrenomc().getText();
			String email = tabs.getGestionEmpl().getEmailc().getText();
			String datnaisString = tabs.getGestionEmpl().getDatec().getText();
			String genre = (String) tabs.getGestionEmpl().getGenderc().getSelectedItem();
			int idprofil = profilDao.getLibelleId((String) tabs.getGestionEmpl().getProfilec().getSelectedItem());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date sqlDate = null;
			try {
				Date datnaisDate = sdf.parse(datnaisString);
				sqlDate = new java.sql.Date(datnaisDate.getTime());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				System.out.println("Helloworld");
				
				e1.printStackTrace();
			}
			Employe employe = new Employe( cin,  idprofil,  nom,  prenom,  sqlDate,  genre,  email);
			employeDao.insertEmploye(employe);
			SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
			tabs.getGestionEmpl().getCinfieldc().setText("");
			tabs.getGestionEmpl().getNomc().setText("");
			tabs.getGestionEmpl().getPrenomc().setText("");
			tabs.getGestionEmpl().getEmailc().setText("");
			tabs.getGestionEmpl().getDatec().setText(f.format(new Date()));
			
			
		}
		else if (e.getSource() == tabs.getGestionEmpl().getNext()) {
			if(currentEmployeIndex >= employes.size()-1) {
				currentEmployeIndex = 0;
			}
			else {
				currentEmployeIndex++;
			}
			
			Employe employe = employes.get(currentEmployeIndex);
			tabs.getGestionEmpl().getCinfield().setText(employe.getCin());
			tabs.getGestionEmpl().getNom().setText(employe.getNom());
			tabs.getGestionEmpl().getPrenom().setText(employe.getPrenom());
			tabs.getGestionEmpl().getEmail().setText(employe.getEmail());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			tabs.getGestionEmpl().getDate().setText(sdf.format(employe.getDatnais()));
			tabs.getGestionEmpl().getGender().setSelectedItem(employe.getGenre());
		}
		else if (e.getSource() == tabs.getGestionEmpl().getPrevious()) {
			if(currentEmployeIndex == 0) {
				currentEmployeIndex = employes.size()-1;
			}
			else {
				currentEmployeIndex--;
			}
			Employe employe = employes.get(currentEmployeIndex);
			tabs.getGestionEmpl().getCinfield().setText(employe.getCin());
			tabs.getGestionEmpl().getNom().setText(employe.getNom());
			tabs.getGestionEmpl().getPrenom().setText(employe.getPrenom());
			tabs.getGestionEmpl().getEmail().setText(employe.getEmail());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			tabs.getGestionEmpl().getDate().setText(sdf.format(employe.getDatnais()));
			tabs.getGestionEmpl().getGender().setSelectedItem(employe.getGenre());
		}
		else if (e.getSource() == tabs.getGestionEmpl().getModif()) {
			String cin = tabs.getGestionEmpl().getCinfield().getText();
			String nom = tabs.getGestionEmpl().getNom().getText();
			String prenom = tabs.getGestionEmpl().getPrenom().getText();
			String email = tabs.getGestionEmpl().getEmail().getText();
			String datnaisString = tabs.getGestionEmpl().getDate().getText();
			String genre = (String) tabs.getGestionEmpl().getGender().getSelectedItem();
			int idprofil = profilDao.getLibelleId((String) tabs.getGestionEmpl().getProfile().getSelectedItem());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date sqlDate = null;
			try {
				Date datnaisDate = sdf.parse(datnaisString);
				sqlDate = new java.sql.Date(datnaisDate.getTime());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				
				
				e1.printStackTrace();
			}
			Employe employe = new Employe( cin,  idprofil,  nom,  prenom,  sqlDate,  genre,  email);
			employeDao.updateEmploye(employe);
		}
		else if(e.getSource() == tabs.getGestionEmpl().getSuprimer()) {
			String cin = tabs.getGestionEmpl().getCinfield().getText();
			String nom = tabs.getGestionEmpl().getNom().getText();
			String prenom = tabs.getGestionEmpl().getPrenom().getText();
			String email = tabs.getGestionEmpl().getEmail().getText();
			String datnaisString = tabs.getGestionEmpl().getDate().getText();
			String genre = (String) tabs.getGestionEmpl().getGender().getSelectedItem();
			int idprofil = profilDao.getLibelleId((String) tabs.getGestionEmpl().getProfile().getSelectedItem());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date sqlDate = null;
			try {
				Date datnaisDate = sdf.parse(datnaisString);
				sqlDate = new java.sql.Date(datnaisDate.getTime());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				
				
				e1.printStackTrace();
			}
			Employe employe = new Employe( cin,  idprofil,  nom,  prenom,  sqlDate,  genre,  email);
			employeDao.deleteEmploye(employe);
		}
		
	}
}