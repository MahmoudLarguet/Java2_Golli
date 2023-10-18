package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Employe;
import model.Profil;

import java.awt.*;
import java.util.ArrayList;

public class GestionProfil extends JSplitPane{
	private JPanel leftPanel,rightPanel,topPanel;
	private JButton ajouter,annuler;
	private JTextField libelleField;
	private DefaultTableModel model;
	private JTable tab;
	private String[] title = {"id","Libelle"};
	
	private JScrollPane scrollPane;
	private JLabel libelleLabel;
	
	public GestionProfil() {
		super(JSplitPane.HORIZONTAL_SPLIT);
		initLeftPanel();
		initRightPanel();
		
		setDividerLocation(600);
		setLeftComponent(leftPanel);
		setRightComponent(rightPanel);
		
	}
	
	public void initLeftPanel() {
		leftPanel = new JPanel(new BorderLayout());
		topPanel = new JPanel(new GridBagLayout());
		topPanel.setBackground(Color.blue);
		GridBagConstraints  g = new GridBagConstraints();
		g.insets = new Insets(3,3,3,3);
		leftPanel.setBackground(Color.blue);
		ajouter = new JButton("Ajouter");
		annuler = new JButton("Annuler");
		libelleField = new JTextField();
		libelleField.setPreferredSize(new Dimension(300,20));
		libelleLabel = new JLabel("Libelle");
		libelleLabel.setFont(new Font("Arial",Font.BOLD,15));
		libelleLabel.setForeground(Color.white);
		g.gridx = 0;
		g.gridy = 0;
		topPanel.add(libelleLabel,g);
		g.gridx = 1;
		g.gridy = 0;
		topPanel.add(libelleField,g);
		g.gridx = 2;
		g.gridy = 0;
		topPanel.add(ajouter,g);
		g.gridx = 3;
		g.gridy = 0;
		topPanel.add(annuler,g);
		leftPanel.add(topPanel,"North");
		
	}
	

	public void initRightPanel() {
		rightPanel = new JPanel(new BorderLayout());
		model = new DefaultTableModel();
		tab =new JTable(model);
		
		for(String column: title) {
			model.addColumn(column);
			
		}
		
		scrollPane = new JScrollPane(tab);
		
		rightPanel.add(scrollPane);
	}
	public void getData(ArrayList<Profil> profils) {
		for(Profil profil  : profils) {
			String[] row = {Integer.toString(profil.getIdprofil()),profil.getLibelle()};
			model.addRow(row);
			
		}
	}
	public void deleteAllRow() {
		while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
	}
	public JPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(JPanel topPanel) {
		this.topPanel = topPanel;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public JPanel getRightPanel() {
		return rightPanel;
	}

	public void setRightPanel(JPanel rightPanel) {
		this.rightPanel = rightPanel;
	}

	public JButton getAjouter() {
		return ajouter;
	}

	public void setAjouter(JButton ajouter) {
		this.ajouter = ajouter;
	}

	public JButton getAnnuler() {
		return annuler;
	}

	public void setAnnuler(JButton annuler) {
		this.annuler = annuler;
	}

	public JTextField getLibelleField() {
		return libelleField;
	}

	public void setLibelleField(JTextField libelleField) {
		this.libelleField = libelleField;
	}

	public JLabel getLibelleLabel() {
		return libelleLabel;
	}

	public void setLibelleLabel(JLabel libelleLabel) {
		this.libelleLabel = libelleLabel;
	}
	

	
}
