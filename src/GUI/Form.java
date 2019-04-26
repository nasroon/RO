package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class Form extends JFrame {

    private JLabel backgroundImage;
    private ImageIcon img,quitImg;

    public Form() {
        super("RAKNAROG");
        Container c = getContentPane();


        img = new ImageIcon("src/PHO/Untitled-1.jpg");
        backgroundImage = new JLabel("",img,JLabel.CENTER);
        backgroundImage.setBounds(0,0,840,450);
        c.add(backgroundImage);


        JButton startBtn = new JButton("START");
        startBtn.setBounds(370, 250, 100, 25);
        startBtn.setBorder(new RoundedBorder(10)); //10 is the radius
        startBtn.setForeground(Color.BLUE);
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ndForm ndForm = new ndForm();
                int dialogButton = 0;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Is this your first game?","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    ndForm.setVisible(true);
                    dispose();
                    //-----------------------------------------------------

                }
            }
        });
        c.add(startBtn);


        quitImg = new ImageIcon("src/PHO/smallquit.jpg");
        JButton close = new JButton("EXIT",quitImg);
        //close.setBackground(Color.PINK);
        //close.setOpaque(false);
        //close.setFocusPainted(true);
        //close.setContentAreaFilled(false);
        //close.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        close.setForeground(Color.red);
        close.setBounds(0, 360, 85, 84);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        c.add(close);

        setSize(840,450);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    private static class RoundedBorder implements Border {
        private int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }


}
