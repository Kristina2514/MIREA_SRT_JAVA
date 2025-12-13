package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanMadridGrafic {
    public static int mad = 0;
    public static int mil = 0;
    public static String lastScorer;

    public static int ballX = 250;
    public static int ballY = 150;
    public static int targetX = ballX;
    public static int targetY = ballY;
    public static Timer animationTimer;

    public static JFrame frame = new JFrame("Футбольный матч");
    public static JButton milanB = new JButton("AC Milan");
    public static JButton madridB = new JButton("Real Madrid");
    public static JLabel resultL = new JLabel("Result: " + mil + " X " + mad);
    public static JLabel lastScorerL = new JLabel("Last Scorer: N/A");
    public static JLabel winnerL = new JLabel("Winner: DRAW");
    public static BallPanel ballPanel = new BallPanel();

    public static class BallPanel extends JPanel {
        public BallPanel() {
            setPreferredSize(new Dimension(500, 200));
            setBackground(new Color(0, 150, 0));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.WHITE);
            g.drawLine(250, 0, 250, 200);
            g.drawRect(20, 70, 20, 60);
            g.drawString("MILAN", 15, 50);
            g.drawRect(460, 70, 20, 60);
            g.drawString("MADRID", 450, 50);
            g.setColor(Color.WHITE);
            g.fillOval(ballX - 10, ballY - 10, 20, 20);
            g.setColor(Color.BLACK);
            g.drawOval(ballX - 10, ballY - 10, 20, 20);
            g.drawLine(ballX - 5, ballY, ballX + 5, ballY);
            g.drawLine(ballX, ballY - 5, ballX, ballY + 5);
        }
    }

    public static void update() {
        resultL.setText("Result: " + mil + " X " + mad);
        lastScorerL.setText("Last Scorer: " + lastScorer);

        if (mad > mil) {
            winnerL.setText("Winner: Real Madrid");
        } else if (mil > mad) {
            winnerL.setText("Winner: AC Milan");
        } else {
            winnerL.setText("Winner: DRAW");
        }

        ballPanel.repaint();
    }

    public static void animateBall(int destinationX, int destinationY) {
        if (animationTimer != null && animationTimer.isRunning()) {
            animationTimer.stop();
        }

        targetX = destinationX;
        targetY = destinationY;

        animationTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballX += (targetX - ballX) / 5;
                ballY += (targetY - ballY) / 5;

                ballPanel.repaint();

                if (Math.abs(ballX - targetX) < 2 && Math.abs(ballY - targetY) < 2) {
                    ballX = targetX;
                    ballY = targetY;
                    ((Timer)e.getSource()).stop();
                }
            }
        });

        animationTimer.start();
    }

    public static void main(String[] args) {
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        topPanel.add(milanB);
        topPanel.add(madridB);
        topPanel.add(resultL);
        topPanel.add(lastScorerL);
        topPanel.add(winnerL);
        topPanel.add(new JLabel());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(ballPanel, BorderLayout.CENTER);

        milanB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                lastScorer = "AC Milan";
                animateBall(470, 100);
                update();
            }
        });

        madridB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mad++;
                lastScorer = "Real Madrid";
                animateBall(30, 100);
                update();
            }
        });

        frame.setVisible(true);
    }
}
