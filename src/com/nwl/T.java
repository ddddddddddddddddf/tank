package com.nwl;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
	public static void main(String[] args) throws InterruptedException {
		TankFrame tf = new TankFrame();
		//
		while(true) {
			Thread.sleep(50);
			tf.repaint();
		}
		
			
	}

}
