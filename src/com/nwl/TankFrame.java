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
		
		
		//���ڴ�С
				setSize(800, 600);
				//�����ܷ�Ŵ������С
				setResizable(false);
				//����
				setTitle("tankwar");
				setVisible(true);
				
				this.addKeyListener(new MyKeyListener());
				
				//���һ�����ڼ�����
				addWindowListener(new WindowAdapter() {
					//������
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				
	}
	@Override
	//paint�ڴ��ڵ�һ����ʾ��ʱ��ᱻ����
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
