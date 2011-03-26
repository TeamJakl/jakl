package user;

/*
//
//NOTE: this is OLD code i was messing with before the GUI's, i have just pasted it in for the time being		jkc
//
*/


public class User 
{
	private String name_first;
	private String name_last;
	private int id;
	private String pass;
	private String emailAddress;
	private boolean loggedIn;
	
	public User(int temp_id, String temp_name_first, String temp_name_last, String temp_pass, String temp_emailAddress)
	{
		id = temp_id;
		name_first = temp_name_first;
		name_last = temp_name_last;
		pass = temp_pass;
		emailAddress = temp_emailAddress;
		loggedIn = false;
	}
	
	public void changePass(String oldPass, String newPass)
	{
		if(pass == oldPass)
		{
			pass = newPass; 
		}
	}
	
	public String toString()
	{
		return emailAddress;
	}
	
	public String registrationComplete()
	{
		return "You have successfully registered!";
	}
	
	public static boolean login()
			{
				return false;
			}
	
	

}
