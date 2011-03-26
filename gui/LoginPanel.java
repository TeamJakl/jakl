package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginPanel extends JPanel implements ActionListener
 {
	private static final long serialVersionUID = 1L;
	private JButton btn_enter;
	private JButton btn_create;
	private JTextField tf_name;
	private JTextField tf_pass;
	private JLabel lbl_name;
	private JLabel lbl_pass;


	public LoginPanel()
	{
		 this.setLayout (new GridLayout (2,0));
		 
		 JLabel empty_space = new JLabel(" ");
		 
		 JPanel topPanel = new JPanel();
		 topPanel.setLayout(new GridLayout(0,3));
		 JPanel topMiddlePanel = new JPanel();
		 //topMiddlePanel.setLayout()
		 JPanel bottomPanel = new JPanel();
		 bottomPanel.setLayout(new FlowLayout());
		 
		 btn_enter = new JButton("Enter");
		 btn_create = new JButton("Create New Account");
		 tf_name = new JTextField(15);
		 tf_pass = new JTextField(15);
		 lbl_name = new JLabel("Name");
		 lbl_pass = new JLabel("Password");
		 
		 btn_create.setActionCommand("CREATE");
		 btn_enter.setActionCommand("ENTER");
		 
		 btn_create.addActionListener(this);
		 btn_enter.addActionListener(this);
		 
		 
		 topMiddlePanel.add(lbl_name);
		 topMiddlePanel.add(tf_name);
		 topMiddlePanel.add(lbl_pass);
		 topMiddlePanel.add(tf_pass);
		 topMiddlePanel.add(btn_enter);
		 
		 topPanel.add(empty_space);
		 topPanel.add(topMiddlePanel);
		 
		 bottomPanel.add(btn_create);
		 
		 this.add(topPanel);
		 this.add(bottomPanel);
	}


	
	public void actionPerformed(ActionEvent e) 
	{
		String temp_username = tf_name.getText();
		String temp_password = tf_pass.getText();
		
		if((e.getActionCommand().toString()).equals("ENTER"))
		{
			if(temp_password.equals("pass"))
			{
				System.out.println("Should check the login info, and grab appropriate panel");
			}
		}

		if((e.getActionCommand().toString()).equals("CREATE"))
		{
				System.out.println("should grab the create account panel");					
		}
	
	}
	
 }

		 
		 
	 






