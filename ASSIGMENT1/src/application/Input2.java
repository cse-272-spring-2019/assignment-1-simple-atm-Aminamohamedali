package application;   

import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class Input2 extends Input1 {

	public Input2(Stage stage) {
		super(stage);
	}
	public void enter() {
		 
		 Label message=new Label();
		 message.setStyle(" -fx-Font-Weight:BOLD; ");
		 root.add(message, 3, 6);
		 enter.setOnAction(new EventHandler<ActionEvent>() {  
		     
		     public void handle(ActionEvent arg0) {  
		    	 
		    	 boolean valid;
	        	   String number = i.getText();
	        	   int result = Integer.parseInt(number);
	        	   valid=homescreen.user.Withdraw(result);
	        	   if(!valid) {
	        		   message.setText("sorry..NO Balance");
	        	   }
	        	   else {
	        		   message.setText("succefull");
	        	   }
	        	   
	            	   i.clear();
		         
		     }
		           
		 });  
		        
		        
		    }     
	
	
	
	

}
