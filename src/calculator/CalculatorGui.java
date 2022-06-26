package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorGui {

    public JPanel CalculatorView;

    //numbers
    public JButton eight;
    public JButton one;
    public JButton seven;
    public JButton nine;
    public JButton six;
    public JButton five;
    public JButton four;
    public JButton two;
    public JButton three;
    public JButton zero;

    double a, b, result;
    String op;

    //operations
    public JButton substract;
    public JButton multiply;
    public JButton divide;
    public JButton addiction;
    public JButton clear;
    public JTextField resultsTxt;
    public JButton equal;
    public JButton decimal;

    public CalculatorGui() {
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + one.getText());
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + two.getText());
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + three.getText());
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + four.getText());
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + five.getText());
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + six.getText());
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + seven.getText());
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + eight.getText());
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + nine.getText());
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText(resultsTxt.getText() + zero.getText());
            }
        });

        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!resultsTxt.getText().contains(".")) {
                    resultsTxt.setText(resultsTxt.getText() + decimal.getText());
                }
            }
        });
        addiction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(resultsTxt.getText());
                op = "+";
                resultsTxt.setText("");
            }
        });
        substract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(resultsTxt.getText());
                op = "-";
                resultsTxt.setText("");
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(resultsTxt.getText());
                op = "*";
                resultsTxt.setText("");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(resultsTxt.getText());
                op = "/";
                resultsTxt.setText("");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsTxt.setText("");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(resultsTxt.getText());

                if(op == "+") {
                    result = a+b;
                    resultsTxt.setText(String.valueOf(result));
                }else if (op == "-"){
                    result = a-b;
                    resultsTxt.setText(String.valueOf(result));
                }else if (op == "*"){
                    result = a*b;
                    resultsTxt.setText(String.valueOf(result));
                }else if (op == "/"){
                    result = a/b;
                    resultsTxt.setText(String.valueOf(result));
                }

            }
        });
    }
}