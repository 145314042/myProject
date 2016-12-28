/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Kirizu
 */
public class No_04 extends JDialog {
    public No_04() {
        Container content = getContentPane();
        setTitle("CheckBoxDemo");
        setBounds(10, 10, 400, 150);
        content.setLayout(new BorderLayout());
        //kiri
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(1));
        panel1.setBackground(Color.WHITE);
        JTextArea textarea1 = new JTextArea("\n\nWelcome to Java");
        textarea1.setEditable(false);
        panel1.add(textarea1);
        content.add(panel1, BorderLayout.CENTER);
        //kanan
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1));
        
        JCheckBox check1 = new JCheckBox("Centered");
        JCheckBox check2 = new JCheckBox("Bold");
        JCheckBox check3 = new JCheckBox("Italic");
        panel2.add(check1);
        panel2.add(check2);
        panel2.add(check3);
        panel2.setBorder(BorderFactory.createBevelBorder(1));
        content.add(panel2, BorderLayout.EAST);
        //bawah
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        JButton tombol1 = new JButton("Left");
        JButton tombol2 = new JButton("Right");
        panel3.add(tombol1);
        panel3.add(tombol2);
        content.add(panel3, BorderLayout.SOUTH);
    }
}
