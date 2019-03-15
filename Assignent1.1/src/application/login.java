package application;  
public class login {

	private String number="12345";
	
	
	public boolean setNumber(String num) {
		boolean x=false;
		
		if(num.contentEquals(number))
		x=true;
		
		return x;
	
}
}
