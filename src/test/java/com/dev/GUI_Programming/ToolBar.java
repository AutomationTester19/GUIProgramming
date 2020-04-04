package com.dev.GUI_Programming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel  implements ActionListener {
	
	private JButton submitButton;
	private JButton  clearButton;
	private textPanel textpanel;
	
	public ToolBar(){
		
		submitButton = new JButton("ENTER");
		clearButton = new JButton("RESET");
		
		submitButton.addActionListener(this);
		clearButton.addActionListener(this);
		
	  setLayout(new FlowLayout(FlowLayout.CENTER));
	  
		add(submitButton);
		add(clearButton);
	}
	
	public void setText(textPanel textpanel){
		this.textpanel = textpanel;
		
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton btnSource = (JButton) e.getSource();
		
		if(submitButton == btnSource ){
			textpanel.textAppend("ENTER Button Clicked\n");}
		else if(clearButton == btnSource){
			textpanel.textAppend("RESET Button Clicked\n");}
	
		
	}

	
}
