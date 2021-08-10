/**@author Asimiea Sobomate-Victor
3703507**/


import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class App extends Application{
	private Label firstMessage;
	private Label secondMessage;
	private TextField a;
	private Text b;
	private Button guess;
	
	
	public void start (Stage primaryStage){
		primaryStage.setTitle("Guess the number");
		
		firstMessage = new Label("Try guessing the number!!");
		secondMessage = new Label("Between 1 and 10");
		
		a = new TextField("");
		a.setPrefWidth(150);
		
		guess = new Button("Guess!");
		guess.setOnAction(this::processGuessButtonPress);
		guess.setMinWidth(150);
		
		b = new Text("Welcome to the Guessing game!");
			
		FlowPane p = new FlowPane(firstMessage, secondMessage, a, guess, b);
		p.setVgap(20);
		p.setHgap(50);
		p.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(p, 250, 230);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void processGuessButtonPress(ActionEvent e){
		String c = a.getText();
		Random rand = new Random();
		int upperbound = 11;
		int d = rand.nextInt(upperbound);
		
		if(/*Integer.parseInt(c) == 1*/c == String.valueOf(d)){
			b.setText("Good job, you got it right!");
		}else{
			b.setText("Try again LOSER!!");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}