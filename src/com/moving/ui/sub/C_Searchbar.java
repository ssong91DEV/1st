package com.moving.ui.sub;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C_Searchbar extends JPanel {
	public JPanel panel;
	public JTextField searchField;
	public JButton search;
	public ImageIcon searchIcon;
	
	public C_Searchbar() {
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setPreferredSize(new Dimension(770,30));
		
		String[] category= {"영화 제목","감독","배우"};
		JComboBox categoryBox=new JComboBox(category);
		categoryBox.setSelectedIndex(0);
		//categoryBox.addActionListener(this);
		
		searchField=new JTextField();
		searchField.setFont(new Font("맑은 고딕",Font.BOLD,15));
		//search
		searchField.setBackground(null);
		searchField.setForeground(Color.DARK_GRAY);
		
		searchIcon=new ImageIcon("./resources/image/icon/search.png");
		search=new JButton(searchIcon);
		//한 줄ver: search=new JButton(new ImageIcon("searchIcon.png"));
		search.setBorderPainted(false);
		search.setContentAreaFilled(false);
		//search.setFocusPainted(false);
		
		panel.add(categoryBox,BorderLayout.WEST);
		panel.add(searchField,BorderLayout.CENTER);
		panel.add(search,BorderLayout.EAST);
		
		add(panel);
	}
}