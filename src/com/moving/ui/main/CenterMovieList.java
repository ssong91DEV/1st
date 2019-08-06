package com.moving.ui.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.moving.ui.sub.C_Hashtagbar;
import com.moving.ui.sub.C_Menubar;
import com.moving.ui.sub.C_MovieDirectory;
import com.moving.ui.sub.C_Searchbar;

public class CenterMovieList extends JPanel {
	public static JPanel centerMovieList;
	public JPanel northP,centerP,southP;
	public JButton moreB;
	
	public C_Hashtagbar hashtagbar=new C_Hashtagbar();
	public C_Menubar menubar=new C_Menubar();
	public C_MovieDirectory moviedirectory=new C_MovieDirectory();
	public C_Searchbar searchbar=new C_Searchbar();
	
	JScrollPane scroll;
	
	public CenterMovieList() {
		centerMovieList=new JPanel();
		centerMovieList.setLayout(new BorderLayout());
		//centerMovieList.setPreferredSize(new Dimension(800,600));
		
		northP=new JPanel();
		northP.setLayout(new BorderLayout());
		northP.add(searchbar,BorderLayout.NORTH);//(800,30)
		northP.add(hashtagbar,BorderLayout.CENTER);//(800,30)
		northP.add(menubar,BorderLayout.SOUTH);//(800,40)
		
		centerP=new JPanel();
		//centerP.setPreferredSize(new Dimension(650, 600));
		centerP.add(moviedirectory);
		
		southP=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		moreB=new JButton("+            ");
		southP.add(moreB);
		
		centerMovieList.add(northP,BorderLayout.NORTH);
		centerMovieList.add(centerP,BorderLayout.CENTER);
		centerMovieList.add(southP,BorderLayout.SOUTH);
		add(centerMovieList);

		scroll=new JScrollPane(centerMovieList,
	    		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	    		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);   
	    scroll.setPreferredSize(new Dimension(800,600));
	    scroll.getVerticalScrollBar().setUnitIncrement(16);
	    add(scroll);
		
	}	
}
