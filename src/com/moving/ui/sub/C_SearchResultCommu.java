package com.moving.ui.sub;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//본문 내용 TextArea로 바꾸기
public class C_SearchResultCommu extends JPanel {
	JPanel mainP,westP,centerP;
	JButton poster,title;
	JLabel contents,name,date;
	ImageIcon posterImg;

	public C_SearchResultCommu() {
		mainP=new JPanel();
		mainP.setLayout(new BorderLayout());
		mainP.setPreferredSize(new Dimension(800,110));
		
		westP=new JPanel();
		posterImg=new ImageIcon("./resources/image/thumbnail/aladin.jpg");
		poster=new JButton(posterImg);
		poster.setBorderPainted(false);//버튼 외곽선 지움
		poster.setContentAreaFilled(false);//버튼  투명하게
		//poster.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		westP.add(poster);
		
		centerP=new JPanel();
		centerP.setLayout(new GridLayout(4,1));
		title=new JButton("알라딘짱짱짱아ㅏㅇ아앙제목");
		title.setHorizontalAlignment(JButton.LEFT);
		title.setFont(new Font("맑은 고딕",Font.BOLD,15));
		title.setBorderPainted(false);//버튼 외곽선 지움
		title.setContentAreaFilled(false);//버튼  투명하게
		//title.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.

		contents=new JLabel("본문요약ㅁㄴㅇ령ㄴ모라ㅓㅗㅁ너ㅏㅗㄹ너모람");
		contents.setFont(new Font("맑은 고딕",Font.PLAIN,12));

		name=new JLabel("글쓴이");
		name.setFont(new Font("맑은 고딕",Font.BOLD,12));

		date=new JLabel("2019.07.08 씀");
		date.setFont(new Font("맑은 고딕",Font.PLAIN,10));
		
		centerP.add(title);
		centerP.add(contents);
		centerP.add(name);
		centerP.add(date);
		mainP.add(westP,BorderLayout.WEST);
		mainP.add(centerP,BorderLayout.CENTER);
		add(mainP);
	}
	/*
	public SearchResultCommu(String fileName,String title,
			String Contents,String name, int date) {}
	 */
	public static void main(String[] args) {
		JFrame searchResultCommu=new JFrame();

		searchResultCommu.add(new C_SearchResultCommu());
		searchResultCommu.pack();
		searchResultCommu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		searchResultCommu.setVisible(true);

	}

}
