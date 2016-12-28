/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui4;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
public class No_03 extends JFrame {
    JLabel lblumurinput = new JLabel("Masukkan Umur :");
    JLabel lblumuroutput = new JLabel("Umur anda adalah : ");
    JButton buttonok = new JButton("OK");
    JButton buttoncancle = new JButton("CANCEL");
    JTextField fieldinput = new JTextField();
    public No_03() {
        Container content = getContentPane();
        setTitle("Age");
        setSize(300, 120);
        setLocation(460, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content.setLayout(new GridLayout(3, 2));
        buttoncancle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = Integer.parseInt(fieldinput.getText());
                    setAge(age);
                    lblumuroutput.setText("Umur anda adalah : " + fieldinput.getText());
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "'" + fieldinput.getText() + "' is invaild.\nPlease enter digit only!");
                    fieldinput.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    fieldinput.setText("");
                }
                JOptionPane.showMessageDialog(null, "Terima kasih anda telah menggunakan program ini.");
            }
            private void setAge(int age) throws Exception {
                if (age > 0) lblumuroutput.setText(String.valueOf(age));
                else throw new Exception("Input must be greater than 0");
            }
        });
        content.add(lblumurinput);
        content.add(fieldinput);
        content.add(buttonok);
        content.add(buttoncancle);
        content.add(lblumuroutput);
    }
}
