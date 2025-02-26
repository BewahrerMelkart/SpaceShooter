package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Dient zum Zeichnen von nicht beweglichen Objekten im Hintergrund
 */
public class StartBackground extends GraphicalObject {
    private double x=0;

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(0,0,800,800);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle((this.x+70)%800,30,2);
        drawTool.drawFilledCircle((this.x+170)%800,60,2);
        drawTool.drawFilledCircle((this.x+20)%800,230,2);
        drawTool.drawFilledCircle((this.x+400)%800,130,2);
        drawTool.drawFilledCircle((this.x+230)%800,530,2);
        drawTool.drawFilledCircle((this.x+700)%800,630,2);
        drawTool.drawFilledCircle((this.x+700)%800,230,2);
    }

    public void update (double dt) {
        this.x = this.x + 20 * dt;
        //if (this.x > 800){
          //  this.x = 0;
        //}
    }
}
