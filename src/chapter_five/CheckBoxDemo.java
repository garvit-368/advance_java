package chapter_five;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxDemo implements ItemListener {

   JCheckBox c1, c2, c3, c4, c5;
   JLabel status;

   public CheckBoxDemo() {
       JFrame frame = new JFrame("Checkbox Demo");
       frame.setLayout(new GridLayout(2,1));
       frame.setSize(600, 400);
       JPanel p=new JPanel(new FlowLayout());
       JPanel p1=new JPanel(new FlowLayout());
       c1 = new JCheckBox("singing");
       c2 = new JCheckBox("dancing");
       c3 = new JCheckBox("football");
       c4 = new JCheckBox("basketball");
       c5 = new JCheckBox("cricket");

       JLabel hobbies = new JLabel("Hobbies");
       status = new JLabel("lists:");
       c1.addItemListener(this);
       c2.addItemListener(this);
       c3.addItemListener(this);
       c4.addItemListener(this);
       c5.addItemListener(this);
       p.add(hobbies);
       p.add(c1);
       p.add(c2);
       p.add(c3);
       p.add(c4);
       p.add(c5);
       p1.add(status);
       
       frame.add(p);
       frame.add(p1);
       //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
       public void itemStateChanged(ItemEvent ie) {
           String sing="", dancing="", football="", basketball="", cricket="";
           if (c1.isSelected()) {
               sing = c1.getText();
           } 

           if (c2.isSelected()) {
               dancing = c2.getText();
           }
           if (c3.isSelected()) {
               football = c3.getText();
           }
           if (c4.isSelected()) {
               basketball = c4.getText();
           } 
           if (c5.isSelected()) {
               cricket = c5.getText();
           }
           status.setText("Your Hobbies : "+sing+"  "+dancing+"  "+football+"  "+basketball+"  "+cricket);
       }
   public static void main(String[] args) {
           new CheckBoxDemo();
       }
   }

