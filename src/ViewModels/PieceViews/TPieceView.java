package ViewModels.PieceViews;

import DataModels.PieceDataModels.TPiece;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import sample.Glob;

public class TPieceView extends PieceView {

    boolean colorBlind;

    public TPieceView(boolean isColorBlind){
        // Create the piece
        p = new TPiece();

        colorBlind = isColorBlind;

//change
        // Draw the shape
        this.getPoints().addAll(gl*-2, gl*-2,
                gl*1, gl*-2,
                gl*1, gl*-1,
                gl*0, gl*-1,
                gl*0, gl*1,
                gl*-1, gl*1,
                gl*-1, gl*-1,
                gl*-2, gl*-1);

        // Paint the piece
        if(colorBlind){
            this.setFill(Glob.TPieceCBColor);
            this.setStroke(Glob.TPieceCBColor);

        }else {
            // Paint the piece
            this.setFill(Glob.TPieceDisplacedColor);
            this.setStroke(Glob.TPiecePlacedColor);
        }
    }

    public void rotateWOAnimating(){
        // Rotate the visual
        this.getTransforms().add(new Rotate(90));

        // Compensate for incorrect rotation axis
        this.getTransforms().add(new Translate(0, gl));

        // Rotate the structure
        p.rotate();
    }

    public void adjustColor(){
        if (colorBlind){
            this.setFill(Glob.TPieceCBColor);
        }
        else {
            if (placed)
                this.setFill(Glob.TPiecePlacedColor);
            else
                this.setFill(Glob.TPieceDisplacedColor);
        }
    }
}
