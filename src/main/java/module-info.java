module fr.btsciel.shifumi {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.btsciel.shifumi to javafx.fxml;
    exports fr.btsciel.shifumi;
}