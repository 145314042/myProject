/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan03;

import javax.swing.*;
import javax.swing.tree.*;

/**
 *
 * @author Lycorice
 */
public class TreeComponent {

    public static void main(String[] args) {
        //membuat obyek frame
        JFrame frame = new JFrame("Creating a JTree Component!");
        //membuat tree node
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode("Color"/*userObject*/, true/*child*/);
        //membuat anak pada tree
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode nBlue = new DefaultMutableTreeNode("Navy Blue");
        DefaultMutableTreeNode dBlue = new DefaultMutableTreeNode("Dark Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode white = new DefaultMutableTreeNode("White");
        //menambahkan anak kepada root tree
        parent.add(black);
        parent.add(blue);
        blue.add(nBlue);
        blue.add(dBlue);
        parent.add(green);
        parent.add(white);
        //membuat obyek JTree dengan parameter parent
        JTree tree = new JTree(parent);
        //menambahkan objek tree ke frame
        frame.add(tree);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //menghilangkan jendela frame
        frame.setUndecorated(true);
        //menambah close buton pada window
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
