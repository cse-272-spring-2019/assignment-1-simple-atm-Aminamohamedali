package application;   
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;  
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Loginform {  
  private login password=new login();
  private Scene scene;
  private Homescreen homescreen;
  private Stage stage;
  
   public Loginform(Stage stage) {
	   this.stage=stage;
   }
  
  
  
 
      
    public void loginform()  {  
        Label l1=new Label("PLEASE ENTER YOUR CREDIT NUMBER") ;
        l1.setStyle("-fx-font-size: 15; ");
        Label l2=new Label() ;
        
        PasswordField p1=new PasswordField();
        Button b1=new Button("enter");
        b1.setStyle("-fx-background-color: #A52A2A; -fx-Font-Weight:BOLD; ");
        
        
        b1.setOnAction(new EventHandler<ActionEvent>() {  
                
            public void handle(ActionEvent arg0) {  
                boolean x=password.setNumber(p1.getText());
                if(!x) {
                	l2.setStyle("-fx-Font-color: #DC143C; ");
                	l2.setText("PLEASE ENTER RIGHT NUMBER");
                	
                p1.clear();
                }
                else
                	stage.setScene(homescreen.getScene());
            }
                  
        });  
        
        
        
        GridPane root=new GridPane();  
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #FFF8DC;");
        root.setHgap(5);
        root.setVgap(5);
        root.add(l1, 0, 0);
        root.add(l2, 0, 3);
        root.add(p1, 0, 1);
        root.add(b1, 0, 2);
        
        scene=new Scene(root,300,300);
        
             
        
    }
    
    public Scene getScene() {
    	return this.scene;
    }
    public void setHomescreen(Homescreen homescreen) {
    	this.homescreen=homescreen;
    }
    
    
    
    
    
  
}  