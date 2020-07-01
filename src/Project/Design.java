/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

import images.image;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Ezio Auditore
 */
public class Design
{
    static int plyr=0;
    static JFrame frm=new JFrame();
    static JPanel mainMenu=new JPanel();
    static int opp;
    static int diff;


    public JPanel getMainMenu()
    {
        return mainMenu;
    }

    public void setMainMenu(JPanel mainMenu)
    {
        this.mainMenu = mainMenu;
    }

    public static JFrame getFrm()
    {
        return frm;
    }

    public void setFrm(JFrame frm)
    {
        this.frm = frm;
    }
    public static int getPlyr()
    {
        return plyr;
    }
    Design()
    {
        int i,j,k;

//frm.setLayout(null);
        frm.setBackground(Color.black);
        frm.show();
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        frm.setBounds(0, 0, 800, 630);
        frm.setResizable(false);
        
//CardLayout cl=new CardLayout();
//JPanel card=new JPanel(cl);
//frm.add(card);

//>>>>>>>>>Main menu<<<<<<<<

        final JPanel mainMenu=new JPanel();
        mainMenu.setBounds(0,0,800,650);
        mainMenu.setLayout(null);
        mainMenu.setBackground(Color.DARK_GRAY);


        final JLabel background=new JLabel(new ImageIcon(this.getClass().getResource("/images/mainMenu.jpg")));
        background.setBounds(0,-30,800,650);
        background.setLayout(null);
        mainMenu.add(background);
//>>>>>Buttons<<<<
        JButton single=new JButton("Single Player");
        JButton multi=new JButton("Multiplayer");
        JButton option=new JButton("Help");
        JButton exit=new JButton("Exit");

//>>>Positioning buttons
        single.setBounds(0,320,250,70);
        option.setBounds(0,420,250,70);
        multi.setBounds(540,320,250,70);
        exit.setBounds(540,420,250,70);
single.setText("");
multi.setText("");
option.setText("");
exit.setText("");
//>>>Border buttons
        single.setBorder(new LineBorder(Color.black, 5));
        multi.setBorder(new LineBorder(Color.black, 5));
        option.setBorder(new LineBorder(Color.black, 5));
        exit.setBorder(new LineBorder(Color.black, 5));

//>>>Font buttons
        single.setFont(new Font("Showcard Gothic",1,24));
        option.setFont(new Font("Showcard Gothic",1,24));
        multi.setFont(new Font("Showcard Gothic",1,24));
        exit.setFont(new Font("Showcard Gothic",1,24));

//>>>Font color
        single.setForeground(Color.red);
        multi.setForeground(Color.red);
        option.setForeground(Color.red);
        exit.setForeground(Color.red);

//>>button background
        single.setBackground(new Color(255,255,204));
        multi.setBackground(new Color(255,255,204));
        option.setBackground(new Color(255,255,204));
        exit.setBackground(new Color(255,255,204));

        single.setIcon(new ImageIcon(image.class.getResource("single.png")));
        single.setContentAreaFilled(false);
        multi.setIcon(new ImageIcon(image.class.getResource("multi.png")));
        multi.setContentAreaFilled(false);
        option.setIcon(new ImageIcon(image.class.getResource("help.png")));
        option.setContentAreaFilled(false);
        exit.setIcon(new ImageIcon(image.class.getResource("exit.png")));
        exit.setContentAreaFilled(false);

//>>>Main menu title
        JLabel title=new JLabel("Snakes");
        title.setBounds(20,-30,600,200);
        title.setFont(new Font("Snap ITC", 1, 88));
        title.setBackground(Color.DARK_GRAY);
        title.setForeground(new Color(255,250,138));


        JLabel title2=new JLabel("&");
        title2.setBounds(150,60,600,200);
        title2.setFont(new Font("Snap ITC", 1, 88));
        title2.setBackground(Color.DARK_GRAY);
        title2.setForeground(Color.blue);


        JLabel title3=new JLabel("Ladders");
        title3.setBounds(20,150,600,200);
        title3.setFont(new Font("Snap ITC", 1, 88));
        title3.setBackground(Color.DARK_GRAY);
        title3.setForeground(Color.red);



///---------------------------////////////
//>>>Submenu
        final JPanel sub1=new JPanel();
        sub1.setBounds(350,350,100,120);
        sub1.setLayout(null);
        sub1.setBackground(Color.DARK_GRAY);
        sub1.setVisible(false);

//>>>Submenu buttons
        JButton easy=new JButton("");
        JButton mid=new JButton("");
        JButton hard=new JButton("");

//>>positioning the sub buttons
        easy.setBounds(0,5,100,30);
        mid.setBounds(0,40,100,30);
        hard.setBounds(0,75,100,30);

        easy.setIcon(new ImageIcon(image.class.getResource("easy.png")));
        easy.setContentAreaFilled(false);
        mid.setIcon(new ImageIcon(image.class.getResource("mid.png")));
        mid.setContentAreaFilled(false);
        hard.setIcon(new ImageIcon(image.class.getResource("hard.png")));
        hard.setContentAreaFilled(false);

        easy.setBackground(new Color(255,255,204));
        mid.setBackground(new Color(255,255,204));
        hard.setBackground(new Color(255,255,204));

        easy.setBorder(new LineBorder(Color.black, 5));
        mid.setBorder(new LineBorder(Color.black, 5));
        hard.setBorder(new LineBorder(Color.black, 5));

        easy.setFont(new Font("Showcard Gothic",0,18));
        mid.setFont(new Font("Showcard Gothic",0,18));
        hard.setFont(new Font("Showcard Gothic",0,18));

        easy.setForeground(Color.red);
        mid.setForeground(Color.red);
        hard.setForeground(Color.red);

        sub1.add(easy);
        sub1.add(mid);
        sub1.add(hard);

////////----------------------------////////////////

///>>>submenu panel
        final JPanel sub2=new JPanel();
        sub2.setBounds(350,350,100,120);
        sub2.setLayout(null);
        sub2.setBackground(Color.DARK_GRAY);
        sub2.setVisible(false);

//>>>Submenu buttons
        JButton twoP=new JButton("");
        JButton threeP=new JButton("");
        JButton fourP=new JButton("");

//>>positioning the sub buttons
        twoP.setBounds(0,5,100,30);
        threeP.setBounds(0,40,100,30);
        fourP.setBounds(0,75,100,30);

        twoP.setIcon(new ImageIcon(image.class.getResource("2p.png")));
        twoP.setContentAreaFilled(false);
        threeP.setIcon(new ImageIcon(image.class.getResource("3p.png")));
        threeP.setContentAreaFilled(false);
        fourP.setIcon(new ImageIcon(image.class.getResource("4p.png")));
        fourP.setContentAreaFilled(false);


        twoP.setBackground(new Color(255,255,204));
        threeP.setBackground(new Color(255,255,204));
        fourP.setBackground(new Color(255,255,204));

        twoP.setBorder(new LineBorder(Color.black, 5));
        threeP.setBorder(new LineBorder(Color.black, 5));
        fourP.setBorder(new LineBorder(Color.black, 5));

        twoP.setFont(new Font("Showcard Gothic",0,18));
        threeP.setFont(new Font("Showcard Gothic",0,18));
        fourP.setFont(new Font("Showcard Gothic",0,18));

        twoP.setForeground(Color.red);
        threeP.setForeground(Color.red);
        fourP.setForeground(Color.red);

        sub2.add(twoP);
        sub2.add(threeP);
        sub2.add(fourP);


        sub1.setOpaque(false);
        sub2.setOpaque(false);
///---------------------------////////////

//////>>>>>action performed
        single.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                sub1.setVisible(true);
                sub2.setVisible(false);
            }
        });
        multi.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                sub1.setVisible(false);
                sub2.setVisible(true);
            }
        });
        option.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Options().setVisible(true);
                sub1.setVisible(false);
                sub2.setVisible(false);
