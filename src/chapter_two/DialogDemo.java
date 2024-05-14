package chapter_two;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class DialogDemo implements ActionListener{
    public DialogDemo() {
        Frame f = new Frame();
        Dialog d = new Dialog(f, "Dialog Demo", true); 
        
        Panel p = new Panel(new GridLayout(3, 2));
        Panel p1 = new Panel(new FlowLayout());
        Label l1 = new Label("Name");
        Label l2 = new Label("Address");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        
        Button b1=new Button("Submit");
        Button b2=new Button("Cancel");
        
        Dialog d1 = new Dialog(f, "new Dialog");
        Panel p3 = new Panel(new FlowLayout());
        Label l3=new Label("Number");
        TextField t3 = new TextField(10);
        Button b3=new Button("Up");
        Button b4=new Button("Down");
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);

        p.add(b1);
        p.add(b2);
        p3.add(l3);
        p3.add(t3);
        p3.add(b3);
        p3.add(b4);
        Button click = new Button("Click here to see result");
        Button next = new Button("Next Window");
        p1.add(click);
        p1.add(next);
        f.add(p1);
        
        click.addActionListener(this);  
        next.addActionListener(this);

        d.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            	d.dispose();
            }
        });
        d1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            	d1.dispose();
            }
        });
        
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
        		f.dispose();
        	}
        });
    }

    public void actionPerformed(ActionEvent e) {
    		
    		if(e.getActionCommand()=="Click here to see result") {
//	            d.add(p);
//	            d.setSize(400, 300);
//	            d.setLocationRelativeTo(null);
//	            d.setVisible(true);
    			
    			JOptionPane.showInputDialog("click button is clicked");
    		}else {
          
//	            d1.add(p3);
//	            d1.setSize(400, 400);
//	            d1.setLocationRelativeTo(null);
//	            d1.setVisible(true);
    			
    			JOptionPane.showInputDialog("next button is clicked");
    		}
             
    }
    
    public static void main(String[] args) {
        new DialogDemo();
    }
}
