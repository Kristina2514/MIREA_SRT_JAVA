package lab05;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ShapesRand extends JPanel {
    private List<Shape> shapes;
    private Random random;

    public ShapesRand() {
        shapes = new ArrayList<>();
        random = new Random();
        generateRandShapes(20);
    }

    private void generateRandShapes(int count) {
        for (int i = 0; i < count; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(700);
            int y = random.nextInt(500);
            int ShapeType = random.nextInt(3);

            switch (ShapeType) {
                case 0:
                    int r = 20 + random.nextInt(50);
                    shapes.add(new Circle(color, x, y, r));
                    break;
                case 1:
                    int width = 30 + random.nextInt(100);
                    int height = 30 + random.nextInt(100);
                    shapes.add(new Rect(color, x, y, width, height));
                    break;
                case 2:
                    int size = 30 + random.nextInt(80);
                    shapes.add(new Triangle(color, x, y, size));
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}