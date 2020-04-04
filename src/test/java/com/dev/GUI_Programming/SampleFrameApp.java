package com.dev.GUI_Programming;

import javax.swing.SwingUtilities;

public class SampleFrameApp {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run(){
				
				new MainFrame();
			
			}
		});
		
		
	}
}
