package application;  
public class atm {
	 private int Balance=0;
	 private Transaction history=new Transaction();
	 
	 public int getBalance() {

			history.Setarray("your Balance " + Balance);
			return Balance;
		
		}
	 
	 
	 public void Deposit(int credit1) {
			Balance=Balance+credit1;
			history.Setarray("you Deposit " + credit1);
			
		}
	 
	 
	 public boolean Withdraw(int credit2) {
			boolean x=false;
		if(credit2<=Balance) {
			history.Setarray("you Withdraw " + credit2);
			Balance=Balance-credit2;
			x=true;
			return x;
			
			}
		return x;
		}
	 
	 public String Brevious() {
			
			return history.Prev();
		}
		public String NEXT() {
		
			return history.Next();
		}
	 
	 
	 
	 
	 

}
