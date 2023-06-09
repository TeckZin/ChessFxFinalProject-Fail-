package com.example.chessfxproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        System.out.println("Game Launch");
        Color backgroundColor = Color.web("#555555");

        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720, backgroundColor);

        primaryStage.setX(20);
        primaryStage.setY(200);


        generateBoard(root);



        primaryStage.setTitle("Chess -- Fx");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void generateBoard(Group root) {
        System.out.println("Board Generated");

        int controlSize = 70;

        for(int file = 0; file < 8; file++) {
            for(int rank = 0; rank< 8; rank++) {


                boolean lightSqaureBoolean = (file + rank) % 2 != 0;
                Color color = Color.web("#F06774");


                if(lightSqaureBoolean == true) {
                    color = Color.web("#D5DF71");
                }


                Rectangle rec = new Rectangle();
                rec.setX(file*controlSize + 100);
                rec.setY(rank*controlSize + 80);

                rec.setWidth(controlSize);
                rec.setHeight(controlSize);
                rec.setFill(color);


                root.getChildren().add(rec);
            }
        }

    }

    public static void main(String[] args) {
        launch();
    }
}