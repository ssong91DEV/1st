package com.moving.ui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.moviing.www.GUI.MainFirstPageAll;

public class MainFrame extends JFrame {
	JPanel panel,northP,southP,centerP,westP,eastP;
	BufferedImage title_img=null;
	Image icon;
	
	//NorthDefault northdefault=new NorthDefault();
	//CenterDefault centerdefault=new CenterDefault();
	//EastDefault eastdefault=new EastDefault();
	
	public MainFrame() {
		setTitle("MOVING");
		//setSize(500,300);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension sc=kit.getScreenSize();//화면크기(1920,1080)
		Dimension mySize=getSize();//띄우는 창크기
		setLocation(sc.width/2-mySize.width/2,sc.height/2-mySize.height/2);
				 
		icon=kit.getImage("./image/icon/testI.png");
		setIconImage(icon);//프레임 아이콘 이미지 설정
		
		/** 내용 시작 **/
		
		panel=new JPanel();
		panel.setPreferredSize(new Dimension(1300,750));
		panel.setLayout(new BorderLayout());
		
		northP=new JPanel();
		//northP.setPreferredSize(new Dimension(1300,120));
		//northP.setBackground(Color.DARK_GRAY);
		northP.add(NorthDefault.northdefault);
		panel.add(northP,BorderLayout.NORTH);
		
		southP=new JPanel();
		southP.setPreferredSize(new Dimension(1300,30));
		southP.setBackground(Color.DARK_GRAY);
		panel.add(southP,BorderLayout.SOUTH);
		
		/*
		centerP=new JPanel();
		centerP.setLayout(new BorderLayout());
		//centerP.setPreferredSize(new Dimension(800,600));
		//centerP.setBackground(Color.LIGHT_GRAY);
		centerP.add(centerdefault,BorderLayout.CENTER);
		panel.add(centerP,BorderLayout.CENTER);
		*/
		centerP=new JPanel();
		centerP.setLayout(new FlowLayout(FlowLayout.CENTER));
		centerP.setPreferredSize(new Dimension(800,600));
		centerP.add(new MainFirstPageAll());
		panel.add(centerP,BorderLayout.CENTER);
		
		westP=new JPanel();
		westP.setPreferredSize(new Dimension(220,600));
		//westP.setBackground(Color.YELLOW);
		panel.add(westP,BorderLayout.WEST);
		
		eastP=new JPanel();
		eastP.setPreferredSize(new Dimension(280,600));
		//eastP.setBackground(Color.YELLOW);
		eastP.add(eastdefault);
		panel.add(eastP,BorderLayout.EAST);
		
		add(panel);
		JScrollPane scroll=new JScrollPane(centerP,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//20
		//scroll.setPreferredSize(new Dimension(800,600));
		scroll.getVerticalScrollBar().setUnitIncrement(16);
		panel.add(scroll);
		
		/** 내용 끝 **/
		
		pack(); setVisible(true);
	}
	public static void main(String[] args) {
		new MainFrame();
	}

}
