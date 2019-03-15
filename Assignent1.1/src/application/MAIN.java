package application;   
import javafx.application.Application;  
import javafx.stage.Stage;  



public class MAIN extends Application{  
  
	public static void main (String[] args)  
    {  
        launch(args);  
    }  
	
    public void start(Stage primaryStage) throws Exception {  
        primaryStage.setTitle("ATM");
        Loginform loginform=new Loginform(primaryStage);
        Homescreen homescreen=new Homescreen(primaryStage);
        Input1 input1=new Input1(primaryStage);
        Input2 input2=new Input2(primaryStage);
        
        loginform.loginform();
        homescreen.homescreen();
        input1.input();
        input2.input();
        input1.enter();
        input2.enter();
        
        loginform.setHomescreen(homescreen);
        homescreen.setinput1(input1);
        homescreen.setinput2(input2);
        input1.setHomescreen(homescreen);
        input2.setHomescreen(homescreen);
        
        
        primaryStage.setScene(loginform.getScene());
       
        
        
        primaryStage.show();
  
}  
}