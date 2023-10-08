package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuBar extends JMenuBar {
	private JMenuItem gestionProfileItem, gestionEmployerItem,gestion_Emp_ProfileItem,quitItem;
	private JMenuItem cinItem,nomItem;
	private JMenuItem blueItem,redItem;
	public MenuBar() {
		JMenu gestionMenu = new JMenu("Gestion");
		gestionProfileItem = new JMenuItem("gestion profils");
		gestionEmployerItem = new JMenuItem("gestion employes");
		 gestion_Emp_ProfileItem = new JMenuItem("employes/profil");
		quitItem = new JMenuItem("Quitter");
		gestionMenu.add(gestionProfileItem);
		gestionMenu.add(new JSeparator()); 
		gestionMenu.add(gestionEmployerItem);
		gestionMenu.add(new JSeparator()); 
		gestionMenu.add(gestion_Emp_ProfileItem);
		gestionMenu.add(new JSeparator()); 
		gestionMenu.add(quitItem);
		
		
		
		JMenu rechercherMenu = new JMenu("Rechercher"); 
		cinItem = new JMenuItem("Cin Employe");
		nomItem = new JMenuItem("Nom Employe");
		rechercherMenu.add(cinItem);
		rechercherMenu.add(new JSeparator()); 
		rechercherMenu.add(nomItem);
		
		
		
		JMenu colorMenu = new JMenu("Couleur");
		blueItem = new JMenuItem("Bleu");
		redItem = new JMenuItem("Rouge");
		colorMenu.add(blueItem);
		colorMenu.add(new JSeparator()); 
		colorMenu.add(redItem);
		
		
		
		add(gestionMenu);
		add(rechercherMenu);
		add(colorMenu);
		
	}
	public JMenuItem getGestionProfileItem() {
		return gestionProfileItem;
	}
	public void setGestionProfileItem(JMenuItem gestionProfileItem) {
		this.gestionProfileItem = gestionProfileItem;
	}
	public JMenuItem getGestionEmployerItem() {
		return gestionEmployerItem;
	}
	public void setGestionEmployerItem(JMenuItem gestionEmployerItem) {
		this.gestionEmployerItem = gestionEmployerItem;
	}
	public JMenuItem getGestion_Emp_ProfileItem() {
		return gestion_Emp_ProfileItem;
	}
	public void setGestion_Emp_ProfileItem(JMenuItem gestion_Emp_ProfileItem) {
		this.gestion_Emp_ProfileItem = gestion_Emp_ProfileItem;
	}
	public JMenuItem getQuitItem() {
		return quitItem;
	}
	public void setQuitItem(JMenuItem quitItem) {
		this.quitItem = quitItem;
	}
	public JMenuItem getCinItem() {
		return cinItem;
	}
	public void setCinItem(JMenuItem cinItem) {
		this.cinItem = cinItem;
	}
	public JMenuItem getNomItem() {
		return nomItem;
	}
	public void setNomItem(JMenuItem nomItem) {
		this.nomItem = nomItem;
	}
	public JMenuItem getBlueItem() {
		return blueItem;
	}
	public void setBlueItem(JMenuItem blueItem) {
		this.blueItem = blueItem;
	}
	public JMenuItem getRedItem() {
		return redItem;
	}
	public void setRedItem(JMenuItem redItem) {
		this.redItem = redItem;
	}
	
}
