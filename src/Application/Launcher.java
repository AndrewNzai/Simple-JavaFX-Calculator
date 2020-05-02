package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

          /*
        The Layout of the Scene is loaded from the sample.fxml file.
         */

        Parent root = FXMLLoader.load(getClass().getResource("UILayout.fxml"));
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

       /*
        A CheckBox is created for confirmation of the Calculator application closure.
        */

        primaryStage.setOnCloseRequest(actionEvent ->
        {
            actionEvent.consume();
            Button yesButton = new Button("Yes");
            Button noButton = new Button("No");

            Label label = new Label("Are you sure?");

            VBox vBox = new VBox(label, yesButton, noButton);
            vBox.setPadding(new Insets(10,10,10, 10));
            vBox.setSpacing(20);
            vBox.setAlignment(Pos.CENTER);

            Stage stage = new Stage();
            stage.setScene(new Scene(vBox, 345, 345));
            stage.show();

            yesButton.setOnAction(actionEvent1 -> {
                stage.close();
                primaryStage.close();
            });

            noButton.setOnAction(actionEvent1 -> stage.close());

        });



    }
}
