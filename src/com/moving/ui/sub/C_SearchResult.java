package com.moving.ui.sub;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//버튼 클릭시 추천순 앞에 체크표시 생기게 하기
public class C_SearchResult extends JPanel {
	public JPanel mainP,mainN,mainC,mainS,
	/*movieP,*/movieN,movieC,movieS,/*commuP,*/commuN,commuC,commuS;
	public JLabel result,movie,commu;
	public JButton like1,abc1,date1,like2,abc2,date2;
	public C_MovieOne aladin=new C_MovieOne("./resources/image/poster/aladin.jpg","알라딘",20190523);
	public C_MovieOne spiderman=new C_MovieOne("./resources/image/poster/spiderman.jpg","스파이더 맨",20190702);
	public C_MovieOne toystory4=new C_MovieOne("./resources/image/poster/toystory4.jpg","토이스토리4",20190620);
	public C_MovieOne midsommer=new C_MovieOne("./resources/image/poster/midsommer.jpg","미드소마",20190711);
	public C_SearchResultCommu searchResultCommu1=new C_SearchResultCommu();
	public C_SearchResultCommu searchResultCommu2=new C_SearchResultCommu();
	
	public C_SearchResult() {
		mainP=new JPanel();
		mainP.setLayout(new BorderLayout());
		//////////////////////////////////////////////////
		
		mainN=new JPanel();
		mainN.setLayout(new FlowLayout(FlowLayout.LEFT,0,5));
		//mainN.setLayout(new BorderLayout());
		result=new JLabel(" '알라딘'에 대한 검색 결과입니다.");
		mainN.add(result,BorderLayout.NORTH);
//////////////////////////////////////////////////
		
		mainC=new JPanel();
		mainC.setLayout(new BorderLayout());
		movieN=new JPanel();
		movieN.setLayout(new FlowLayout(FlowLayout.LEFT,0,3));
		movieC=new JPanel();
		movieC.setLayout(new FlowLayout(FlowLayout.RIGHT,0,2));
		movieS=new JPanel();
		movieS.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		
		movie=new JLabel(" 영화");
		movie.setFont(new Font("맑은 고딕",Font.BOLD,20));
		
		like1=new JButton("추천순");
		like1.setFont(new Font("맑은 고딕",Font.BOLD,10));
		like1.setBorderPainted(false);//버튼 외곽선 지움
		like1.setContentAreaFilled(false);//버튼  투명하게
		//like1.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		abc1=new JButton("가나다순");
		abc1.setFont(new Font("맑은 고딕",Font.BOLD,10));
		abc1.setBorderPainted(false);//버튼 외곽선 지움
		abc1.setContentAreaFilled(false);//버튼  투명하게
		//abc1.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.

		date1=new JButton("개봉일순");
		date1.setFont(new Font("맑은 고딕",Font.BOLD,10));
		date1.setBorderPainted(false);//버튼 외곽선 지움
		date1.setContentAreaFilled(false);//버튼  투명하게
		//date1.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		
		//movieP=new JPanel();
		//movieP.setLayout(new FlowLayout());
		
		movieN.add(movie);
		movieC.add(like1); movieC.add(abc1); movieC.add(date1);
		movieS.add(aladin);	movieS.add(spiderman);
		movieS.add(toystory4);	movieS.add(midsommer);
		
		mainC.add(movieN,BorderLayout.NORTH);
		mainC.add(movieC,BorderLayout.CENTER);
		mainC.add(movieS,BorderLayout.SOUTH);
		
//////////////////////////////////////////////////
		
		//commuP=new JPanel();
		//commuP.setLayout(new FlowLayout());
		mainS=new JPanel();
		mainS.setLayout(new BorderLayout());
		commuN=new JPanel();
		commuN.setLayout(new FlowLayout(FlowLayout.LEFT,0,3));
		commuC=new JPanel();
		commuC.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		commuS=new JPanel();
		commuS.setLayout(new GridLayout(2,1));
		//commuS.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		
		commu=new JLabel(" 커뮤니티-리뷰/자유 게시판");
		commu.setFont(new Font("맑은 고딕",Font.BOLD,20));
		
		like2=new JButton("추천순");
		like2.setFont(new Font("맑은 고딕",Font.BOLD,10));
		like2.setBorderPainted(false);//버튼 외곽선 지움
		like2.setContentAreaFilled(false);//버튼  투명하게
		//like2.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		abc2=new JButton("가나다순");
		abc2.setFont(new Font("맑은 고딕",Font.BOLD,10));
		abc2.setBorderPainted(false);//버튼 외곽선 지움
		abc2.setContentAreaFilled(false);//버튼  투명하게
		//abc2.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		date2=new JButton("게시일순");
		date2.setFont(new Font("맑은 고딕",Font.BOLD,10));
		date2.setBorderPainted(false);//버튼 외곽선 지움
		date2.setContentAreaFilled(false);//버튼  투명하게
		//date2.setFocusPainted(false);//클릭시 생기는 테두리 사용 안 함.
		
		commuN.add(commu);
		commuC.add(like2); commuC.add(abc2); commuC.add(date2);
		commuS.add(searchResultCommu1);	
		commuS.add(searchResultCommu2);	
		
		mainS.add(commuN,BorderLayout.NORTH);
		mainS.add(commuC,BorderLayout.CENTER);
		mainS.add(commuS,BorderLayout.SOUTH);
		
		
		
		mainP.add(mainN,BorderLayout.NORTH);
		mainP.add(mainC,BorderLayout.CENTER);
		mainP.add(mainS,BorderLayout.SOUTH);
		
		add(mainP);
		

	}
	public static void main(String[] args) {
		JFrame searchResult=new JFrame();
		
		searchResult.add(new C_SearchResult());
		searchResult.pack();
		searchResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		searchResult.setVisible(true);

	}

}
