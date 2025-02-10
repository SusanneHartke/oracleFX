package fxtut.oraclefx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application {       //Jede JFX extended Application
    @Override
    public void start(Stage primaryStage)  {        //start()-Methode der Eingangspunkt aller JFX-Apps
        primaryStage.setTitle("Hello World!!");     // Stage = Top Level JFX Container

        //#######################################
        // Ab hier Teil 1
        // ######################################

//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>(){
//
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.printf("Hello World!");
//            }
//        });

//        StackPane root = new StackPane();           //root unseres Graphen, alle JFX inhalte als knoten im Graph
//           root.getChildren().add(btn);                // btn als Kind von root hinzufügen
//        primaryStage.setScene(new Scene(root, 300, 250));       //Scene = Container for all Content

//##################################################################
        //Ab hier: Teil 2
// ################################################################
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");                  // Text-Objekt ; nicht editierbar?
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));  // Using an inline style is appropriate where the style is bound to a variable, but a better technique for styling the elements of your user interface is by using a cascading style sheet.
        grid.add(sceneTitle, 0, 0, 2, 1);           // einsetzen in Grid: ACHTUNG: unnormale Koordinaten, Spalten zuerst, Zeilen später
                                                                 //Auch: beim ersten Element werden Grid-Dimensionen mitangegeben,
        Label userName = new Label("User Name:");
        grid.add(userName,0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw,0,2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        //grid.setGridLinesVisible(true);     // Für Debugging

        Button btn = new Button("Sign In");
        HBox hbBtn = new HBox(10);          // Horizontale Box mit 10 px spacing
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1,  4);     // HBox nach Spalte 1 Reihe 4

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>(){        //Registriert einen Event Handler

            @Override
            public void handle(ActionEvent e){
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed");
            }
        });

//##################################
        // AB hier Teil 3
//##########################################



        Scene scene = new Scene(grid,300,275);      // Scene is set to 300*275 pixel, wenn leer: minimale größe die nötig ist für Content
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {            // unter manchen Bedingungen nicht notwendig zB JAR file created with JavaFX Packager tool; hier notwendig da ich von ICE aus arbeite. Auch: Swing, das JXF integriert benötigt immer main()
        launch();
    }
}