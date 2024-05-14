package chapter_two;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogDemo {

    public FileDialogDemo() {
        Frame f = new Frame("File Dialog Demo");
        
        f.setSize(100, 100);
        f.addWindowListener(new WindowAdapter() {
    	public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
        });
        
        Button btn = new Button("Open");
       // btn.setSize(180,40);
        btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog fd = new FileDialog(f, "File Dialog");
				fd.setDirectory("E:\\Teaching");
		        fd.setVisible(true);
			}
        });
        f.add(btn);
        btn.setBounds(30,30,180,40);
        f.setLayout(null);
        f.setVisible(true);
        
	}
    public static void main(String[] args) {
        new FileDialogDemo();
    }
}

