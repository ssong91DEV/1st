package com.moving.ui.sub;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class C_Hashtagbar extends JPanel {
	public JPanel panel,hashtagBar;
	public JButton tag1,tag2,tag3,tag4;
	
	public C_Hashtagbar() {
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,1));
		
		hashtagBar=new JPanel();
		hashtagBar.setLayout(new FlowLayout());
		hashtagBar.setPreferredSize(new Dimension(770,30));
		
		tag1=new JButton("#혼영");
		tag1.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		tag1.setBorderPainted(false);//버튼 외곽선 지움
		tag1.setContentAreaFilled(false);//버튼  투명하게
		//tag1.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		tag2=new JButton("#타임킬링");
		
		tag2.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		tag2.setBorderPainted(false);//버튼 외곽선 지움
		tag2.setContentAreaFilled(false);//버튼  투명하게
		//tag2.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		
		tag3=new JButton("#심심할 때");
		tag3.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		tag3.setBorderPainted(false);//버튼 외곽선 지움
		tag3.setContentAreaFilled(false);//버튼  투명하게
		//tag3.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		
		tag4=new JButton("#우울할 때");
		tag4.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		tag4.setBorderPainted(false);//버튼 외곽선 지움
		tag4.setContentAreaFilled(false);//버튼  투명하게
		//tag4.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		tag1.setSize(50,15); tag2.setSize(50,15);
		tag3.setSize(50,15); tag4.setSize(50,15);
		
		hashtagBar.add(tag1);
		hashtagBar.add(tag2);
		hashtagBar.add(tag3);
		hashtagBar.add(tag4);
		
		panel.add(hashtagBar);
		add(panel);
	}
}
