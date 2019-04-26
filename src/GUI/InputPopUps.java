
// BorderDemo.java
// Andrew Davison, January 2008, ad@fivedots.coe.psu.ac.th


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputPopUps extends JFrame
{
    public InputPopUps()
    {
        super("E-Commerce Application");

        Container c = getContentPane();
        // use BorderLayout:
        // 10 pixel horiz. gap, 7 pixel vert. gap
        c.setLayout( new BorderLayout(10, 7) );

        // JCheckBox jck1 = new JCheckBox("Downgrade dog to cat");
        JCheckBox jck2 = new JCheckBox("Upgrade bike to car");
        JCheckBox jck3 = new JCheckBox("Add speed package");
        // c.add(jck1);
        c.add( jck2, BorderLayout.EAST);
        c.add( jck3, BorderLayout.SOUTH);

        JButton jb1 = new JButton("place order");
        c.add( jb1, BorderLayout.NORTH);
        JButton jb2 = new JButton("cancel");
        c.add( jb2, BorderLayout.WEST);

        JLabel jl = new JLabel(new ImageIcon( "bmw.jpg"));
        c.add(jl, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(400,400);  // extra depth (200 --> 400)
        pack();
        setLocationRelativeTo(null);  // center the window
        setVisible(true);
    } // end of BorderDemo()


    // ----------------------------------------------

    public static void main(String[] args)
    {  new InputPopUps(); }

} // end of BorderDemo class

