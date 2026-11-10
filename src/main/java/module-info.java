module compteur.s3_qdev_compteur_mvc {
    requires javafx.controls;
    requires javafx.fxml;


    opens compteur.s3_qdev_compteur_mvc to javafx.fxml;
    exports compteur.s3_qdev_compteur_mvc;
}