module com.example.chessfxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chessfxproject to javafx.fxml;
    exports com.example.chessfxproject;
}