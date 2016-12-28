package lainLain;
import java.awt.*;
import javax.swing.*;

public class Gui extends JDialog{
    public Gui() {
        Container content=getContentPane();
        
        content.setLayout(new BorderLayout());
        String[] comboBoxItem = {"Universitas Sanata Dharma", "Universitas Negri Yogyakarta", "Universitas Gajah Mada",
            "Universitas Atma Jaya Yogyakarta", "Universitas Teknologi Yogyakarta"};
        
        setTitle("Arti Logo Universitas");
        setBounds(500, 200, 700, 350);
        JComboBox comboBox;
        
        String text = "Arti dari logo Universitas Sanata Dharma:\n"
            + "\n" +
            "1. Bingkai adalah teratai bersudut lima.\n    Teratai = kemuliaan. Sudut lima = Pancasila.\n"
            + "\n" +
            "2. Obor melambangkan hidup dengan semangat yang menyala-nyala.\n"
            + "\n3. Buku terbuka melambangkan ilmu pengetahuan yang selalu berkembang.\n"
            + "\n4. Teratai warna coklat melambangkan sikap dewasa yang matang.\n"
            + "\n5. \"Ad Maiorem Dei Gloriam\"\n     berarti kemuliaan Allah yang lebih besar.";
        JTextArea textArea = new JTextArea(text, 5, 10);
        textArea.setPreferredSize(new Dimension(400, 250));
        
        JLabel jlb2=new JLabel (new ImageIcon("D:\\LOGO SADAR.png"));
        JLabel jlb3=new JLabel ("Universitas Sanata Dharma");
        
        comboBox = new JComboBox(comboBoxItem);
        
        content.add((comboBox), BorderLayout.NORTH);
        content.add((jlb2), BorderLayout.WEST);
        content.add((textArea), BorderLayout.CENTER);
        content.add((jlb3), BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        Gui a=new Gui();
        a.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        a.setVisible(true);
    }
}
