package chapter_five;

import java.awt.event.*;
import javax.swing.*;
public class MenuDemo extends JFrame {
    JMenuBar mb;
    JMenu file, edit, view;
    JMenuItem makenew, open, save, saveas, exit;
    JSeparator js;
    JCheckBoxMenuItem cr1, cr2;
    JRadioButtonMenuItem jr1, jr2;

    public MenuDemo() {
        mb = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic('F');
        
        edit = new JMenu("Edit");
        view = new JMenu("View");
        makenew = new JMenuItem("New", 'N');
        KeyStroke ctrlNKeyStroke = KeyStroke.getKeyStroke("control N");
        makenew.setAccelerator(ctrlNKeyStroke);

        open = new JMenuItem("Open",'O');
        save = new JMenuItem("Save");
        saveas = new JMenuItem("SaveAs");
        exit = new JMenuItem("Exit");
        js = new JSeparator();
        cr1 = new JCheckBoxMenuItem("Copy");
        cr2 = new JCheckBoxMenuItem("Cut");
        jr1 = new JRadioButtonMenuItem("View Full Screen");
        jr2 = new JRadioButtonMenuItem("View Half Screen");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);

        file.add(makenew);
        file.add(open);
        file.add(save);
        file.add(saveas);
        file.add(js);
        file.add(exit);

        edit.add(cr1);
        edit.add(cr2);

        view.add(jr1);
        view.add(jr2);

        mb.add(file);
        mb.add(edit);
        mb.add(view);
        setJMenuBar(mb);
        makenew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }});
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
    public static void main(String[] args) {
        try {         
        	UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception e) {
        }
        new MenuDemo();
    }

}



