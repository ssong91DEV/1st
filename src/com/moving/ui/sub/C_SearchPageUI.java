package com.moving.ui.sub;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C_SearchPageUI extends JFrame {
	public JPanel default_p;
	public C_Searchbar searchBar=new C_Searchbar();
	public C_SearchResult searchResult=new C_SearchResult();
	
	public C_SearchPageUI() {
		setLayout(new BorderLayout());
		
		default_p=new JPanel(new BorderLayout());
		default_p.add(searchBar,BorderLayout.NORTH);
		default_p.add(searchResult,BorderLayout.CENTER);
		
		add(default_p,BorderLayout.CENTER);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new C_SearchPageUI();
	}
}