module br.eti.kge.javafx.sendobjects {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens br.eti.kge.javafx.sendobjects to javafx.fxml;
    exports br.eti.kge.javafx.sendobjects;
}
