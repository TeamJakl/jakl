import gui.*;
import javax.swing.*;


public class temp_driver extends JApplet 
{

	private static final long serialVersionUID = 1L;
	private int APPLET_WIDTH = 640, APPLET_HEIGHT = 240;
	private LoginPanel lPanel;
	private StudentPanel sPanel;
	private TeacherPanel tPanel;
	private TeacherRegisterPanel trPanel; 

	public void init()
	{
		lPanel = new LoginPanel();
		//sPanel = new StudentPanel();
		tPanel = new TeacherPanel();
		trPanel = new TeacherRegisterPanel();
		
		//Comment or Uncomment for debugging 		jkc
		
		//this.getContentPane().add(lPanel);
		this.getContentPane().add(sPanel);
		//this.getContentPane().add(tPanel);
		//this.getContentPane().add(trPanel);
    	this.setSize(APPLET_WIDTH, APPLET_HEIGHT);
	}

}
