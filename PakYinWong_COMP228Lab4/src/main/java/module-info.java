module com.example.pakyinwong_comp228lab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pakyinwong_comp228lab4 to javafx.fxml;
    exports com.example.pakyinwong_comp228lab4;
}