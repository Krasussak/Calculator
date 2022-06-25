package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        {
            frame.setContentPane(new CalculatorGui().CalculatorView);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(400, 350);
            frame.setVisible(true); //test
        }
    }
}