package br.edu.univas.si4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Prova extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel = null;
	
	public Prova() {
		
		this.setTitle("Prova");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContentPane();
		addComponets();
		this.setVisible(true);
	}

	
	private void setContentPane() {
		panel = new JPanel();
		BorderLayout borderLayout = new BorderLayout();
		panel.setLayout(borderLayout);
		this.setContentPane(panel);
		
		
		
	}
	
	private void addComponets() {
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(235, 120));
		westPanel.setBackground(new Color(224, 224, 224));
		populatewestPanel(westPanel);
		panel.add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		populateCenterPanel(centerPanel);
		panel.add(centerPanel, BorderLayout.CENTER);
		
	}
	
	private void populatewestPanel(JPanel westPanel){
		
		JLabel nameLabel = new JLabel();
		nameLabel.setPreferredSize(new Dimension(300, 30));
		nameLabel.setText("Nome: ");
		westPanel.add(nameLabel);
	}
	
	private void populateCenterPanel(JPanel centerPanel) {
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(10,10,10,10);
		centerPanel.add(nameLabel, gbc);
	
		JTextField nomeTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15,0,10,15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(nomeTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-Mail: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.insets = new Insets(15,15,10,15);
		gbc.anchor = GridBagConstraints.LINE_END;
		centerPanel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15,0,10,15);
		gbc.anchor = GridBagConstraints.LINE_START;
		centerPanel.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15,15,15,15);
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(saveButton, gbc);
		
		Object[][] rowDate = {
				{"","",""},
				{"","",""},
				{"","",""},
		};
		Object[] columnNames = {
				"Nome",
				"CPF",
				"E-mail"
		};
		
		JTable dateTable = new JTable(rowDate,columnNames);
		dateTable.setFillsViewportHeight(true);
		JScrollPane tableScrollPane = new JScrollPane(dateTable);
		tableScrollPane.setMinimumSize(new Dimension(70, 70));
		tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(tableScrollPane, gbc);
		
	}
}