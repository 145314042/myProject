/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Kirizu
 */
public class GUI_MENU extends JFrame{
    public GUI_MENU() {
        Container content;
        setTitle("UKM");
        setSize(600, 400);
        setResizable(false);
        setLocation(10, 10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        content = getContentPane();
        content.setBackground(Color.WHITE);
        
        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu =new JMenu("File");
        JMenuItem fileMenuExit=new JMenuItem("Exit");
        fileMenu.add(fileMenuExit);
        menuBar.add(fileMenu);
//        String keluar = fileMenuExit.setActionCommand();
//        if ("exit".equals(keluar))System.exit(0);
        this.setJMenuBar(menuBar);
        
        
        
        
    }
}
