package com.moving.ui.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NorthDefault extends JPanel {
	public static JPanel northdefault;
	public JButton movies,review,title,colorUp;
	//JLabel moviesLabel;
	public ImageIcon moviesIcon,reviewIcon,titleIcon,colorUpIcon;
	
	public NorthDefault() {
		northdefault=new JPanel();
		northdefault.setPreferredSize(new Dimension(1300,120));
		northdefault.setBackground(Color.WHITE);
		northdefault.setLayout(new FlowLayout());
		
		//Toolkit kit=Toolkit.getDefaultToolkit();
		
		moviesIcon=new ImageIcon("./resources/image/icon/movies.png");
		movies=new JButton("MOVIES",moviesIcon);
		movies.setBorderPainted(false);//버튼 외곽선 지움
		movies.setContentAreaFilled(false);//버튼  투명하게
		//movies.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		northdefault.add(movies);
		//moviesLabel=new JLabel(moviesIcon);
		//panel.add(moviesLabel);
		
		reviewIcon=new ImageIcon("./resources/image/icon/review.png");
		review=new JButton("REVIEW",reviewIcon);
		review.setBorderPainted(false);//버튼 외곽선 지움
		review.setContentAreaFilled(false);//버튼  투명하게
		//review.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		northdefault.add(review);
		
		titleIcon=new ImageIcon("./resources/image/icon/moviing.png");
		title=new JButton(titleIcon);
		title.setBorderPainted(false);//버튼 외곽선 지움
		title.setContentAreaFilled(false);//버튼  투명하게
		//title.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		northdefault.add(title);
		
		colorUpIcon=new ImageIcon("./resources/image/icon/colorUp_B.png");
		colorUp=new JButton("Color Up!",colorUpIcon);
		colorUp.setBorderPainted(false);//버튼 외곽선 지움
		colorUp.setContentAreaFilled(false);//버튼  투명하게
		//colorUp.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		northdefault.add(colorUp);
		
		add(northdefault);
	}
}
