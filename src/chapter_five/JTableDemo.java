package chapter_five;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTableDemo extends JFrame{

    public JTableDemo() {
        String[] colhead = {"Name", "Address", "Phone number"};
        Object[][] data = {{"Ram", "kathmandu", "9841111111"},
        {"Shyam", "Lalitpur", "9841222222"},
        {"Hari", "Pokhara", "984133333"},
        {"Joshna", "Biratnagar", "9841444444"},
        {"Nikhil", "Birgunj", "9841555555"},
        {"Narayan", "Bhairawa", "9841666666"},
        {"Pratik", "Nepalgunj", "9841777777"},
        {"Shanti", "Dhangadi", "9841888888"},
        {"Bishal", "Chitwan", "9841999999"},
        {"MAdhav", "Argakhanchi", "9841234567"}};
        
        
        JTable table=new JTable(data,colhead);
        JScrollPane jsp=new JScrollPane(table);
        add(jsp);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
         
    }
    public static void main(String[] args) {
        new JTableDemo();
    }
}


