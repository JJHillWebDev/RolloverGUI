import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class MouseRollover extends Application 
{
  	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{  
		Image imageStart = new Image("file:flower_01.jpg");
		Image imageHover = new Image("file:flower_02.jpg");
		  
		ImageView imageView = new ImageView(imageStart);
		imageView.setPreserveRatio(true);
		  
		HBox hbox = new HBox(imageView);
		hbox.setPadding(new Insets(30));

		Scene root = new Scene(hbox);
		primaryStage.setScene(root);
		primaryStage.show();

		imageView.setOnMouseEntered (event -> 
		{
			imageView.setImage(imageHover);
		});

		imageView.setOnMouseExited (event -> 
		{
			imageView.setImage(imageStart);
		});
	}
}