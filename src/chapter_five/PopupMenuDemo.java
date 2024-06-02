package chapter_five;

import java.awt.event.*;
import javax.swing.*;

public class PopupMenuDemo extends JFrame {
    public PopupMenuDemo(){
        JPopupMenu jp=new JPopupMenu();
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem paste=new JMenuItem("Paste");
        
        jp.add(copy);
        jp.add(cut);
        jp.add(paste);

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me){
                if(me.isPopupTrigger()){
                    jp.show(me.getComponent(), me.getX(), me.getY());
                }
                
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PopupMenuDemo();
    }
}
