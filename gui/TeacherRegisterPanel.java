package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TeacherRegisterPanel extends JPanel implements ActionListener
{
	 private JButton btn_register;
	 private JTextField tf_name_first;
	 private JTextField tf_name_last;
	 private JTextField tf_pass;
	 private JTextField tf_idnumber;
	 private JLabel lbl_name_first;
	 private JLabel lbl_name_last;
	 private JLabel lbl_idnumber;
	 private JLabel lbl_pass;


	 public TeacherRegisterPanel()
	 {	 
		 JPanel firstNamePanel = new JPanel();
		 //firstNamePanel.setLayout(new CardLayout());
		 JPanel lastNamePanel = new JPanel();
		 //lastNamePanel.setLayout(new CardLayout());
		 JPanel passwordPanel = new JPanel();
		 //passwordPanel.setLayout(new CardLayout());
		 JPanel idnumberPanel = new JPanel();
		 //idnumberPanel.setLayout(new CardLayout());
		 
		 JLabel empty_space = new JLabel("\n");
		 btn_register = new JButton("register");
		 tf_name_first = new JTextField(10);
		 tf_name_last = new JTextField(10);
		 tf_pass = new JTextField(10);
		 tf_idnumber = new JTextField(10);
		 lbl_name_first = new JLabel("First Name:"); 
		 lbl_name_last = new JLabel("Last Name:");
		 lbl_idnumber = new JLabel("Teacher ID Number:");
		 lbl_pass = new JLabel("Enter a Password:");
		 
		 firstNamePanel.add(lbl_name_first);
		 firstNamePanel.add(tf_name_first);
		 lastNamePanel.add(lbl_name_last);
		 lastNamePanel.add(tf_name_last);
		 passwordPanel.add(lbl_pass);
		 passwordPanel.add(tf_pass);
		 idnumberPanel.add(lbl_idnumber);
		 idnumberPanel.add(tf_idnumber);
		 
		 btn_register.setActionCommand("REGISTER");
		 
		 this.add(firstNamePanel);
		 this.add(lastNamePanel);
		 this.add(passwordPanel);
		 this.add(idnumberPanel);
		 this.add(btn_register);		//need to clean up BIG TIME		jkc
	 }


	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("REGISTER"))
		{
		String temp_usernamefirst = tf_name_first.getText();
		String temp_usernamelast = tf_name_last.getText();
		String temp_password = tf_pass.getText();
		int temp_idnumber = (Integer.parseInt(tf_idnumber.getText()));
		
		System.out.println("Add teacher to \"database\" and return to login screen");
		}
		

		
	}
}
