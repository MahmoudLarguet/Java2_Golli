package view;
import javax.swing.*;
import java.awt.*;
public class MenuBar extends JMenuBar {
	
	
	public MenuBar() {
		JMenu gestionMenu = new JMenu("Add");
		JMenuItem gestionProfileItem = new JMenuItem("Add Employee");
		JMenuItem gestionEmployerItem = new JMenuItem("Add Holiday");
		JMenuItem gestion_Emp_ProfileItem = new JMenuItem("Add Profile");
		JMenuItem QuitItem = new JMenuItem("Quit");
		gestionMenu.add(gestionProfileItem);
		gestionMenu.add(new JSeparator()); 
		gestionMenu.add(gestionEmployerItem);
		gestionMenu.add(new JSeparator()); 
		gestionMenu.add(gestion_Emp_ProfileItem);
		gestionMenu.add(new JSeparator()); 
		gestionMenu.add(QuitItem);
		
		
		
		JMenu rechercherMenu = new JMenu("Quick Search"); 
		JMenuItem cinItem = new JMenuItem("Employee By Name");
		JMenuItem nomItem = new JMenuItem("Employee By Id");
		rechercherMenu.add(cinItem);
		rechercherMenu.add(new JSeparator()); 
		rechercherMenu.add(nomItem);
		
		
		
		JMenu colorMenu = new JMenu("Theme");
		JMenuItem blueItem = new JMenuItem("Dark");
		JMenuItem redItem = new JMenuItem("Light");
		colorMenu.add(blueItem);
		colorMenu.add(new JSeparator()); 
		colorMenu.add(redItem);
		
		
		
		add(gestionMenu);
		add(rechercherMenu);
		add(colorMenu);
		
	}
}
