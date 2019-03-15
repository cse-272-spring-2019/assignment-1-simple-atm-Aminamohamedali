package application;   
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;  
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;


public class Homescreen {  
  public atm user=new atm();
  private Scene scene;
  private Stage stage;
  private Input1 input1;
  private Input2 input2;
      
  
  public Homescreen(Stage stage) {
	   this.stage=stage;
  }
 
  
  
    public void homescreen()  {  
        Label l1=new Label() ;
        l1.setStyle("-fx-Font-color: #000000; -fx-Font-Weight:BOLD; ");
        Label l2=new Label() ;
        l2.setStyle("-fx-Font-color: #000000; -fx-Font-Weight:BOLD; ");
        Button b1=new Button("Balance INQUIRE");
        b1.setStyle("-fx-background-color: #CD5C5C; -fx-Font-Weight:BOLD; ");
        Button b2=new Button("DEPOSIT");
        b2.setStyle("-fx-background-color: #CD5C5C; -fx-Font-Weight:BOLD; ");
        Button b3=new Button("WITHDRAW");
        b3.setStyle("-fx-background-color: #CD5C5C; -fx-Font-Weight:BOLD; ");
        Button b4=new Button("NEXT");
        b4.setStyle("-fx-background-color: #CD5C5C; -fx-Font-Weight:BOLD; ");
        Button b5=new Button("PREVIOUS");
        b5.setStyle("-fx-background-color: #CD5C5C; -fx-Font-Weight:BOLD; ");
        
        b1.setOnAction(new EventHandler<ActionEvent>() {  
                
            public void handle(ActionEvent arg0) {  
                l1.setText(Integer.toString(user.getBalance()));
            }
                  
        });  
        
        
        b4.setOnAction(new EventHandler<ActionEvent>() {  
            
            public void handle(ActionEvent arg0) {  
                l2.setText(user.NEXT());
            }
                  
        });  
        

        b5.setOnAction(new EventHandler<ActionEvent>() {  
            
            public void handle(ActionEvent arg0) {  
                l2.setText(user.Brevious());
            }
                  
        });  
        
        b2.setOnAction(new EventHandler<ActionEvent>() {  
            
            public void handle(ActionEvent arg0) {  
                stage.setScene(input1.getScene());
            }
                  
        });  
        
   b3.setOnAction(new EventHandler<ActionEvent>() {  
            
            public void handle(ActionEvent arg0) {  
                stage.setScene(input2.getScene());
            }
                  
        });  
        
        
        
        
        GridPane root=new GridPane();  
        root.setStyle("-fx-background-color: #FFF8DC;");
        root.setAlignment(Pos.CENTER);
        root.setHgap(5);
        root.setVgap(5);
        root.add(l1, 1, 0);
        root.add(l2, 0, 3);
        root.add(b1, 0, 0);
        root.add(b2, 1, 1);
        root.add(b3, 0, 1);
        root.add(b4, 0, 2);
        root.add(b5, 1, 2);
        
        scene=new Scene(root,300,300);
        
             
        
    }
    
    public Scene getScene() {
    	return this.scene;
    }
    
    public void setinput1(Input1 input1) {
    	this.input1=input1;
    }
    public void setinput2(Input2 input2) {
    	this.input2=input2;
    }
    
    
    
    
    
  
}  