/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kirizu
 */
public class dialog extends JDialog{

        Container contentPane;

    public dialog() {
        setSize(400, 200);
        setLocation(100, 100);
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(4, 3));

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(2, 1));

        contentPane.add(jp1);
        contentPane.add(jp2);

        JLabel label1 = new JLabel("NIP");
        jp1.add(label1);
        JLabel titik1 = new JLabel(":");
        jp1.add(titik1);
        JTextField text1 = new JTextField(5);
        jp1.add(text1);

        JLabel label2 = new JLabel("Nama");
        jp1.add(label2);
        JLabel titik2 = new JLabel(":");
        jp1.add(titik2);
        JTextField text2 = new JTextField(5);
        jp1.add(text2);

        JLabel label3 = new JLabel("GajiPokok");
        jp1.add(label3);
        JLabel titik3 = new JLabel(":");
        jp1.add(titik3);
        JTextField text3 = new JTextField(5);
        jp1.add(text3);

        JButton bSimpan = new JButton("SIMPAN");
        jp2.add(bSimpan);
    }

    public void addComp() {

    }
}
