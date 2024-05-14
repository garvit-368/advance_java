package chapter_two;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends Frame implements ActionListener{
	CardLayout card;  
	Button b1,b2,b3;  
    CardLayoutDemo(){     
        card=new CardLayout(20,30);  
//create CardLayout object with 40 hor space and 30 ver space  
        setLayout(card);  
        b1=new Button("Apple");  
        b2=new Button("Boy");  
        b3=new Button("Cat");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        
        Panel p=new Panel();
        p.setBackground(Color.green);
        Panel p1=new Panel();
        p1.setBackground(Color.blue);
        Panel p2=new Panel();
        p2.setBackground(Color.red);
        
        p.add(b1);
        p1.add(b2);
        p2.add(b3);  
        
        add(p);
        add(p1);
        add(p2);
        setSize(400, 400);
        setVisible(true);
      }  

    public void actionPerformed(ActionEvent e) {  
    	card.next(this);
    }  
  
    public static void main(String[] args) {  
        CardLayoutDemo cl=new CardLayoutDemo();  
        
    }
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}  
} 

    
    
