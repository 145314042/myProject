package graphic;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.swing.*;

/**
 *
 * @author Lycorice
 */
public class ImagePanel extends JPanel {

    private BufferedImage logo;

    /**
     * Creates a new instance of ImagePanel
     */
    public ImagePanel() {
        try {
// buka file
            File img = new File("bld.jpg");
// baca image
            logo = ImageIO.read(img);
//img.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        g.drawImage(logo,
                0, 0, 400, 300,
                0, 0, logo.getWidth(null), logo.getHeight(null),
                null);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Using Java2D");
        frame.setLayout(new BorderLayout());
        ImagePanel gc = new ImagePanel();
        frame.add(gc, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 250);
        frame.setVisible(true);
    }
}
