package com.moving.ui.main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.moving.ui.sub.C_Hashtagbar;
import com.moving.ui.sub.C_Menubar;
import com.moving.ui.sub.C_MovieDirectory;
import com.moving.ui.sub.C_Searchbar;

public class CenterDefaultForm extends JPanel {
	public static JPanel centerdefault;
	public JPanel northP,centerP,eastP;
	
	public C_Hashtagbar hashtagbar=new C_Hashtagbar();
	public C_Menubar menubar=new C_Menubar();
	public C_Searchbar searchbar=new C_Searchbar();
	//기본
	public C_MovieDirectory moviedirectory=new C_MovieDirectory();
	//내용
	
	JScrollPane scroll;
	
	public CenterDefaultForm() {
		centerdefault=new JPanel();
		centerdefault.setLayout(new BorderLayout());
		centerdefault.setPreferredSize(new Dimension(800,600));
		
		northP=new JPanel();
		northP.setLayout(new BorderLayout());
		northP.add(searchbar,BorderLayout.NORTH);//(800,30)
		northP.add(hashtagbar,BorderLayout.CENTER);//(800,30)
		northP.add(menubar,BorderLayout.SOUTH);//(800,40)
		
		centerP=new JPanel();
		//centerP.setPreferredSize(new Dimension(650, 600));
		centerP.add(moviedirectory);
		centerdefault.add(northP,BorderLayout.NORTH);
		centerdefault.add(centerP,BorderLayout.CENTER);
		
		add(centerdefault);

		/* 스크롤 연습1
		JScrollPane scroll=new JScrollPane(centerP);
		centerP=new JPanel();
		centerP.setLayout(new GridBagLayout());
		//create_form(new JButton(""),0,0,30,10);
		 */
		/* 스크롤연습2
		eastP=new JPanel();//들어갈 panel은 레이아웃 GridBag 사용
		eastP.setLayout(gbl);
		//create_form(moviedirectory,0,0);
		
		scroll=new JScrollPane(eastP);
		//scroll.setBounds(780,500,0,0);
		eastP.add(scroll);
		//upDown.setViewport(centerP);
		//centerP.add(upDown);
		JScrollPane scroll=new JScrollPane(centerP);
		panel.add(scroll,BorderLayout.EAST);
		 */
		
	}	
}
