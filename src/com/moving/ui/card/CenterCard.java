package com.moving.ui.card;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.moving.ui.main.CenterDefault;
import com.moving.ui.main.CenterMovieList;
import com.moving.ui.sub.C_Menubar;


public class CenterCard
	extends JPanel implements ActionListener {
	public static JPanel cardP;
	public static CardLayout card=new CardLayout();



	public CenterCard() {
		cardP=new JPanel();
		CenterDefault.centerdefault=new CenterDefault();
		CenterMovieList.centerMovieList=new CenterMovieList();
		
		cardP.add(CenterDefault.centerdefault,"home");
		cardP.add(CenterMovieList.centerMovieList,"movie");
		
		add(cardP);
	}
	
	//public static JButton home,review,talk,movies,btn1,btn2;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		showPanel(e,C_Menubar.home,"home");
		showPanel(e,C_Menubar.movies,"movie");
		
	}
	
	
	/*
	//메서드들을 인터페이스에 몰아두면?근데 뭐든간에 static이라 상관없는데 이걸 뺼 방법을 찾아보기
	public static void addPanel(JPanel newCard, String Nickname) {
		cardP.add(newCard,Nickname);
	}//대신 마지막에 메인패널. add(centerCP_card)는  자손에서 해줘야함
	*/

	public static void showPanel(ActionEvent e, JButton button, String Nickname) {
		if(e.getSource() == button) {
			card.show(cardP,Nickname);
		}
	}
	public static void main(String[] args) {
		/** 확인용 프레임 창 **/
		JFrame f = new JFrame();
		
		f.setTitle("Panel Check");
		f.add(new CenterCard());
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
