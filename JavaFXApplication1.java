/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafxapplication1.CriticalPathMethod;
import javafxapplication1.NorthwestCornerMethod;

/**
 *
 * @author Hello
 */
public class JavaFXApplication1 extends Application {
    int i =0;
    int xcord1=0;int ycord1=0;int xcord2=0;int ycord2=0;
    NorthwestCornerMethod NCM = new NorthwestCornerMethod();
    int[] supply = {20, 30};
    int[] demand = {10, 25, 15};
    int[][] costMatrix = {
        {xcord1, ycord1,},
        {xcord2, ycord2,}
    };
    int[][] result = NCM.northwestCornerMethod(supply, demand, costMatrix);
        
    CriticalPathMethod CP = new CriticalPathMethod();
    int[] durations = {3, 2,};
    int criticalPathLength = CP.calculateCriticalPath(costMatrix, durations);
    
    @Override
    public void start(Stage primaryStage) {
       
        Image image = new Image("javafxapplication1/map.png");
        ImageView imageview = new ImageView(image);
        imageview.setFitHeight(500);
        imageview.setPreserveRatio(true);
        imageview.setLayoutX(75);
        imageview.setLayoutY(50);
        
        Text t = new Text ("select current location: ");
        t.setFont(Font.font("Verdana",  20));
        t.setLayoutX(60);
        t.setLayoutY(575);
        
        Text t2 = new Text("");
        t2.setFont(Font.font("Verdana",  20));
        t2.setLayoutX(60);
        t2.setLayoutY(610);
        
        Button btn = new Button();
        btn.setText("NLT");
        btn.setLayoutX(60);
        btn.setLayoutY(650);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                i++;
                xcord1 = 10;ycord1 =20;
                t.setText("select destination: ");
                if (i>=2){
                    xcord2 = 10;ycord2 =20;
                    t.setText("shortest transportation cost is {" + result[0][0] +" "+ result[0][1] +" "+ result[0][2] +" }{"+ result[1][0] +" "+ result[1][1] +" "+ result[1][2] +"}" );
                    t2.setText("the Critical Path Length is: " + criticalPathLength +"km");
                }
            }
        });
        Button btn2 = new Button();
        btn2.setText("SCIENCE");
        btn2.setLayoutX(260);
        btn2.setLayoutY(650);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                i++;
                xcord1 = 10;ycord1 =20;
                t.setText("select destination: ");
                if (i>=2){
                    xcord2 = 10;ycord2 =20;
                    t.setText("shortest transportation cost is {" + result[0][0] +" "+ result[0][1] +" "+ result[0][2] +" }{"+ result[1][0] +" "+ result[1][1] +" "+ result[1][2] +"}" );
                    t2.setText("the Critical Path Length is: " + criticalPathLength +"km");
                }
            }
        });
        Button btn3 = new Button();
        btn3.setText("OLD SITE");
        btn3.setLayoutX(460);
        btn3.setLayoutY(650);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                i++;
                xcord1 = 10;ycord1 =20;
                t.setText("select destination: ");
                if (i>=2){
                    xcord2 = 10;ycord2 =20;
                    t.setText("shortest transportation cost is {" + result[0][0] +" "+ result[0][1] +" "+ result[0][2] +" }{"+ result[1][0] +" "+ result[1][1] +" "+ result[1][2] +"}" );
                    t2.setText("the Critical Path Length is: " + criticalPathLength +"km");
                }
            }
        });
        Button btn4 = new Button();
        btn4.setText("SRC");
        btn4.setLayoutX(660);
        btn4.setLayoutY(650);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                i++;
                xcord1 = 10;ycord1 =20;
                t.setText("select destination: ");
                if (i>=2){
                    xcord2 = 10;ycord2 =20;
                    t.setText("shortest transportation cost is {" + result[0][0] +" "+ result[0][1] +" "+ result[0][2] +" }{"+ result[1][0] +" "+ result[1][1] +" "+ result[1][2] +"}" );
                    t2.setText("the Critical Path Length is: " + criticalPathLength +"km");
                }
            }
        });
        Button btn5 = new Button();
        btn5.setText("OK");
        btn5.setLayoutX(60);
        btn5.setLayoutY(700);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                i = 0;
                xcord1 = 0;ycord1 =0;
                xcord2 = 0;ycord2 =0;
                t.setText("select current location: ");
                t2.setText("");
            }
        });
         Pane root = new Pane();
        //StackPane root = new StackPane();
        //Image image = new Image("map.png");
        //ImageView imageview = new ImageView(image);
        //imageview.setFitHeight(200);
        //imageview.setPreserveRatio(true);
        //HBox roote = new HBox();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(imageview);
        root.getChildren().add(t);
        root.getChildren().add(t2);
        
        Scene scene = new Scene(root, 1180, 820);
        
        primaryStage.setTitle("algorithm project group 10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
