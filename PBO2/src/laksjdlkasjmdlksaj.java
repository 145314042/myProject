import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author Lycorice
 */
public class laksjdlkasjmdlksaj extends JFrame {
    Container content=getContentPane();
    JPanel[] panel=new JPanel[3];
    JButton[] button = new JButton[10];
    public laksjdlkasjmdlksaj(){
        setTitle("ComboBoxDemo");
        setBounds(450, 290, 300, 170);
        content.setLayout(new BorderLayout());
        panel[0] = new JPanel(new BorderLayout());
        panel[1] = new JPanel(new FlowLayout());
        panel[2] = new JPanel(new GridLayout(2, 2));
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("123");
        }
        panel[1].add(button[7]);
        panel[1].add(button[8]);
        panel[2].add(button[3]);
        panel[2].add(button[4]);
        panel[2].add(button[5]);
        panel[2].add(button[6]);
        panel[0].add(button[0],BorderLayout.NORTH);
        panel[0].add(button[1],BorderLayout.SOUTH);
        panel[0].add(panel[1],BorderLayout.WEST);
        panel[0].add(panel[2],BorderLayout.CENTER);
        panel[0].add(button[9],BorderLayout.EAST);
        
        
        content.add(panel[0]);
    }
    public static void main(String[] args) {
        laksjdlkasjmdlksaj main = new laksjdlkasjmdlksaj();
        main.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        main.setVisible(true);
    }
}
