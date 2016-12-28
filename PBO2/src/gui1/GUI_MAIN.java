/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kirizu
 */
public class GUI_MAIN {
    public static void main(String[] args) {
        GUI_MENU Menu=new GUI_MENU();
        Menu.setVisible(true);
        
        Container content=Menu.getContentPane();
        content.setLayout(new FlowLayout());
        JLabel label1=new JLabel("zzz");
        Menu.add(label1);
        
        JButton tombol1=new JButton("Push Here");
        content.add(tombol1);
        tombol1.setSize(40, 40);
        Menu.add(tombol1);
    }
}
