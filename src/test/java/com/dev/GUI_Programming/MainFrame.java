package com.dev.GUI_Programming;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private textPanel  txtpanel;
	private JButton btn;
    private ToolBar toolbar;
    private FormPanel formpanel;
    
	public MainFrame(){		
		super("Frame Window");
		
		setLayout(new BorderLayout());
		
		toolbar = new ToolBar();
		btn = new JButton("SUBMIT");
		txtpanel = new textPanel();
		formpanel = new FormPanel();
		
		// invoke message in textArea when submit button is clicked
		
		btn.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {				
				txtpanel.textAppend("SuccessFully Completed \n");
		}
		});
		
		formpanel.setFormListener(new FormListener() {
			public void formEventOccured(FormEvent e) {
				
				String name = e.getName();
				String role = e.getJobRole();		
				if(name.isEmpty() && role.isEmpty()) 
					txtpanel.textAppend("User Should Enter Field in the Form \n");
				else {
				txtpanel.textAppend(name + " : " +  role + "\n");
				txtpanel.textAppend("SuccessFully Entered Details \n");}
				
				
			}
		});
		
		
		add(formpanel,BorderLayout.WEST);
		add(toolbar,BorderLayout.NORTH);
		add(txtpanel,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		toolbar.setText(txtpanel);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
	}

}
