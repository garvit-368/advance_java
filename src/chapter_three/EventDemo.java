package chapter_three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame implements ActionListener{
	    private JButton button;
	    private JTextField textField;
	    private JList<String> list;
	    private DefaultListModel<String> listModel;

	    public EventDemo() {
	        setTitle("Event Handling Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Create button
	        button = new JButton("Click Me!");
	        button.addActionListener(this); // Add ActionListener

	        // Create text field
	        textField = new JTextField(20);
	        textField.addKeyListener(new KeyAdapter() {
//	        	 public void keyPressed(KeyEvent e) {
//	     	        System.out.println("Key pressed: " + e.getKeyChar());
//	     	    }
	        	public void keyReleased(KeyEvent e) {
	        		
	        		button.setEnabled(false);
	        		
	        	}
	        }); // Add KeyListener

	        // Create list
	        listModel = new DefaultListModel<>();
	        listModel.addElement("Item 1");
	        listModel.addElement("Item 2");
	        listModel.addElement("Item 3");
	        list = new JList<>(listModel);
	       // list.addMouseListener(this); // Add MouseListener

	        // Add components to the content pane
	        Container container = getContentPane();
	        container.setLayout(new FlowLayout());
	        container.add(button);
	        container.add(textField);
	        container.add(new JScrollPane(list));

	        setVisible(true);
	    }

	    // ActionListener method
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == button) {
	            JOptionPane.showMessageDialog(this, "Button clicked!");
	        }
	    }

	    // KeyListener methods
	   

	  

//	    // MouseListener methods
//	    public void mouseClicked(MouseEvent e) {
//	        if (e.getSource() == list) {
//	            JOptionPane.showMessageDialog(this, "Item selected: " + list.getSelectedValue());
//	        }
//	    }

//	    public void mouseEntered(MouseEvent e) {
//	        // Not needed, but must be implemented due to MouseListener interface
//	    }
//
//	    public void mouseExited(MouseEvent e) {
//	        // Not needed, but must be implemented due to MouseListener interface
//	    }
//
//	    public void mousePressed(MouseEvent e) {
//	        // Not needed, but must be implemented due to MouseListener interface
//	    }
//
//	    public void mouseReleased(MouseEvent e) {
//	        // Not needed, but must be implemented due to MouseListener interface
//	    }

	    public static void main(String[] args) {
	    	new EventDemo();
	        //SwingUtilities.invokeLater(() -> new EventDemo());
	    }
	}


