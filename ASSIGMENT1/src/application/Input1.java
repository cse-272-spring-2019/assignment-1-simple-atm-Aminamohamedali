package application;   
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;  
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
  
public class Input1 {  
	Button b0=new Button("0");
    Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");
    Button b9=new Button("9");
    Button back=new Button("BACK");
    Button enter=new Button("ENTER");
    TextField i=new TextField();
    GridPane root=new GridPane(); 
   Homescreen homescreen;
   Scene scene;
   Stage stage;
 
      
  
  public Input1(Stage stage) {
	   this.stage=stage;
  }
 
  
  
    public void input()  {  
        
        
        
        b0.setOnAction(e-> i.appendText("0"));
        b1.setOnAction(e-> i.appendText("1"));
        b2.setOnAction(e-> i.appendText("2"));
        b3.setOnAction(e-> i.appendText("3"));
        b4.setOnAction(e-> i.appendText("4"));
        b5.setOnAction(e-> i.appendText("5"));
        b6.setOnAction(e-> i.appendText("6"));
        b7.setOnAction(e-> i.appendText("7"));
        b8.setOnAction(e-> i.appendText("8"));
        b9.setOnAction(e-> i.appendText("9"));
        
        
        
 back.setOnAction(new EventHandler<ActionEvent>() {  
            
            public void handle(ActionEvent arg0) {  
                stage.setScene(homescreen.getScene());
            }
                  
        }); 
       
 
  
 root.setAlignment(Pos.CENTER);
 root.setStyle("-fx-background-color: #FFF8DC;");
 root.setHgap(5);
 root.setVgap(5);
 root.add(b9, 0, 0);
 b9.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b8, 1, 0);
 b8.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b7, 2, 0);
 b7.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b6, 0, 1);
 b6.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b5, 1, 1);
 b5.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b4, 2, 1);
 b4.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b3, 0, 2);
 b3.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b2, 1, 2);
 b2.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b1, 2, 2);
 b1.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(b0, 0, 3);
 b0.setStyle("-fx-background-color: #A9A9A9; -fx-Font-Weight:BOLD; ");
 root.add(enter, 2, 3);
 enter.setStyle("-fx-background-color: #5F9EA0; -fx-Font-Weight:BOLD; ");
 root.add(i, 3, 4);
 i.setStyle("-fx-Font-color: #000000; -fx-Font-Weight:BOLD; ");
 root.add(back, 3, 5);
 back.setStyle("-fx-background-color: #A52A2A; -fx-Font-Weight:BOLD; ");
 scene=new Scene(root,300,300);
 
    }
    public void enter() {
 
 
 enter.setOnAction(new EventHandler<ActionEvent>() {  
     
     public void handle(ActionEvent arg0) {  
    	 
    	 String number = i.getText();
  	   int result = Integer.parseInt(number);
  	   
      	  homescreen.user.Deposit(result);
      	   i.clear();
         
     }
           
 });  
        
        
    }               
                 
    
    
    public Scene getScene() {
    	return this.scene;
    }
    
    
    public void setHomescreen(Homescreen homescreen) {
    	this.homescreen=homescreen;
    }
    
    
    
  
}  