package view;
import javax.swing.*;
import java.awt.*;
public class TabMenu extends JTabbedPane {
	private Welcome welcome;
	private List list;
	private GestionEmp gestionEmpl;
	
	private GestionProfil gestionProfil;
	public TabMenu() {
		super(JTabbedPane.TOP);
		welcome = new Welcome();
		gestionProfil = new GestionProfil();
		list = new List();

		gestionEmpl = new GestionEmp();
		add("Welcome",welcome);
		add("Gestion Profils",gestionProfil);
		add("Gestion Employes",gestionEmpl);
		add("List Emp/profil",list);
		
	}
	public Welcome getWelcome() {
		return welcome;
	}
	public void setWelcome(Welcome welcome) {
		this.welcome = welcome;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public GestionEmp getGestionEmpl() {
		return gestionEmpl;
	}
	public void setGestionEmpl(GestionEmp gestionEmpl) {
		this.gestionEmpl = gestionEmpl;
	}
	public GestionProfil getGestionProfil() {
		return gestionProfil;
	}
	public void setGestionProfil(GestionProfil gestionProfil) {
		this.gestionProfil = gestionProfil;
	}
	
}
