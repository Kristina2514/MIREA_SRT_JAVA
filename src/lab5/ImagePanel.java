package lab5;

import javax.swing.*;
import java.awt.*;

// Класс для отображения картинки
class ImagePanel extends JPanel {
    private Image image;

    public ImagePanel(String imagePath) {
        // Загружаем картинку
        ImageIcon imageIcon = new ImageIcon(imagePath);
        this.image = imageIcon.getImage();

        // Проверяем, загрузилась ли картинка
        if (image.getWidth(null) == -1) {
            JOptionPane.showMessageDialog(this, "Не удалось загрузить изображение: " + imagePath,
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Если картинка загружена, рисуем ее
        if (image != null && image.getWidth(null) != -1) {
            // Рисуем картинку с масштабированием под размер панели
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

}