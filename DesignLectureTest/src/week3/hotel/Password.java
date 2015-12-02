package week3.hotel;

//import week3.BasicChecker;
//import week3.Checker;
//import week3.StrongChecker;

public class Password {
	
	public static final String INITIAL = "admins";
	private String password;
	
	public Password() {
		password = INITIAL;
	}
	
	public boolean acceptable(String suggestion) {
		return ((suggestion.length() >= 6) && !(suggestion.contains(" ")));
	}
	
	public boolean testWord(String test) {
		return (test.equals(password));
	}
	
	public boolean setWord(String oldpass, String newpass) {
		if (acceptable(newpass) && oldpass.equals(password)) {
			password = newpass;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getPass() {
		return password;
	}
	
	
}
