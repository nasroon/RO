package GUI;

import base.Novice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class ndForm extends JFrame {
    private ImageIcon img,backImg;
    private JLabel backgroundImage;

    public ndForm(){
        super("RAGNAROK");
        Container c = getContentPane();

        img = new ImageIcon("src/PHO/snBG.jpg");
        backgroundImage = new JLabel("",img,JLabel.CENTER);
        backgroundImage.setBounds(0,0,840,450);
        c.add(backgroundImage);


        JButton create = new JButton("Create character");
        create.setBounds(360, 250, 150, 25);
        create.setBackground(Color.YELLOW);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreatecharacterFeild();

            }
        });
        c.add(create);


        backImg = new ImageIcon("src/PHO/smallquit.jpg");
        JButton close = new JButton("",backImg);
        close.setBackground(Color.BLACK);
        close.setForeground(Color.red);
        close.setBounds(0, 340, 85, 84);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] arguments = new String[] {"123"};
                StartGame.main(arguments);
                dispose();
            }
        });
        c.add(close);

        setSize(840,450);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);

    }


    private class CreatecharacterFeild {
        public CreatecharacterFeild(){
            JTextField nameField = new JTextField();
            JLabel label = new JLabel("Gender");
            CheckboxGroup cbg = new CheckboxGroup();
            Checkbox checkBox1 = new Checkbox("Male", cbg, true);
            checkBox1.setBounds(100,100, 50,50);
            Checkbox checkBox2 = new Checkbox("Female", cbg, false);
            checkBox2.setBounds(150,100, 50,50);

            Object[] feilds = {
                    "Input your character name",nameField,
                    label,
                    "",checkBox1,
                    "",checkBox2
            };

            int snResult = JOptionPane.showConfirmDialog(null,feilds,"",JOptionPane.OK_CANCEL_OPTION);
            if(snResult == JOptionPane.CANCEL_OPTION){

            }
            else if ((nameField.getText().equals(""))) {
                JOptionPane.showMessageDialog(null,
                        "Plese enter your character name !!",
                        "Inane error",
                        JOptionPane.INFORMATION_MESSAGE);

            }
            else if(snResult == JOptionPane.OK_OPTION) {
                if (checkBox1.getState()) {
                    new Status(new Novice(nameField.getText(), "male"));
                } else {
                    new Status(new Novice(nameField.getText(), "female"));
                }
                dispose();
            }
        }
    }

}
