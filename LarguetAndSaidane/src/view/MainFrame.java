package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuBar;

public class MainFrame extends JFrame implements ActionListener {
	private MenuBar menuBar ;
	private TabMenu tabs;
	public MainFrame() {
		super("Gestion Des Employes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		ImageIcon pic = new ImageIcon("image/welcome.jpg");
		setIconImage(pic.getImage());
		initComponents();
		
		
		
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
		}
		else if (e.getSource() == menuBar.getGestionProfileItem()) {
			tabs.setEnabledAt(1, true);
			tabs.setEnabledAt(2,false);
			tabs.setEnabledAt(3,false);
		}
		else if (e.getSource() == menuBar.getGestion_Emp_ProfileItem()) {
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
			String retour=JOptionPane.showInputDialog(null, "Saisissez Nom employe SVP:");
		}
		
	}
}