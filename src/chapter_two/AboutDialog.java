package chapter_two;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AboutDialog extends Dialog {
    public AboutDialog(Frame parent){
       super(parent, true);         
       setBackground(Color.gray);
       setLayout(new BorderLayout());
       Panel panel = new Panel();
       panel.add(new Button("Close"));
       add("South", panel);
       setSize(200,200);

       addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent windowEvent){
             dispose();
          }
       });
    }
}

