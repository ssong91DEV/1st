package com.moving.ui.main;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.moving.ui.sub.C_Hashtagbar;
import com.moving.ui.sub.C_Menubar;
import com.moving.ui.sub.C_MovieDirectory;
import com.moving.ui.sub.C_Searchbar;

public class CenterDefault extends JPanel {
	public static JPanel centerdefault;
	public JPanel northP,centerP,eastP;
	
	public C_Hashtagbar hashtagbar=new C_Hashtagbar();
	public C_Menubar menubar=new C_Menubar();
	public C_MovieDirectory moviedirectory=new C_MovieDirectory();
	public C_Searchbar searchbar=new C_Searchbar();
	
	JScrollPane scroll;
	
	public CenterDefault() {
		centerdefault=new JPanel();
		centerdefault.setLayout(new BorderLayout());
		//panel.setPreferredSize(new Dimension(800,600));
		
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

		scroll=new JScrollPane(centerdefault,
	    		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	    		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);   
	    //scroll.setPreferredSize(new Dimension(800,600));
	    scroll.getVerticalScrollBar().setUnitIncrement(16);
	    add(scroll);
		
	}	
}
