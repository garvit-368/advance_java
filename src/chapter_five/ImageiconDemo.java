package chapter_five;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageiconDemo{
     public ImageiconDemo(){
         
     }
      public static void main(String []args){
    	 //new ImageiconDemo();
    	  JFrame f=new JFrame("Swing Demo");
          f.setSize(400,400);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ImageIcon image1=new ImageIcon("E://APEXING-LOGO.png");
         JLabel l=new JLabel(image1);
         l.setText("APEXING");
        // l.setHorizontalTextPosition(JLabel.NORTH);
         //l.setIconTextGap(-10);
         f.add(l);
         f.setVisible(true);
      }

}
