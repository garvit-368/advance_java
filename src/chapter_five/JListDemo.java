package chapter_five;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo {
    JList<String> jlist;
    JLabel city;
    JScrollPane jspane;
    public JListDemo() {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setLayout(new FlowLayout());
        String cities[] = {"New York", "Chicago", "Houston", "Paris", "LA", "kathmandu", "New Delhi"};
        jlist=new JList<>(cities);
       
        
        jlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        
        jspane=new JScrollPane(jlist);
       
        jspane.setPreferredSize(new Dimension(120,90));
        city=new JLabel("Choose a city");
        
        jlist.addListSelectionListener(new ListSelectionListener() {
    	public void valueChanged(ListSelectionEvent e) {
    		int minIndex = jlist.getMinSelectionIndex();
            int maxIndex = jlist.getMaxSelectionIndex();
                //int idx=jlist.getSelectedIndex();
                if(minIndex!=-1){
                    city.setText("Current Selection:"+cities[minIndex]+cities[maxIndex]);
                }else{
                    city.setText("Choose a city");
	                }
	            }
        });
        frame.add(jspane);
        frame.add(city);
        frame.setVisible(true);
	}
    public static void main(String[] args) {
        new JListDemo();
    }
}

