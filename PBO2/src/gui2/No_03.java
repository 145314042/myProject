/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author Kirizu
 */
public class No_03 extends JDialog{
    public No_03() throws IOException{
        Container content=getContentPane();
        content.setLayout(new FlowLayout());
        setTitle("Icon");
        setBounds(10, 10, 200, 200);
        setResizable(true);
        Image img=ImageIO.read(new File(
            "D:\\Wallpaper\\Gif\\00020478.gif"));
        Image imgrs=img.getScaledInstance(300, 300, 1);
        JLabel label1=new JLabel(new ImageIcon(imgrs));
        JLabel label2=new JLabel("Dragon Fire");
        content.add(label1);
        content.add(label2);
    }
}
