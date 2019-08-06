package test;
import javax.swing.JFrame;

import com.moving.ui.main.CenterMovieList;

public class Test extends JFrame {
	public static void main(String[] args) {
		/** 확인용 프레임 창 **/
		JFrame f = new JFrame();
		/*
		정적변수 넣을 때, 정적변수 클래스명 타입으로 그냥 초기화해서 넣어도 되고,
		CenterDefault.centerdefault=new CenterDefault();
		이걸 JPanel타입에 업캐스팅해서 넣어도 됨. 
		JPanel a=CenterDefault.centerdefault;
		만약 카드레이아웃 할 때 전자 안되면 후자로 업캐스팅해서 넣어보자.
		*/
		CenterMovieList.centerMovieList=new CenterMovieList();
		
		f.setTitle("Panel Check");
		f.add(CenterMovieList.centerMovieList);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
//상은test
	}
}
