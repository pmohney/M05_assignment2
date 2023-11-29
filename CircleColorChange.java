// 11/27/23
// Pierce Mohney
// SDEV 200
// M05 assignment 2
// This program will make a circle entity that is defautly set to the color of white. 
// When the left click on the mouse is pressed the circle, the color of the cirlce is changed to black. 
// Then when the left click on the mouse is released it will turn back to white. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleColorChange extends JFrame {

    private Color circleColor;

    public CircleColorChange() {
        circleColor = Color.WHITE;

        setTitle("Color Changer");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        CirclePanel circlePanel = new CirclePanel();
        add(circlePanel);
// Creates a frame that adds a circle with an initial color of white

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                circleColor = Color.BLACK;
                circlePanel.repaint();
            }
//Changes circle to black when left click is pressed

            @Override
            public void mouseReleased(MouseEvent e) {
                circleColor = Color.WHITE;
                circlePanel.repaint();
            }
  //Changes circle back to white when left click is released 
        });
    }

    private class CirclePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the circle color
            g.setColor(circleColor);

            // Draw a filled circle in the center of the panel
            int diameter = Math.min(getWidth(), getHeight()) - 20;
            int x = (getWidth() - diameter) / 2;
            int y = (getHeight() - diameter) / 2;
            g.fillOval(x, y, diameter, diameter);
  //Creates a circle for the panel 
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CircleColorChange().setVisible(true);
        });
    }
}
