package com.moving.ui.sub;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_MovieOne extends JPanel {
	public JPanel panel;
	public JLabel movieTitle,movieDate;
	public JButton moviePoster;
	public ImageIcon PosterPic;
	
	public C_MovieOne(String fileName, String title, int date) {
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setPreferredSize(new Dimension(150,270));
		
		//영화 포스터 크기 (150,215)
		PosterPic=new ImageIcon(fileName);
		moviePoster=new JButton(PosterPic);
		moviePoster.setBackground(null);
		moviePoster.setBorderPainted(false);
		moviePoster.setContentAreaFilled(false);
		//moviePoster.setFocusPainted(false);
		//moviePoster.setOpaque(true);//투명하게 - 안해도 됨.
		
		movieTitle=new JLabel(title);
		movieTitle.setFont(new Font("맑은 고딕",Font.BOLD,18));
		
		movieDate=new JLabel(date+" 개봉");
		movieDate.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		
		panel.add(moviePoster,BorderLayout.NORTH);
		panel.add(movieTitle,BorderLayout.CENTER);
		panel.add(movieDate,BorderLayout.SOUTH);
		
		add(panel);
	}
}
