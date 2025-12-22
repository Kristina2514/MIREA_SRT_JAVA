package lab05;

import javax.swing.*;

public class ShapesWindow {
    public static void  main(String[]  args) {
        JFrame frame = new JFrame("Случайные фигуры:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        // Добавляем панель с фигурами
        ShapesRand shapesPanel = new ShapesRand();
        frame.add(shapesPanel);
        // Делаем окно видимым
        frame.setVisible(true);
    }
}
