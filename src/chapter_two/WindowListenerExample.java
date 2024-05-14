package chapter_two;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Dynamic Controls Example");
        Button addButton = new Button("Add Button"); // Button to add a new button dynamically
        Panel panel = new Panel(); // Panel to hold dynamically added buttons

        panel.add(addButton); // Add the add button to the top of the frame
        frame.add(panel);
        //frame.add(addButton); // Add the panel to hold dynamically added buttons
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Closing the frame
            }
        });
    }
}
