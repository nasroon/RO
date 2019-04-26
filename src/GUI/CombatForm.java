package GUI;
import base.Monster;
import base.Novice;
import base.SuperNovice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatForm extends JFrame {
    private ImageIcon img,backImg;
    private JLabel backgroundImage;
    public CombatForm(Novice novice, Monster monster,Status status){
        super("RAGNAROK");
        img = new ImageIcon("src/PHO/Untitled-2.jpg");
        backgroundImage = new JLabel("",img,JLabel.CENTER);
        backgroundImage.setBounds(0,0,840,450);
        setContentPane(backgroundImage);


        Container c = getContentPane();
        JPanel p1 = new JPanel();
        // 10 pixel border all around
        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p1.setLayout( new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.setBounds(10,10,200,100);


        JLabel helthLabel = new JLabel("Helth :"+novice.getHealthPoint()+" / " +novice.getMaxHealthPoint());
        helthLabel.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel damageLabel = new JLabel("Damage :"+novice.getDamagePoint());
        damageLabel.setFont(new Font("Serif", Font.BOLD, 16));

        p1.add(helthLabel);
        p1.add(damageLabel);

        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p2.setLayout( new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.setBounds(615,330,200,100);

        JLabel nameMonster = new JLabel("Name :"+monster.getName());
        nameMonster.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel helthMonster = new JLabel("HP :"+monster.getHp());
        helthMonster.setFont(new Font("Serif", Font.BOLD, 16));
        JLabel damageMonster = new JLabel("Damage :"+monster.getDamage());
        damageMonster.setFont(new Font("Serif", Font.BOLD, 16));
        p2.add(nameMonster);
        p2.add(helthMonster);
        p2.add(damageMonster);

        c.add(p1);
        c.add(p2);



        JButton attack = new JButton("Attack");
        attack.setBounds(360,390,200,50);
        attack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(novice.getMaxHealthPoint() <= 0 || monster.getHp() <= 0){
                        new Status(novice);
                        dispose();
                    }
                    else{
                        novice.takeDamage(monster.getDamage());
                        monster.takeDamage(novice.getDamagePoint());
                        if(novice.getHealthPoint() <=0 || monster.getHp()<=0){
                            if(novice.getHealthPoint() <= 0){
                                novice.die();
                            }
                            else if(monster.getHp() <= 0){
                                SuperNovice superNovice = new SuperNovice(novice.getName(),novice.getGender());
                                novice.expGain(monster.getExp());
                                novice.moneyGain(monster.getReward());
                                novice.killUp();
                                novice.levelUp(novice.getExperiece(),novice.getLevel());
                                if(novice.getKillcount() == 15){
                                    novice.setJob(superNovice.getJob(),superNovice.getDamage());
                                }
                            }
                            new Status(novice);
                            dispose();
                        }
                        else {
                            helthLabel.setText("Helth :"+novice.getHealthPoint());
                            helthMonster.setText("HP :"+monster.getHp());
                        }

                    }



            }
        });
        c.add(attack);

        backImg = new ImageIcon("src/PHO/smallquit.jpg");
        JButton close = new JButton("",backImg);
        close.setBackground(Color.BLACK);
        close.setForeground(Color.red);
        close.setBounds(0, 360, 85, 84);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Status(novice);
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
        setVisible(true);
    }
}
