package GUI;

import base.Novice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.CENTER;

public class Status extends JFrame {
    private JLabel backgroundImage;
    private ImageIcon img,quitImg;


    public Status(Novice novice){
        super("RAGNAROK");
        img = new ImageIcon("src/PHO/Untitled-3.jpg");
        backgroundImage = new JLabel("",img,JLabel.CENTER);
        backgroundImage.setBounds(0,0,840,450);
        setContentPane(backgroundImage);


        Container c = getContentPane();
        c.setLayout(new BorderLayout(10,7));

        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p1.setLayout( new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.setBounds(10,110,200,230);

        if(novice.getGender().equals("male")){
            ImageIcon image = new ImageIcon("src/PHO/Male.png");
            JLabel images = new JLabel("",image,JLabel.CENTER);
            images.setBounds(0,0,150,300);
            JPanel p2 = new JPanel();
            p2.setBackground(new Color(0,0,0,0));
            p2.setBounds(310,140,150,300);
            p2.add(images);
            c.add(p2);
        }
        else if(novice.getGender().equals("female")){
            ImageIcon image = new ImageIcon("src/PHO/Female.png");
            JLabel images = new JLabel("",image,JLabel.CENTER);
            images.setBounds(0,0,150,300);
            JPanel p2 = new JPanel();
            p2.setBackground(new Color(0,0,0,0));
            p2.setBounds(310,140,150,300);
            p2.add(images);
            c.add(p2);
        }


        JLabel nameLabel = new JLabel("Name :"+ novice.getName());
        nameLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel genderLabel = new JLabel("Gender :"+ novice.getGender());
        genderLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel jobLabel = new JLabel("Job :"+novice.getJob());
        jobLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel helthLabel = new JLabel("Helth :"+novice.getHealthPoint()+" / "+novice.getMaxHealthPoint());
        helthLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel damageLabel = new JLabel("Damage : "+novice.getDamagePoint());
        damageLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel levelLabel = new JLabel("Level : "+novice.getLevel());
        levelLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel experianceLabel = new JLabel("Experience :"+novice.getExperiece());
        experianceLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel moneyLabel = new JLabel("Money :"+novice.getMoney());
        moneyLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel killLabel = new JLabel("KILL :"+novice.getKillcount());
        killLabel.setFont(new Font("Serif", Font.BOLD, 16));


        p1.add(nameLabel);
        p1.add(genderLabel);
        p1.add(jobLabel);
        p1.add(helthLabel);
        p1.add(damageLabel);
        p1.add(levelLabel);
        p1.add(experianceLabel);
        p1.add(moneyLabel);
        p1.add(killLabel);

        c.add(p1);

        JButton heal = new JButton("HEAL !");
        heal.setBounds(100,350,100,50);
        heal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novice.fullHp();
                helthLabel.setText("Helth :"+novice.getHealthPoint()+" / "+novice.getMaxHealthPoint());
            }
        });
        c.add(heal);


        JButton monster = new JButton("ATTACK");
        monster.setBounds(640,200,200,200);
        monster.addActionListener(new ActionListener() {
            private Status status;

            @Override
            public void actionPerformed(ActionEvent e) {
                new FightForm(novice, status);
                dispose();
            }
        });
        c.add(monster);



        quitImg = new ImageIcon("src/PHO/smallquit.jpg");
        JButton close = new JButton("",quitImg);
        close.setBackground(Color.BLACK);
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
}
