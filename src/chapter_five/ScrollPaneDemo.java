package chapter_five;

import java.awt.*;
import javax.swing.*;

public class ScrollPaneDemo {
    public ScrollPaneDemo() {
        JFrame frame = new JFrame("");
        // frame.setLayout(new GridLayout(2, 1));
	    frame.setSize(400,400);
	    JPanel p = new JPanel(new GridLayout(5,25));
	    int b=0;
	    for(int i=0;i<5;i++){
           for(int j=0;j<25;j++){
               p.add(new JButton("Button"+b));
               ++b;
           }
	    }
	    JScrollPane jsp=new JScrollPane(p);
	    frame.add(jsp);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
    }
   public static void main(String[] args) {
       new ScrollPaneDemo();
   }
 }

