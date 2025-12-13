package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Countries {
    private JFrame frame;
    private JComboBox<String> countriesBox;
    private JTextArea info;

    private String[] countries = {"Australia", "China", "England", "Russia"};
    private String[] inform = {
            "Столица: Канберра\nНаселение: 25 млн\nЯзык: английский",
            "Столица: Пекин\nНаселение: 1.4 млрд\nЯзык: китайский",
            "Столица: Лондон\nНаселение: 56 млн\nЯзык: английский",
            "Столица: Москва\nНаселение: 146 млн\nЯзык: русский"
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Countries().createGUI();
        });
    }

    public void createGUI() {
        frame = new JFrame("Информация о стране");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); //разделение окна на части
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        countriesBox = new JComboBox<>(countries);
        countriesBox.setSelectedIndex(-1);
        info = new JTextArea(10, 30);
        info.setEditable(false);
        info.setLineWrap(true); //перенос строки
        info.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(info);
        countriesBox.addActionListener(new ComboBoxHandler());
        panel.add(new JLabel("Выбери страну:"));
        panel.add(countriesBox);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class ComboBoxHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int s = countriesBox.getSelectedIndex();
            if (s >= 0 && s < inform.length) {
                String infor = "Страна: " + countries[s] + "\n\n" +
                        inform[s];
                info.setText(infor);
            }
        }
    }


}
