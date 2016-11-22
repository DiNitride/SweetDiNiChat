import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {

    }

    public void start(Stage primaryStage) throws Exception {
        //
        primaryStage.setTitle("DiNiChat");
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("resources/icon.jpg")));

        BorderPane root = new BorderPane();

        /*
            Setting up grid pane. This contains the login menu.
         */
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.getStyleClass().add("grid");
        grid.setMaxSize(250, 200);

        // Welcome title
        Text sceneTitle = new Text("DiNiChat Login");
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0, 2, 1);

        // Login title
        Label userName = new Label("User Name: ");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        // Password fields
        Label pw = new Label("Password: ");
        grid.add(pw, 0, 2);
        PasswordField passwordFieldInput = new PasswordField();
        grid.add(passwordFieldInput, 1, 2);

        // Sign in button
        Button btn = new Button("Sign In");
        HBox hbBtn = new HBox(10.0D);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        /*
            End grid setup
         */

        // Add grid to root
        root.setCenter(grid);

        // Init scene
        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        scene.getStylesheets().add(Main.class.getResource("resources/main.css").toExternalForm());
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
