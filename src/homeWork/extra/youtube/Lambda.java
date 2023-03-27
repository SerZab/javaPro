package homeWork.extra.youtube;

import javax.swing.*;
import java.awt.*;

public class Lambda {
    public static void main(String[] args) {
        final int screenWidth = 1200;
        final int screenHeight = 800;

        JFrame frame = new JFrame();
        frame.setSize(screenWidth,screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button button = new Button("Press me!");
        int i = 10;
        button.addActionListener(e -> JOptionPane.showMessageDialog(null,"Pressed " + i));

        BorderLayout borderLayout = new BorderLayout();
        frame.getContentPane().setLayout(borderLayout);
        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
