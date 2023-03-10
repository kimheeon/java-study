package ch06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends MFrame {

		Random r;
		
		//500X500, 바탕색 : WHITE, Resize : false
		
		public MyFrame() {
			super(500,500,Color.white,false);
			r = new Random(); //랜덤 객체
		}
		public void paint(Graphics g) {
			//붓에 노란색 물감 세팅
			//g.drawString("반갑습니다.",50,50);
			for(int i = 0; i<10000; i++) {
				g.setColor(rColor());
				int x = r.nextInt(500);
				int y = r.nextInt(500);
				int w = r.nextInt(10)+5;
				int h = r.nextInt(10)+5;
				//g.drawRect(x,y,w,h);
				g.fillRect(x, y, w, h);
				try {
					Thread.sleep(50);
				} catch (Exception e) {
				}
			}
		}
		public  Color rColor(){
			int rr,gg,bb;
			rr = r.nextInt(256);
			gg = r.nextInt(256);
			bb = r.nextInt(256);
			return new Color(rr,gg,bb);
		}

	public static void main(String[] args) {
		new MyFrame();
	}

}
