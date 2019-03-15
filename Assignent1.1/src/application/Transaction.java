package application;  
public class Transaction {
	 private String array[]=new String[5];
	    private int counter=0;
	    private int i;
	
	public void Setarray(String s) {
		if(counter<5) {
			array[counter++]=s;
		i=counter;
		}
		else if(counter==5) {
		    i=5;
		int j;
		for(j=1;j<4;j++)
		array[j-1]=array[j];
		array[4]=s;
		}
		
	}
	
	public String Prev() {
		String s="NO MORE TRANSACTION";	
		if(i>0) {
			--i;
		while(array[i]==null)
			--i;
		return array[i];
	}
		else if(i<=0)
			i=-1;
	return s;
	
	}
	
	public String Next() {
		String s="NO TRANSACTION YET";
		++i;
		if(i>=5)
			i=5;
		
		else if(array[i]==null)
		return s;
		
		else if(i<5)
		return array[i];
		return s;
		
		
		
		
	}	
	
	
	

}
