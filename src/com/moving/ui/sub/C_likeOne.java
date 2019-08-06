package com.moving.ui.sub;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_likeOne extends JPanel {
	public JPanel panel,movieP,titleP;
	public JButton listTitle;
	public ImageIcon movie01,movie02,movie03,movie04;
	public JLabel movieL01,movieL02,movieL03,movieL04;
	
	public C_likeOne(String title) {
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setPreferredSize(new Dimension(150,200));
		
		movieP=new JPanel();
		movieP.setPreferredSize(new Dimension(150,150));
		movieP.setLayout(new GridLayout(2,2,0,0));
		
		movie01=new ImageIcon("./resources/image/likelist/spiderman.jpg");
		movieL01=new JLabel(movie01);
		movie02=new ImageIcon("./resources/image/likelist/toystory4.jpg");
		movieL02=new JLabel(movie02);
		movie03=new ImageIcon("./resources/image/likelist/silence.jpg");
		movieL03=new JLabel(movie03);
		movie04=new ImageIcon("./resources/image/likelist/aladin.jpg");
		movieL04=new JLabel(movie04);
		
		movieP.add(movieL01); movieP.add(movieL02);
		movieP.add(movieL03); movieP.add(movieL04);
		
		titleP=new JPanel(new FlowLayout());
		listTitle=new JButton(title);
		//listTitle.setBorderPainted(false);
		//listTitle.setContentAreaFilled(false);
		titleP.add(listTitle);
		
		panel.add(movieP,BorderLayout.CENTER);
		panel.add(titleP,BorderLayout.SOUTH);
		
		add(panel);
	}
}
