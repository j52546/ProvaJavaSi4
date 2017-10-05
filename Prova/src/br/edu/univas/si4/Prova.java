package br.edu.univas.si4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Prova extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JPanel panel = null;
	
	public Prova() {
		
		this.setTitle("Prova");
		this.setSize(500,450);
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
		westPanel.setPreferredSize(new Dimension(150, 120));
		westPanel.setBackground(new Color(131, 139, 131));
		populatewestPanel(westPanel);
		panel.add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		populateCenterPanel(centerPanel);
		panel.add(centerPanel, BorderLayout.CENTER);
		
	}
	
	private void populatewestPanel(JPanel westPanel){
		
		JButton button01 = new JButton();
		button01.setText("Botão 01");
		button01.setPreferredSize(new Dimension(100, 30));
		button01.addActionListener(this);
		westPanel.add(button01);
		
		JButton button02 = new JButton();
		button02.setText("Botão 02");
		button02.setPreferredSize(new Dimension(100, 30));
		button02.addActionListener(this);
		westPanel.add(button02);
		
		JButton button03 = new JButton();
		button03.setText("Botão 03");
		button03.addActionListener(this);
		button03.setPreferredSize(new Dimension(100, 30));
		westPanel.add(button03);

		JButton button04 = new JButton();
		button04.setText("Botão 04");
		button04.setPreferredSize(new Dimension(100, 30));
		button04.addActionListener(this);
		westPanel.add(button04);

		JButton button05 = new JButton();
		button05.setText("Botão 05");
		button05.setPreferredSize(new Dimension(100, 30));
		button05.addActionListener(this);
		westPanel.add(button05);
		
		JButton button06 = new JButton();
		button06.setText("Botão 06");
		button06.setPreferredSize(new Dimension(100, 30));
		button06.addActionListener(this);
		westPanel.add(button06);
		
		JButton button07 = new JButton();
		button07.setText("Botão 07");
		button07.setPreferredSize(new Dimension(100, 30));
		button07.addActionListener(this);
		westPanel.add(button07);
		
		JButton button08 = new JButton();
		button08.setText("Botão 08");
		button08.setPreferredSize(new Dimension(100, 30));
		button08.addActionListener(this);
		westPanel.add(button08);
		
		JButton button09 = new JButton();
		button09.setText("Botão 09");
		button09.setPreferredSize(new Dimension(100, 30));
		button09.addActionListener(this);
		westPanel.add(button09);
		
		JButton button10 = new JButton();
		button10.setText("Botão 10");
		button10.setPreferredSize(new Dimension(100, 30));
		button10.addActionListener(this);
		westPanel.add(button10);
		
	}
	
	private void populateCenterPanel(JPanel centerPanel) {
		
		centerPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		centerPanel.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15); 
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(nameTextField, gbc);

		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		centerPanel.add(emailLabel, gbc);

		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15); 
		gbc.anchor = GridBagConstraints.LINE_START;
		centerPanel.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 15, 15, 15); 
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(saveButton, gbc);
		
		Object[][] rowDate = {
				{"João","111.111.111-11","joao@gmail.com"},
				{"Maria","222.222.222-22","maria@gmail.com"},
				{"Jose","333.333.333-33","jose@gmil.com"},
		};
		Object[] columnNames = {
				"Nome",
				"CPF",
				"E-mail"
		};
		
		JTable dateTable = new JTable(rowDate,columnNames);
		dateTable.setFillsViewportHeight(true);
		JScrollPane tableScrollPane = new JScrollPane(dateTable);
		tableScrollPane.setMinimumSize(new Dimension(100,100));
		tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(tableScrollPane, gbc);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Eu sou o responsavel pelo meu futuro !");
	}
}