package chapter_five;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class TabbedPaneDemo {
    public TabbedPaneDemo() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        
        JPanel colorPanel = new JPanel();      
        JButton colorBtn = new JButton("adding colors");
        colorBtn.setSize(120,30);
        colorPanel.add(colorBtn);
        
        
        JPanel designPanel = new JPanel();   
        
        String[] arg = {"monochromatic","complementry","supplementry","analogous"};
        
        JComboBox jcb = new JComboBox(arg);
//        jcb.addItem("monochromatic");
//        jcb.addItem("complementry");
//        jcb.addItem(",");
//        jcb.addItem("primary");
        
        jcb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(null, "would you allow bibek to sit in class");     
				
			}
        	
        });
        
        jcb.setSelectedIndex(1);
       // jcb.setEnabled(false);
        
        JButton designBtn = new JButton("adding Design");
        designBtn.setSize(120,30);
        designPanel.add(designBtn);
        designPanel.add(jcb);
        
        JTabbedPane tbp = new JTabbedPane();
        tbp.addTab("colors",colorPanel);// first tab 
        tbp.addTab("design",designPanel);// second tab

        
        frame.add(tbp);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}

