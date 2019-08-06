package com.moving.ui.sub;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class C_MovieDirectory extends JPanel {
	JPanel panel;
	C_MovieOne aladin,spiderman,toystory4,midsommer,
	silence,lionking,johnwick3,parasite;
	
	
	
	public C_MovieDirectory() {
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,4,5,5));
		
		aladin=new C_MovieOne("./resources/image/poster/aladin.jpg","알라딘",20190523);
		spiderman=new C_MovieOne("./resources/image/poster/spiderman.jpg","스파이더 맨",20190702);
		toystory4=new C_MovieOne("./resources/image/poster/toystory4.jpg","토이스토리4",20190620);
		midsommer=new C_MovieOne("./resources/image/poster/midsommer.jpg","미드소마",20190711);
		silence=new C_MovieOne("./resources/image/poster/silence.jpg","사일런스",20190717);
		lionking=new C_MovieOne("./resources/image/poster/lionking.jpg","라이온킹",20190717);
		johnwick3=new C_MovieOne("./resources/image/poster/johnwick3.jpg","존윅3:파라벨룸",20190626);
		parasite=new C_MovieOne("./resources/image/poster/parasite.jpg","기생충",20190530);
		
		panel.add(aladin);
		panel.add(spiderman);
		panel.add(toystory4);
		panel.add(midsommer);
		panel.add(silence);
		panel.add(lionking);
		panel.add(johnwick3);
		panel.add(parasite);
		
		add(panel);
	}
}
