package com.dev.GUI_Programming;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel  {

	private JLabel namelabel;
	private JLabel jobRole;
	private JTextField nameTxt;
	private JTextField jobRoleTxt;
	private JButton okBtn;
	private textPanel textpanel;
	private FormListener listener;
	
	public FormPanel(){
		
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		namelabel = new JLabel("Name : ");
		jobRole = new JLabel("Role : ");
		
		nameTxt = new JTextField(10);
		jobRoleTxt = new JTextField(10);
		
		okBtn = new JButton("OK");
		
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				String name = nameTxt.getText();
				String role = jobRoleTxt.getText();
				
				FormEvent formevent = new FormEvent(this, name, role);
				
				if(formevent!=null){
				  listener.formEventOccured(formevent);
				}
			}
			
		});
			
		
		Border innerBorder = BorderFactory.createTitledBorder("Add Employee Details");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx =1;
		gc.weighty=0.1;
		
		gc.gridx=0;
		gc.gridy=0;
		
		gc.fill = GridBagConstraints.NONE;	
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(namelabel,gc);
		
		gc.gridx=1;
		gc.gridy=0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameTxt,gc);
		
		gc.weightx =1;
		gc.weighty=0.1;
		
		gc.gridy=1;
		gc.gridx=0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(jobRole,gc);
		
		gc.gridy=1;
		gc.gridx=1;
	    gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(jobRoleTxt,gc);
		
		
		gc.weightx =1;
		gc.weighty=1.0;
		
		gc.gridy=2;
		gc.gridx=1;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(okBtn,gc);
		
		
		
	}
	
	public  void setFormListener(FormListener Listener){
		
		 this.listener = Listener;
	}
	}

