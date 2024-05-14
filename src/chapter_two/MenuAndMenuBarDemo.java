package chapter_two;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuAndMenuBarDemo {
	public MenuAndMenuBarDemo() {
        Frame f = new Frame("DashBoard");
        f.setSize(400, 400);
        MenuBar menubar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);
        f.setMenuBar(menubar);
        MenuItem newfile = new MenuItem("New");
      
        MenuItem openfile = new MenuItem("Open");
        MenuItem newsave = new MenuItem("Save");
        MenuItem newsaveas = new MenuItem("SaveAs");
        MenuItem newexit = new MenuItem("Exit");
        CheckboxMenuItem c1 = new CheckboxMenuItem("Check 1", true);
        CheckboxMenuItem c2 = new CheckboxMenuItem("Check 2");
        
        //newfile.add(openfile);
        fileMenu.add(newfile);
        fileMenu.add(openfile);
        fileMenu.add(newsave);
        fileMenu.add(newsaveas);
        fileMenu.add(newexit);
        fileMenu.add(c1);
        fileMenu.add(c2);
        

        newsaveas.setEnabled(false);

        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
                f.dispose(); // Closing the frame
            }
        	
		});

    }

    public static void main(String[] args) {
        new MenuAndMenuBarDemo();
    }
}
