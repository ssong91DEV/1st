package com.moving.ui.sub;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class C_likeDirectory extends JPanel {
	JPanel panel;
	C_likeOne list01,list02,list03;
	
	
	
	public C_likeDirectory() {
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,4,5,5));
		
		list01=new C_likeOne("내 리스트 01");
		list02=new C_likeOne("내 리스트 02");
		list03=new C_likeOne("내 리스트 03");
		
		panel.add(list01);
		panel.add(list02);
		panel.add(list03);
		
		add(panel);
	}
}
