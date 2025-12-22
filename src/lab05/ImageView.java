package lab05;

import javax.swing.*;
import java.io.File;

public class ImageView {
    public static void main(String[] args) {
        if (args.length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Укажите путь к картинке в аргументах командной строки!\n",
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String imagePath = args[0];

        File file = new File(imagePath);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null,
                    "Файл не найден: " + imagePath,
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JFrame frame = new JFrame("Просмотр картинки: " + file.getName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        ImagePanel imagePanel = new ImagePanel(imagePath);
        frame.add(new JScrollPane(imagePanel));
        frame.setVisible(true);
    }
}