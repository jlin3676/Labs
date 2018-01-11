package lab4_3;
import java.io.FileInputStream;

import javafx.scene.image.Image;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MinecraftPvP_named_by_brandon extends Application {
	
	    public static void main(String[] args) {
	    	long startTime = System.currentTimeMillis();
	    	//while(startTime < 10000) {
	    		launch(args);
	    	//}
	    }
	    
	    int count = 0;
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("MinecraftPvP simulator");
	        Button btn = new Button("Click as fast as you can");
	        btn.setOnAction(value ->{
	        	count++;
	        	btn.setText("" + count);
	        	
	        	long timeStep = System.nanoTime() + 10000000000L;
	        	new AnimationTimer() {
	       
	            public void handle(long now) {   
	               if(now > timeStep) {
	            	   System.out.println(count);
	            	   System.exit(1);
	               }
	            }
	        	}.start();
	        });
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        btn.setMaxSize(200, 200);
	        primaryStage.setScene(new Scene(root, 500, 400));
	        primaryStage.show();
	        FileInputStream pic = new FileInputStream("New folder/maxresdefault.jpg");
		       Image mine = new Image(pic);
		       ImageView craft = new ImageView(mine);
	       String image = Application.class.getResource("maxresdefault.jpg").toExternalForm();
	        root.setStyle("-fx-background-image: url('" + image + "'); " +
	                   "-fx-background-position: center center; " +
	                   "-fx-background-repeat: stretch;");
	       
	    }
	}
	
/*
	PrintWriter pw = null;\
	try{
		pw = new PrintWriter(new File("results.csv"));
	}
	catch(FileNotFoundException e){
		System.err.println(e);
	}
	StringBuilder sb = new StringBuilder(); // whats a string builder
	//hard coded example
	sb.append();
	sb.append();
	sb.append();
	pw.write(sb.toString());
	pw.close();
*/	

