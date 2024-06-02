package chapter_five;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ToggleButtonDemo {
    public ToggleButtonDemo(){
        JFrame frame = new JFrame("JToggleButton Demo");
        frame.setSize(200, 200);
        
        frame.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Button is off");
        JToggleButton jtbtn=new JToggleButton("on/off");
         jtbtn.addItemListener(new ItemListener() {
        	 @Override
             public void itemStateChanged(ItemEvent e) {
                 if(jtbtn.isSelected()){
                     l1.setText("button is on");
                 }else{
                     l1.setText("button is off");
                 }
             }
         });
         frame.add(jtbtn);
         frame.add(l1);
         frame.setVisible(true);
     }
     public static void main(String[] args) {
         new ToggleButtonDemo();
     }
 }


