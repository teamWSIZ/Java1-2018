package Zajecia12;

import javax.swing.*;

public class TestoweGui {
    private JPanel pnMain;
    private JTextArea textArea1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestoweGui");
        frame.setContentPane(new TestoweGui().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
