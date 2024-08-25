import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mycal {
    //Id:231311068
    private JPanel calculator;
    private JButton clearButton;
    private JButton button2;
    private JButton a8Button;
    private JTextField textDisplay;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton backButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a000Button;
    private JButton button13;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button16;
    private JButton modButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button21;
    private JLabel Tauhid;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    public Mycal() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+a0Button.getText());
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textDisplay.getText();
                if (!currentText.isEmpty()) {
                    textDisplay.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });
        a000Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textDisplay.getText();
                // Check if the current text already contains a decimal point
                if (!currentText.contains(".")) {
                    textDisplay.setText(currentText + ".");
                }
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textDisplay.getText());
                    operator = '+';
                    textDisplay.setText("");

                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    num1 = Double.parseDouble(textDisplay.getText());
                    operator = '-';
                    textDisplay.setText("");
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num2 = Double.parseDouble(textDisplay.getText());
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0) {
                                throw new ArithmeticException("Cannot Divide by Zero");
                            }
                            result = num1 / num2;
                            break;
                        case 'm':
                            result = num1 % num2;
                            break;
                        case '%':
                            result = (num1 / 100) * num2;
                            break;
                        default:
                            textDisplay.setText("Error");
                            return;
                    }
                    textDisplay.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                } catch (ArithmeticException ex) {
                    textDisplay.setText(ex.getMessage());
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textDisplay.getText());
                    operator = '*';
                    textDisplay.setText("");
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textDisplay.getText());
                    operator = '/';
                    textDisplay.setText("");
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num = Double.parseDouble(textDisplay.getText());
                    if (num < 0) {
                        textDisplay.setText("Invalid Input"); // Cannot take square root of negative number
                    } else {
                        double result = Math.sqrt(num);
                        textDisplay.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textDisplay.getText());
                    operator = 'm';
                    textDisplay.setText("");
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(textDisplay.getText());
                    operator = '%';
                    textDisplay.setText("");
                } catch (NumberFormatException ex) {
                    textDisplay.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mycal");
        frame.setContentPane(new Mycal().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
