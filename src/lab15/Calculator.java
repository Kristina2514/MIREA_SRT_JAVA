package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    private JFrame frame;
    private JTextField display;
    private JPanel buttonPanel;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private double result = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().createAndShowGUI();
            }
        });
    }

    public void createAndShowGUI() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setText("0");
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttonLabels = {
                "7", "8", "9", ":",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
        frame.setLayout(new BorderLayout());
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                if (startNewNumber) {
                    display.setText("");
                    startNewNumber = false;
                }
                String currentText = display.getText();
                display.setText(currentText + command);
            }
            else if (command.equals("+") || command.equals("-") ||
                    command.equals("*") || command.equals(":")) {
                firstNumber = Double.parseDouble(display.getText());
                operator = command;
                startNewNumber = true;
            }
            else if (command.equals("=")) {
                secondNumber = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case ":":
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            display.setText("Ошибка: деление на 0");
                            startNewNumber = true;
                            return;
                        }
                        break;
                }

                if (result == (int) result) {
                    display.setText(String.valueOf((int) result));
                } else {
                    display.setText(String.valueOf(result));
                }

                operator = "";
                startNewNumber = true;
            }
            else if (command.equals("C")) {
                display.setText("0");
                firstNumber = 0;
                secondNumber = 0;
                result = 0;
                operator = "";
                startNewNumber = true;
            }
        }
    }
}
