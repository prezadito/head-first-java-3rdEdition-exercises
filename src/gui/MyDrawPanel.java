package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);

        Image image = new ImageIcon("src/catzilla.jpg").getImage();
        g.drawImage(image, 3, 4, this);

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);

        Graphics2D g2d = (Graphics2D) g;
        Color startColor = new Color(green, red, blue);
        Color endColor = new Color(blue, red, green);
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(270, 137, 100, 100);
    }
}
