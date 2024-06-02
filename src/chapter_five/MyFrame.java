package chapter_five;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame implements ActionListener{
	JButton btn;
	JButton btnAdd;
	
	public MyFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("My Application");
		
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,16);
		
		btn  = new JButton("Submit");
		//btn.setSize(250,30);
		btn.setBounds(80,80,120,30);//x,y,w,h
		btn.setFont(font);
		
		btn.addActionListener(this);
		
		btnAdd  = new JButton("Add");
		//btnAdd.setSize(250,30);
		btnAdd.setBounds(240,80,120,30);
		btnAdd.setFont(font);
		
		btnAdd.addActionListener(this);
		
		frame.add(btn);
		frame.add(btnAdd);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame my = new MyFrame();
		
		

	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="Submit")
			btn.setText("Submitted");
		else if(e.getActionCommand()=="Submitted")
			btn.setText("Submit");
		else if(e.getSource()==btnAdd)
			btnAdd.setText("Added");
	}

}
