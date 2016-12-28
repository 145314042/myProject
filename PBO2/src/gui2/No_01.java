/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Kirizu
 */
public class No_01 extends JFrame{
    public No_01(){
        Container content=getContentPane();
        setBounds(10, 10, 400, 300);
        setTitle("Frame Pertama");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content.setBackground(Color.PINK);
        JMenuBar menubar=new JMenuBar();
        JMenu menufile=new JMenu("File");
        JMenu menuedit=new JMenu("Edit");
        JMenuItem item1=new JMenuItem("Tampil 1");
        JMenuItem item2=new JMenuItem("Tampil 2");
        menufile.add(item1);
        menufile.addSeparator();
        menufile.add(item2);
        menubar.add(menufile);
        menubar.add(menuedit);
        this.setJMenuBar(menubar);
    }
}
