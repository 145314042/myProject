/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Lycorice
 */
public class No_06 extends JFrame implements ActionListener {
    JMenuBar menubar = new JMenuBar();
    JMenu menutampil = new JMenu("Tampil");
    JMenuItem[] menutampilitem = new JMenuItem[6];
    public No_06() {
        Container content = new Container();
        setTitle("Frame Pertama");
        setBounds(410, 150, 600, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        for (int i = 0; i < menutampilitem.length - 1; i++) {
            menutampilitem[i] = new JMenuItem("Tampil " + (i + 1));
            menutampil.add(menutampilitem[i]);
        }
        menutampil.addSeparator();
        menutampilitem[5] = new JMenuItem("Exit");
        menutampil.add(menutampilitem[5]);
        for (int i = 0; i < menutampilitem.length; i++) {
            menutampilitem[i].addActionListener(this);
        }
        menubar.add(menutampil);
        this.setJMenuBar(menubar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String a = e.getActionCommand();
        switch (a) {
            case "Tampil 1": {
                this.getContentPane().removeAll();
                Inter_No_01 internal1 = new Inter_No_01();
                internal1.setVisible(true);
                this.getContentPane().add(internal1);
                internal1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                break;
            }
            case "Tampil 2": {
                this.getContentPane().removeAll();
                Inter_No_02 internal1 = new Inter_No_02();
                internal1.setVisible(true);
                this.getContentPane().add(internal1);
                internal1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                break;
            }
            case "Tampil 3": {
                this.getContentPane().removeAll();
                Inter_No_03 internal1 = new Inter_No_03();
                internal1.setVisible(true);
                this.getContentPane().add(internal1);
                internal1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                break;
            }
            case "Tampil 4": {
                try {
                    this.getContentPane().removeAll();
                    Inter_No_04 internal1 = new Inter_No_04();
                    internal1.setVisible(true);
                    this.getContentPane().add(internal1);
                    internal1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    break;
                } catch (IOException ex) {
                    Logger.getLogger(No_06.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case "Tampil 5": {
                try {
                    this.getContentPane().removeAll();
                    Inter_No_05 internal1 = new Inter_No_05();
                    internal1.setVisible(true);
                    this.getContentPane().add(internal1);
                    internal1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    break;
                } catch (IOException ex) {
                    Logger.getLogger(No_06.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case "Exit":
                System.exit(0);
        }
    }
}
