package lab4_3;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MinecraftPvP_named_by_brandon extends Application {
	
	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	    int count = 0;
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("MinecraftPvP simulator");
	        Button btn = new Button();
	        btn.setText("Click as fast as you can!");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	            	count++;
	                System.out.println(count);
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        primaryStage.setScene(new Scene(root, 300, 250));
	        primaryStage.show();
	    }
	}

