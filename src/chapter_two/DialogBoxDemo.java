package chapter_two;

import java.awt.*;
import java.awt.event.*;

public class DialogBoxDemo{
    private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public DialogBoxDemo(){
	      mainFrame = new Frame("Java AWT Examples");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      
	      headerLabel = new Label();
	      headerLabel.setAlignment(Label.CENTER);
	      statusLabel = new Label();        
	      statusLabel.setAlignment(Label.CENTER);
	      statusLabel.setSize(350,100);

	      controlPanel = new Panel();
	      controlPanel.setLayout(new FlowLayout());
	      
	      headerLabel.setText("Control in action: Dialog"); 
	      Button showAboutDialogButton = new Button("Show About Dialog");
	      
	      showAboutDialogButton.addActionListener(new ActionListener() {
		      @Override
	          public void actionPerformed(ActionEvent e) {
	                AboutDialog aboutDialog = new AboutDialog(mainFrame);
	                aboutDialog.setVisible(true);
	            }
           });
	      
	      controlPanel.add(showAboutDialogButton);
	      
	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	    	  public void windowClosing(WindowEvent e) {
	    		  mainFrame.dispose();
	    	  }
	      });
	}

     public static void main(String[] args){
    	 DialogBoxDemo  dialogControlDemo = new DialogBoxDemo();
     }
}

