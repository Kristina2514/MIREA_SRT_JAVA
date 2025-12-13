package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu {
    private JFrame frame;
    private JTextArea textArea;
    private JButton copyButton;
    private JButton pasteButton;

    private String copytext = "";
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().createAndShowGUI();
            }
        });
    }

    public void createAndShowGUI() {
        frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText("This is the area you can write text.\n");
        JScrollPane scrollPane = new JScrollPane(textArea);
        JPanel buttonPanel = new JPanel();
        copyButton = new JButton("Копировать");
        pasteButton = new JButton("Вставить");
        buttonPanel.add(copyButton);
        buttonPanel.add(pasteButton);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        JMenu editMenu = new JMenu("Правка");
        JMenu helpMenu = new JMenu("Справка");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        JMenuItem aboutItem = new JMenuItem("О программе");
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        helpMenu.add(aboutItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Функция сохранения будет реализована позже",
                        "Сохранить",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyText();
            }
        });

        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyText();
                textArea.replaceSelection("");
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasteText();
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Простой текстовый редактор\nВерсия 1.0",
                        "О программе",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyText();
            }
        });

        pasteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasteText();
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void copyText() {
        String selectedText = textArea.getSelectedText();
        if (selectedText != null && !selectedText.isEmpty()) {
            copytext = selectedText;
            JOptionPane.showMessageDialog(frame,
                    "Текст скопирован в буфер",
                    "Копирование",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Если ничего не выделено
            JOptionPane.showMessageDialog(frame,
                    "Сначала выделите текст для копирования",
                    "Ошибка",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void pasteText() {
        if (!copytext.isEmpty()) {
            textArea.insert(copytext, textArea.getCaretPosition());
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Буфер обмена пуст",
                    "Ошибка",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