//                mainMenu.setVisible(false);
//                frm.dispose();
//                new Options.show();
                frm.dispose();

            }
        });
        exit.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                sub1.setVisible(false);
                sub2.setVisible(false);
//                frm.dispose();

                System.exit(0);
            }
        });

        easy.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
//           new GridLAy();
//
//
//                frm.dispose();
                mainMenu.setVisible(false);
                opp=1;
                diff=1;
                frm.dispose();
                new GameWindow();
//                frm.add(GameWindow.getMainPanel());
//                GameWindow.MainPanel.show();
            }
        });
        mid.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                mainMenu.setVisible(false);
                opp=1;
                diff=2;
                frm.dispose();
                new GameWindow();
//                GameWindow.MainPanel.show();
            }
        });
        hard.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                opp=1;
                System.out.println("opp: "+opp);
                diff=3;
                mainMenu.setVisible(false);
                frm.dispose();
                new GameWindow();
//                GameWindow.MainPanel.show();

            }
        });
        twoP.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                plyr=2;
                mainMenu.setVisible(false);
                new GameWindow();
                opp=0;
                frm.dispose();
            }
        });
        threeP.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                plyr=3;
                GameWindow.plyr_number.setIcon(new ImageIcon(this.getClass().getResource("/images/pawn3.png")));
                mainMenu.setVisible(false);
                new GameWindow();
                opp=0;
                frm.dispose();
            }
        });
        fourP.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                plyr=4;
                mainMenu.setVisible(false);
                new GameWindow();
                opp=0;
                frm.dispose();
            }
        });

        background.add(sub2);
        background.add(sub1);
//backgroundnu.add(title3);
//backgroundnu.add(title2);
//background
//background.add(title);
        background.add(single);
        background.add(multi);
        background.add(option);
        background.add(exit);
////////-------------------------------------------------------//////////////////
        final JButton contact=new JButton();
        final JLabel contactT=new JLabel("Contact us");
        contactT.setForeground(Color.red);
        contactT.setFont(new Font("Times New Roman",1,30));
        contactT.setBounds(20,520,200,50);
        contactT.setOpaque(false);
        contact.setBounds(20,570,30,30);
        contact.setIcon(new ImageIcon(this.getClass().getResource("/images/contact.png")));
        contact.setOpaque(false);

        contact.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                String URL="https://www.facebook.com/aabir.hassan?ref_component=mbasic_home_header&ref_page=%2Fwap%2Fhome.php&refid=7";
                try
                {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Design.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        background.add(contactT);

        background.add(contact);

        frm.add(mainMenu);




    }
    public static int getOpp()
    {
        return opp;
    }

    public static void setOpp(int opp)
    {
        Design.opp = opp;
    }

    public static void main (String arga[])
    {
        new Design();
    }
}
