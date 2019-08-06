package com.moving.ui.sub;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_MovieInfo extends JPanel {

	JPanel mainP, northP,southP,
	centerP,
	centerP_1, 
	centerP_1_1,
	centerP_1_1_1,centerP_1_1_2,centerP_1_1_3,
	centerP_1_2,
	centerP_1_2_1, centerP_1_2_2, centerP_1_2_3,
	centerP_2,
	centerP_3,
	centerP_3_1,
	centerP_3_1_1, centerP_3_1_2,
	centerP_3_2,
	centerP_3_3,
	centerP_3_3_1,centerP_3_3_2;
	
	JLabel set, titleK, titleE, dir, kind, act, open,
			content,steal,hash,label01;
	JTextField titleK_tf, titleE_tf,dir_tf,kind_tf,act_tf,open_tf,
				steal_tf,fileName_tf,hash_tf;
	JButton file, delete, setbutton,canbutton;
	JTextArea content_ta;
	public C_MovieInfo() {
		mainP = new JPanel();
		mainP.setLayout(new BorderLayout());
		mainP.setPreferredSize(new Dimension(780,550));
		
		northP = new JPanel(); //영화 정보 등록 
		northP.setLayout(new GridLayout(1,1));
		northP.setPreferredSize(new Dimension(780,40));
//		northP.setBackground(Color.orange);
		JLabel set = new JLabel("영화 정보 등록");
		set.setFont(new Font("맑은 고딕",Font.BOLD,25));
		northP.add(set);
		set.setHorizontalAlignment(JLabel.LEFT);
		
		centerP = new JPanel();  //center 패널 범위 : 제목(한글) ~ 태그 간 구분(,)입력 
		centerP.setLayout(new BorderLayout());
		centerP.setPreferredSize(new Dimension(780,430));
	
		
		centerP_1 = new JPanel(); //center 1 :  제목(한글) ~ 개봉일
		centerP_1.setPreferredSize(new Dimension(780,150));
//		centerP_1.setBackground(Color.BLACK);
		centerP_1.setLayout(new BorderLayout());
		centerP_1_1 = new JPanel(); // center1_1 : 제목(한글),감독,배우
		centerP_1_1.setPreferredSize(new Dimension(390,150));
//		centerP_1_1.setBackground(Color.CYAN);
		centerP_1_2 = new JPanel();	// center1_2 : 제목(영문),장르,개봉일
		centerP_1_2.setPreferredSize(new Dimension(390,150));
//		centerP_1_2.setBackground(Color.MAGENTA);
		
		centerP.add(BorderLayout.NORTH,centerP_1); //center패널에 center_1을 북쪽에배치
		centerP_1.add(BorderLayout.WEST,centerP_1_1); //center_1패널에 center1_1을 서쪽배치
		centerP_1.add(BorderLayout.EAST,centerP_1_2); //center_1패널에 center1_2를 동쪽배치
		
		centerP_1_1.setLayout(new BorderLayout()); // 제목(한글)
		centerP_1_1_1 = new JPanel();
		centerP_1_1_1.setPreferredSize(new Dimension(390,50));
//		centerP_1_1_1.setBackground(Color.BLACK);
		
		centerP_1_1_2 = new JPanel(); // 감독
		centerP_1_1_2.setPreferredSize(new Dimension(390,50));
//		centerP_1_1_2.setBackground(Color.GRAY);
		centerP_1_1_3 = new JPanel(); // 배우
		centerP_1_1_3.setPreferredSize(new Dimension(390,50));
//		centerP_1_1_3.setBackground(Color.YELLOW);
		

		
		centerP_1_2.setLayout(new BorderLayout());
		centerP_1_2_1 = new JPanel(); // 제목(영문)
		centerP_1_2_1.setPreferredSize(new Dimension(390,50));
//		centerP_1_2_1.setBackground(Color.YELLOW);
		centerP_1_2_2 = new JPanel(); // 장르
		centerP_1_2_2.setPreferredSize(new Dimension(390,50));
//		centerP_1_2_2.setBackground(Color.BLACK);
		centerP_1_2_3 = new JPanel(); // 개봉일
		centerP_1_2_3.setPreferredSize(new Dimension(390,50));
//		centerP_1_2_3.setBackground(Color.WHITE);
			
		centerP_1_1.add(BorderLayout.NORTH,centerP_1_1_1); //제목(한글)패널
		centerP_1_1.add(BorderLayout.CENTER,centerP_1_1_2); //감독패널
		centerP_1_1.add(BorderLayout.SOUTH,centerP_1_1_3); //배우패널
		
		centerP_1_2.add(BorderLayout.NORTH,centerP_1_2_1); //제목(영문)패널
		centerP_1_2.add(BorderLayout.CENTER,centerP_1_2_2); //장르패널
		centerP_1_2.add(BorderLayout.SOUTH,centerP_1_2_3); //개봉일패널
		
		titleK = new JLabel("제목 (한글) "); //제목(한글)라벨 생성
		titleK.setFont(new Font("맑은 고딕",Font.BOLD,20));
		titleK_tf = new JTextField(20); //제목(한글) 텍스트필드 생성
		centerP_1_1_1.add(titleK); //제목(한글)패널에 라벨추가
		centerP_1_1_1.add(titleK_tf); //제목(한글)패널에 텍스트필드 추가

		dir = new JLabel("     감   독 ");
		dir.setFont(new Font("맑은 고딕",Font.BOLD,20));
		dir_tf = new JTextField(20);
		centerP_1_1_2.add(dir);
		centerP_1_1_2.add(dir_tf);
		
		titleE = new JLabel("제목 (영문) ");
		titleE.setFont(new Font("맑은 고딕",Font.BOLD,20));
		titleE_tf = new JTextField(20);
		centerP_1_2_1.add(titleE);
		centerP_1_2_1.add(titleE_tf);
		
		kind = new JLabel("     장    르 ");
		kind.setFont(new Font("맑은 고딕",Font.BOLD,20));
		kind_tf = new JTextField(20);
		centerP_1_2_2.add(kind);
		centerP_1_2_2.add(kind_tf);
		
		act = new JLabel("     배   우 ");
		act.setFont(new Font("맑은 고딕",Font.BOLD,20));
		act_tf = new JTextField(20);
		centerP_1_1_3.add(act);
		centerP_1_1_3.add(act_tf);
		
		open = new JLabel("    개 봉 일 ");
		open.setFont(new Font("맑은 고딕",Font.BOLD,20));
		open_tf = new JTextField(20);
		centerP_1_2_3.add(open);
		centerP_1_2_3.add(open_tf);
		
		centerP_2 = new JPanel(); // 내용 패널 생성
		centerP_2.setPreferredSize(new Dimension(780,150));
//		centerP_2.setBackground(Color.GRAY);
		centerP.add(BorderLayout.CENTER,centerP_2);
		
		content = new JLabel("        내  용 "); //내용 라벨 생성
		content.setFont(new Font("맑은 고딕",Font.BOLD,20));
		content_ta = new JTextArea(13,56); //내용 여러줄입력박스 생성
		JScrollPane sc = new JScrollPane(content_ta);
		
		
		centerP_2.add(content); //내용패널에 라벨추가
//		centerP_2.add(content_ta); //내용 패널에 입력박스 추가
		centerP_2.add(sc);
		
		centerP_3 = new JPanel(); // center_3 패널 생성 -> 범위 : 포스터 ~ 태그 간 구분(,)입력
		centerP_3.setLayout(new BorderLayout());
		centerP_3.setPreferredSize(new Dimension(780,100));
//		centerP_3.setBackground(Color.YELLOW);
		
		centerP_3_1 = new JPanel(); //  포스터 ~ 이미지삭제
		centerP_3_1.setLayout(new BorderLayout());
		centerP_3_1.setPreferredSize(new Dimension(780,33));
//		centerP_3_1.setBackground(Color.PINK);
		
		centerP_3_1_1 = new JPanel(); // 포스터 패널
		centerP_3_1_1.setPreferredSize(new Dimension(390,33));
//		centerP_3_1_1.setBackground(Color.CYAN);
		
		steal = new JLabel("       포스터 "); // 포스터라벨
		steal.setFont(new Font("맑은 고딕",Font.BOLD,20));
		steal_tf = new JTextField(20); //포스터 텍스트필드
		
		centerP_3_1_1.add(steal);
		centerP_3_1_1.add(steal_tf);
		
		centerP_3_1_2 = new JPanel(); //이미지 첨부,삭제 패널
		centerP_3_1_2.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
		centerP_3_1_2.setPreferredSize(new Dimension(390,33));
//		centerP_3_1_2.setBackground(Color.BLACK);
		
		
		file = new JButton("이미지 첨부"); //첨부버튼생성
		file.setFont(new Font("맑은 고딕",Font.BOLD,10));
		file.setBackground(Color.WHITE);
		centerP_3_1_2.add(file); //패널에 버튼 추가
		
		delete = new JButton("이미지 삭제"); //삭제버튼 생성
		delete.setFont(new Font("맑은 고딕",Font.BOLD,10));
		delete.setBackground(Color.WHITE);
		centerP_3_1_2.add(delete);
		
		centerP_3_1.add(BorderLayout.WEST,centerP_3_1_1); //포스터패널 서쪽배치
		centerP_3_1.add(BorderLayout.EAST,centerP_3_1_2); //첨부,삭제버튼 패널 동쪽배치
		
		centerP_3_2 = new JPanel(); //첨부된 파일명 
		centerP_3_2.setPreferredSize(new Dimension(780,33));
//		centerP_3_2.setBackground(Color.BLUE);
		
		fileName_tf = new JTextField(44); //첨부된 파일명 한줄입력박스 생성
		fileName_tf.setEditable(false); //첨부된 파일명이 떠야하므로 직접수정불가
		fileName_tf.setText("이미지1, 이미지2, 이미지3,이미지4");
		centerP_3_2.add(fileName_tf);
		
		
		
		
		centerP_3_3 = new JPanel(); //해시태그~태그 간 구분(,)입력
		centerP_3_3.setLayout(new BorderLayout());
		centerP_3_3.setPreferredSize(new Dimension(780,33));
//		centerP_3_3.setBackground(Color.BLACK);
		
		
		
		centerP_3_3_1 = new JPanel(); //해시태그 패널
		centerP_3_3_1.setPreferredSize(new Dimension(390,33));
//		centerP_3_3_1.setBackground(Color.YELLOW);
		
		hash = new JLabel("         해시 태그");
		hash.setFont(new Font("맑은 고딕",Font.BOLD,15));
		hash_tf = new JTextField(20);
		hash_tf.setText("#");
		
		centerP_3_3_1.add(hash);
		centerP_3_3_1.add(hash_tf);

		
		
		centerP_3_3_2 = new JPanel(); //태그입력 안내창 패널
		centerP_3_3_2.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
		centerP_3_3_2.setPreferredSize(new Dimension(390,33));
//		centerP_3_3_2.setBackground(Color.CYAN);
		
		label01 = new JLabel("태그 간 구분(,)입력");
		centerP_3_3_2.add(label01);
		
		
		
		
		centerP.add(BorderLayout.SOUTH,centerP_3);
		centerP_3.add(BorderLayout.NORTH,centerP_3_1);
		centerP_3.add(BorderLayout.CENTER,centerP_3_2);
		centerP_3.add(BorderLayout.SOUTH,centerP_3_3);
		centerP_3_3.add(BorderLayout.WEST,centerP_3_3_1);
		centerP_3_3.add(BorderLayout.EAST,centerP_3_3_2);
		

		
		
		southP = new JPanel(); //등록,취소 패널
		southP.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		southP.setPreferredSize(new Dimension(780,40));
//		southP.setBackground(Color.RED);
		setbutton = new JButton("등록");
		setbutton.setBackground(Color.WHITE);
		canbutton = new JButton("취소");
		canbutton.setBackground(Color.WHITE);

		southP.add(setbutton);
		southP.add(canbutton);
		
		
		mainP.add(BorderLayout.NORTH,northP);
		mainP.add(BorderLayout.CENTER,centerP);
		mainP.add(BorderLayout.SOUTH,southP);
		add(mainP);
		
	}
	
}
