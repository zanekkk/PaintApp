package kenazCode;

import java.awt.*;

public class Pencil extends DrawingTool{
    @Override
    public void draw(int firstX, int firstY, int secondX, int secondY, Graphics g) {
        if(isEnabled){
            g.setColor(color);
            g.drawLine(firstX, firstY, secondX, secondY);
        }
    }
}
