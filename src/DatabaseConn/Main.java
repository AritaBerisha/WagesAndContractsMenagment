package DatabaseConn;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage)  {

		GridPane pane = new GridPane();
		
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(20, 20, 20, 20));
		pane.setHgap(5);
		pane.setVgap(5);
		
		Label label = new Label();
		label.setText("Employee Details");
		label.setStyle("-fx-background-color:lightblue; -fx-font-size:15px;");
		pane.getChildren().add(label);

		pane.add(new Label("Employee ID:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("First Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		pane.add(new Label("Surname:"), 0, 3);
		pane.add(new TextField(), 1, 3);
		pane.add(new Label("Date Of Birth:"), 0, 4);
		pane.add(new TextField(), 1, 4);
		pane.add(new Label("Email"), 0, 5);
		pane.add(new TextField(), 1, 5);
		pane.add(new Label("Contact"), 0, 6);
		pane.add(new TextField(), 1, 6);
		pane.add(new Label("Address Line 1:"), 0, 7);
		pane.add(new TextField(), 1, 7);
		pane.add(new Label("Address Line 2"), 0, 8);
		pane.add(new TextField(), 1, 8);
		pane.add(new Label("Apt./House No:"), 0, 9);
		pane.add(new TextField(), 1, 9);
		pane.add(new Label("Post Code"), 0, 10);
		pane.add(new TextField(), 1, 10);
		pane.add(new Label("Department:"), 2, 1);
		pane.add(new TextField(), 3, 1);
		pane.add(new Label("Designation:"), 2, 2);
		pane.add(new TextField(), 3, 2);
		pane.add(new Label("Status:"), 2, 3);
		pane.add(new TextField(), 3, 3);
		pane.add(new Label("Date Hired:"), 2, 4);
		pane.add(new TextField(), 3, 4);
		pane.add(new Label("Basic Salary:"), 2, 5);
		pane.add(new TextField(), 3, 5);
		pane.add(new Label("Job Title:"), 2, 6);
		pane.add(new TextField(), 3, 6);
		

		
		Button btAdd = new Button("Add Record");
		btAdd.setStyle("-fx-font: 15 arial; -fx-base:lightblue");
		pane.add(btAdd, 2, 7);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		Button btAd1 = new Button("Clear");
		btAd1.setStyle("-fx-font: 15 arial; -fx-base: lightblue");
		pane.add(btAd1, 3, 7);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		
		Scene scene = new Scene(pane ,900,500);
		primaryStage.setTitle("Employee Details");
		primaryStage.setScene(scene);
		primaryStage.show();

		BorderPane bp = new BorderPane();
		
		HBox hbox2= new HBox();
		hbox2.setPadding(new Insets(20,20,20,20));
		hbox2.setSpacing(10);
		
		Image searchImage = new Image("file:Images/search.png");
		ImageView SImageView = new ImageView(searchImage);
		SImageView.setFitHeight(200);
		SImageView.setFitWidth(200);
		
		Image AddImage = new Image("file:Images/employee.png");
		ImageView AddImageView = new ImageView(AddImage);
		AddImageView.setFitHeight(200);
		AddImageView.setFitWidth(200);
		
		Image editImage = new Image("file:Images/analytics.png");
		ImageView eImageView = new ImageView(editImage);
		eImageView.setFitHeight(200);
		eImageView.setFitWidth(200);
		
//		hbox2.getChildren().addAll(SImageView,AddImageView,eImageView);
//		
//		bp.setTop(hbox);
//		bp.setCenter(hbox2);
//		
//		
//		Scene scene = new Scene(bp, 800, 600);

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
