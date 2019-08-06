package com.moving.ui.sub;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class C_Menubar extends JPanel {
	public JPanel panel;
	public static JButton home,review,talk,movies,btn1,btn2;
	
	public C_Menubar() {
		panel=new JPanel();
		panel.setPreferredSize(new Dimension(800,40));
		panel.setLayout(new GridLayout(1,6));
		panel.setBackground(Color.BLACK);
		
		home=new JButton("HOME");
		home.setFont(new Font("맑은 고딕",Font.BOLD,22));
		home.setForeground(Color.WHITE);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		//home.setFocusPainted(false);		
		
		
		review=new JButton("REVIEW");
		review.setFont(new Font("맑은 고딕",Font.BOLD,22));
		review.setForeground(Color.WHITE);
		review.setBorderPainted(false);
		review.setContentAreaFilled(false);
		//review.setFocusPainted(false);
		
		talk=new JButton("TALK");
		talk.setFont(new Font("맑은 고딕",Font.BOLD,22));
		talk.setForeground(Color.WHITE);
		talk.setBorderPainted(false);
		talk.setContentAreaFilled(false);
		//search.setFocusPainted(false);
		
		movies=new JButton("MOVIES");
		movies.setFont(new Font("맑은 고딕",Font.BOLD,22));
		movies.setForeground(Color.WHITE);
		movies.setBorderPainted(false);
		movies.setContentAreaFilled(false);
		//movies.setFocusPainted(false);
		
		btn1=new JButton("btn1");
		btn1.setFont(new Font("맑은 고딕",Font.BOLD,22));
		btn1.setForeground(Color.WHITE);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		//btn1.setFocusPainted(false);
		
		btn2=new JButton("btn2");
		btn2.setFont(new Font("맑은 고딕",Font.BOLD,22));
		btn2.setForeground(Color.WHITE);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);
		//btn2.setFocusPainted(false);
		
		panel.add(home);
		panel.add(movies);
		panel.add(review);
		panel.add(talk);
		panel.add(btn1);
		panel.add(btn2);
		
		add(panel);
	}
}
