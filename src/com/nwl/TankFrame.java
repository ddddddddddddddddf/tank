package com.nwl;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	int x = 200 , y = 200;
	public TankFrame() {
		
		
		//窗口大小
				setSize(800, 600);
				//窗口能否放大或者缩小
				setResizable(false);
				//标题
				setTitle("tankwar");
				setVisible(true);
				
				this.addKeyListener(new MyKeyListener());
				
				//添加一个窗口监视器
				addWindowListener(new WindowAdapter() {
					//匿名类
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				
	}
	@Override
	//paint在窗口第一次显示的时候会被调用
	public void paint(Graphics g) {
		System.out.println("paint");
		g.fillRect(x, y, 50, 50);
		x += 10;
		//y += 10;
	}
	
	class MyKeyListener extends KeyAdapter{

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			//x += 200;
			//repaint();
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
		}
		
	}

}
