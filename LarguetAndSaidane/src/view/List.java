package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import model.Employe;

public class List extends JSplitPane{
	private JLabel profilLabel;
	private JComboBox profileSelector;
	private String[] title = {"cin","nom","prenom","email"};
	private JTable tab;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JPanel topPane,bottomPane;
	public List() {
		super(JSplitPane.VERTICAL_SPLIT);
		initTopPane();
		initBottomPane();
		setTopComponent(topPane);
		setBottomComponent(bottomPane);
		
	}
	public void initBottomPane() {
		bottomPane = new JPanel(new BorderLayout());
		model = new DefaultTableModel();
		tab =new JTable(model);
	
		for(String column: title) {
			model.addColumn(column);
			
		}
		
		scrollPane = new JScrollPane(tab);
		
		bottomPane.add(scrollPane);
		
		
	}
	public void initTopPane() {
		topPane = new JPanel(new GridBagLayout());
		profilLabel = new JLabel("Profil:");
		profileSelector = new JComboBox<>();
		topPane.setBackground(Color.blue);
		
		profilLabel.setFont(new Font("Arial",Font.PLAIN,20));
		profilLabel.setForeground(Color.white);
		GridBagConstraints g = new GridBagConstraints();
		g.insets = new Insets(3,3,3,3);
		g.gridx = 0;
		g.gridy = 0;
		topPane.add(profilLabel,g);
		g.gridx = 1;
		g.gridy = 0;
		topPane.add(profileSelector,g);
		
		
		
		
		
	}
	public void setProfileSelection(ArrayList<String> profiles) {
		profileSelector.removeAllItems();
		
		for(String profile:profiles) {
			profileSelector.addItem(profile);
			
		}
		
		
	}
	public void getData(ArrayList<Employe> employes) {
		for(Employe employe  : employes) {
			String[] row = {employe.getCin(),employe.getNom(),employe.getPrenom(),employe.getEmail()};
			model.addRow(row);
			
		}
	}
	public void deleteAllRow() {
		while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
	}
	public JLabel getProfilLabel() {
		return profilLabel;
	}
	public void setProfilLabel(JLabel profilLabel) {
		this.profilLabel = profilLabel;
	}
	public JComboBox getProfileSelector() {
		return profileSelector;
	}
	public void setProfileSelector(JComboBox profileSelector) {
		this.profileSelector = profileSelector;
	}
	public String[] getTitle() {
		return title;
	}
	public void setTitle(String[] title) {
		this.title = title;
	}
	public JTable getTab() {
		return tab;
	}
	public void setTab(JTable tab) {
		this.tab = tab;
	}
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	public DefaultTableModel getModel() {
		return model;
	}
	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
	public JPanel getTopPane() {
		return topPane;
	}
	public void setTopPane(JPanel topPane) {
		this.topPane = topPane;
	}
	public JPanel getBottomPane() {
		return bottomPane;
	}
	public void setBottomPane(JPanel bottomPane) {
		this.bottomPane = bottomPane;
	}
	

}
