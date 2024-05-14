package chapter_three;

import java.awt.*;
import java.awt.event.*;

public class MouseEventHandlingDemo {

    private Frame f;
    private Label hl, ml, sl;
    private Panel p;
    private TextArea ta;

    public MouseEventHandlingDemo() {
        f = new Frame("Java MouseEvent Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(2, 1));

        hl = new Label("MouseListener", Label.CENTER);
        sl = new Label("Result", Label.CENTER);
        ml = new Label("Interact here to see event");
        sl.setSize(200,40);
        
        ta = new TextArea();
        p = new Panel();
        p.setLayout(new FlowLayout()); 
        p.setSize(350,350);

        ml.setAlignment(Label.CENTER);
        
       f.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sl.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")"+f.getSize().getHeight()+f.getSize().getWidth());
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            	sl.setText("Mouse Entered:");
            }
            public void mouseExited(MouseEvent e) {
            	sl.setText("Mouse exited");
            }
        }); 
       //p.add(sl);
       // p.add(ml);
        f.add(sl);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
        		f.dispose();
        	}

        });
    }

    public static void main(String[] args) {
        new MouseEventHandlingDemo();
    }
}


