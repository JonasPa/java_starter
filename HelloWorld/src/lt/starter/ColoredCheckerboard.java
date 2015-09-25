package lt.starter;
import java.awt.*;
import java.applet.*;
    
    public class ColoredCheckerboard extends Applet {
             public void paint(Graphics g) {
          
          int row, col, x, y;
          for ( row = 0;  row < 8;  row++ ) {
          
             for ( col = 0;  col < 8;  col++) {
                x = col * 20;
                y = row * 20;
                if ( (row % 2) == (col % 2) )
                   g.setColor(Color.red);
                else
                   g.setColor(Color.black);

             } 
          }
       }
    }
