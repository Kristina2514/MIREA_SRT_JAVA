package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Anim extends JPanel implements ActionListener {
    private Image photo;
    private int frw = 92;
    private int frh = 129;
    private int totalframes = 8;
    private int currentframe = 0;
    private int x = 150;
    private int y = 100;
    private Timer timer;

    public Anim() {
        createSpriteSheet();
        timer = new Timer(100, this);
        timer.start();
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.WHITE);
    }

    private void createSpriteSheet() {
        BufferedImage spriteSheet = new BufferedImage(736, 129, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = spriteSheet.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 736, 129);

        for (int frame = 0; frame < 8; frame++) {
            g2d.setColor(Color.WHITE);
            g2d.fillRect(frame * 92, 0, 92, 129);
            g2d.setColor(new Color(25, 100, 150));
            int ballSize = 40;
            int ballX = frame * 92 + 46 - ballSize / 2;
            int ballY = 30 + (int)(Math.sin(frame * Math.PI / 4) * 30);

            g2d.fillOval(ballX, ballY, ballSize, ballSize);

            g2d.setColor(Color.BLACK);
            g2d.drawString("" + (frame + 1), frame * 92 + 40, 120);
        }

        g2d.dispose();
        photo = spriteSheet;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (photo != null) {
            int scrx = currentframe * frw;
            int scry = 0;

            g.drawImage(photo, x, y,x+frw,y+frh, scrx, scry,scrx+frw,scry+frh,this);
        }else {
            g.setColor(Color.BLUE);
            g.fillRect(x, y, frw, frh);
            g.setColor(Color.BLACK);
            g.drawString("Frame: " + currentframe, x, y - 10);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentframe++;
        if (currentframe >= totalframes) {
            currentframe = 0;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Anim());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}