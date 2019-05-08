package Scenes;

import DataModels.Player;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import sample.Glob;

public class ArcadeScene extends QuadScene {

    public ArcadeScene() {
        //super(new Pane(), Glob.windowWidth(), Glob.windowHeight());
        super(new Pane(), 800, 600);
        VBox mainLayout = new VBox();
        setRoot(mainLayout);
    }
}
