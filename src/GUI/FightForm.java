package GUI;

import javax.print.SimpleDoc;
import javax.swing.*;
import java.awt.*;


import base.*;


public class FightForm extends JFrame {
    private ImageIcon img,imgPoring,imgLuna,imgPicky,imgMaster ;
    public FightForm(Novice novice,Status status){
        super("RAGNAROK");
        Container c = getContentPane();


        img = new ImageIcon("src/PHO/Mon.jpg");
        imgPoring = new ImageIcon("src/PHO/boli_monster.png");
        imgLuna = new ImageIcon("src/PHO/fengtu_monster.png");
        imgPicky = new ImageIcon("src/PHO/picky_monster.png");
        imgMaster = new ImageIcon("src/PHO/masterring_mini.png");

        Picky picky = new Picky();
        Poring poring = new Poring();
        Lunatic lunatic = new Lunatic();
        Mastering mastering = new Mastering();
        String[] mons = {
                poring.getName(),
                lunatic.getName(),
                picky.getName(),
                mastering.getName()
        };
        Object[] possibilities = {mons[(int) (Math.random() * 3)],mons[(int) (Math.random() * 3)],mons[(int) (Math.random() * 3)]};
        Object s = JOptionPane.showInputDialog(
                null,
                "Choose monster you want to fight",
                "Monster around you",
                JOptionPane.PLAIN_MESSAGE,
                img,
                possibilities,
                "----Please Choose----");

        if(s.equals("Poring")){
            int n = JOptionPane.showConfirmDialog(
                    null,
                    "Name :"+poring.getName()+
                            "\nHp :"+poring.getHp()+
                            "\nAttack damage :"+poring.getDamage(),
                    "Are you sure ?",
                    JOptionPane.YES_NO_OPTION,0,imgPoring);
            if(n == JOptionPane.YES_OPTION){
                dispose();
                new CombatForm(novice,poring,status);
            }
            else if(n == JOptionPane.NO_OPTION) new Status(novice);

        }
        else if (s.equals("Lunatic")){
            int n = JOptionPane.showConfirmDialog(
                    null,
                    "Name :"+lunatic.getName()+
                            "\nHp :"+lunatic.getHp()+
                            "\nAttack damage :"+lunatic.getDamage(),
                    "An Inane Question",
                    JOptionPane.YES_NO_OPTION,0,imgLuna);
            if(n == JOptionPane.YES_OPTION){
                dispose();
                new CombatForm(novice,lunatic,status);
            }
            else if(n == JOptionPane.NO_OPTION) new Status(novice);
        }
        else if (s.equals("Picky")){
            int n = JOptionPane.showConfirmDialog(
                    null,
                    "Name :"+picky.getName()+
                            "\nHp :"+picky.getHp()+
                            "\nAttack damage :"+picky.getDamage(),
                    "An Inane Question",
                    JOptionPane.YES_NO_OPTION,0,imgPicky);
            if(n == JOptionPane.YES_OPTION){
                dispose();
                new CombatForm(novice,picky,status);
            }
            else if(n == JOptionPane.NO_OPTION) new Status(novice);
        }
        else if (s.equals("Mastering")){
            int n = JOptionPane.showConfirmDialog(
                    null,
                    "Name :"+mastering.getName()+
                            "\nHp :"+mastering.getHp()+
                            "\nAttack damage :"+mastering.getDamage(),
                    "An Inane Question",
                    JOptionPane.YES_NO_OPTION,0,imgMaster);
            if(n == JOptionPane.YES_OPTION){
                dispose();
                new CombatForm(novice,picky,status);
            }
            else if(n == JOptionPane.NO_OPTION) new Status(novice);
        }

        else{
            new Status(novice);
        }

    }
}
