/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Kirizu
 */
public class No_02 extends JDialog{
    public No_02(){
        Container content=getContentPane();
        content.setLayout(new FlowLayout());
        setBounds(10, 10, 400, 300);
        setTitle("Buttom Test");
        setResizable(false);
        JButton tombol1=new JButton("Yellow");
        JButton tombol2=new JButton("Blue");
        JButton tombol3=new JButton("Red");
        content.add(tombol1);
        content.add(tombol2);
        content.add(tombol3);
    }
}
