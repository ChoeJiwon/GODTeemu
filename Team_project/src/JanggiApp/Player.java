package JanggiApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class Player extends JFrame {
   private JPanel contentPane;
   private JLabel lblintro;
   private Board board;
   static JTextField textPlay1;
   static JTextField textPlay2;

   /**
    * Launch the application.
    */
   public void go() {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Player frame = new Player();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public Player() {
      setTitle("MENU");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 594, 568);
      contentPane = new JPanel();
      contentPane.setBackground(KoreanChess.c);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblgame = new JLabel("OOP WITH GAME");
      lblgame.setForeground(new Color(160, 82, 45));
      lblgame.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 50));
      lblgame.setBounds(14, 12, 548, 71);
      lblgame.setHorizontalAlignment(SwingConstants.CENTER);
      contentPane.add(lblgame);
      
      lblintro = new JLabel("PRODUCTION BY TEEMU WARRIORS");
      lblintro.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 20));
      lblintro.setForeground(new Color(169, 169, 169));
      lblintro.setBounds(88, 459, 388, 18);
      contentPane.add(lblintro);
      
      JButton btnstart = new JButton("START");
      btnstart.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
      btnstart.setForeground(new Color(160, 82, 45));
      btnstart.setBackground(KoreanChess.c);
      btnstart.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (textPlay1.getText().length() != 0 && textPlay2.getText().length() != 0) {
               if (!(textPlay1.getText().equals(textPlay2.getText()))) {
                  dispose();
                  board = new Board();
                  board.go();
               }
            }
         }
      });
      btnstart.setBounds(309, 318, 178, 64);
      contentPane.add(btnstart);
      
      JLabel labelPlay = new JLabel("Player1 :");
      labelPlay.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 25));
      labelPlay.setBounds(88, 153, 131, 28);
      contentPane.add(labelPlay);
      
      textPlay1 = new JTextField();
      textPlay1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 25));
      textPlay1.setBounds(218, 150, 248, 34);
      contentPane.add(textPlay1);
      textPlay1.setColumns(10);
      
      JLabel lblPlay2 = new JLabel("Player2 :");
      lblPlay2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 25));
      lblPlay2.setBounds(88, 230, 131, 28);
      contentPane.add(lblPlay2);
      
      textPlay2 = new JTextField();
      textPlay2.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 25));
      textPlay2.setColumns(10);
      textPlay2.setBounds(218, 227, 248, 34);
      contentPane.add(textPlay2);
      
      JButton btnBack_1 = new JButton("Back");
      btnBack_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            KoreanChess k=new KoreanChess();
            k.go();
         }
      });
      btnBack_1.setBounds(88, 398, 105, 27);
      contentPane.add(btnBack_1);
   }
}