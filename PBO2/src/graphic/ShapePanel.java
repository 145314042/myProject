package graphic;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author Lycorice
 */
public class ShapePanel extends JPanel {

    public ShapePanel() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(0, 10, 50, 60);
        g.setColor(Color.red);
        g.drawRect(50, 10, 50, 50);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(100, 10, 50, 50);
        g.setColor(new Color(0, 255, 0));
        g.fillArc(150, 10, 50, 50, 0, 180);
        Graphics2D g2 = (Graphics2D) g;
// fill RoundRectangle2D.Double
        GradientPaint redtowhite = new GradientPaint(200, 10, Color.red, 250, 10, Color.black);
        g2.setPaint(redtowhite);
        g2.fill(new RoundRectangle2D.Double(200, 10, 50, 50, 10, 10));
//g2.setPaint();
        g2.drawString("Filled RoundRectangle2D", 200, 80);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Grafik 2 Dimensi");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new BorderLayout());
        ShapePanel shapePanel = new ShapePanel();
        frame.add(shapePanel, BorderLayout.CENTER);
        frame.setSize(450, 250);
        frame.setVisible(true);
    }
}
