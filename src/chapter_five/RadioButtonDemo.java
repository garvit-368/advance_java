package chapter_five;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo implements ActionListener {
    private JLabel l1;
    public RadioButtonDemo(){
        JFrame frame = new JFrame("JRadioButton Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        JRadioButton jr1=new JRadioButton("Nepalese");
        JRadioButton jr2=new JRadioButton("Indian");

        l1=new JLabel();
        ButtonGroup bg=new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        jr1.addActionListener(this);
        jr2.addActionListener(this);
        frame.add(jr1);
        frame.add(jr2);
        frame.add(l1);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
        public void actionPerformed(ActionEvent ae){
            l1.setText("You selected "+ae.getActionCommand());
        }
        public static void main(String[] args) {
            new RadioButtonDemo();
        }
    }

