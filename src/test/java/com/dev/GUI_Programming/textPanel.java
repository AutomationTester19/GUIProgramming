package com.dev.GUI_Programming;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class textPanel extends JPanel {
	
	private JTextArea textArea;
	public textPanel(){	
		
		textArea = new JTextArea();		
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea),BorderLayout.CENTER);
	}

	public  void textAppend(String text){
	  
		textArea.append(text);
	}
}
