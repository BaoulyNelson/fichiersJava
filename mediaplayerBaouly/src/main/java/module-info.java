module mediaplayer.mediaplayerbaouly {
    requires javafx.controls;
    requires javafx.fxml;
    requires  javafx.media;
  

    opens mediaplayer.mediaplayerbaouly to javafx.fxml;
    exports mediaplayer.mediaplayerbaouly;
}