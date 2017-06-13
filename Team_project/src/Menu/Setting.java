package Menu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

//Frame with background color selection, sound on off combo box
public class Setting extends JFrame {
 
	private JPanel Pane;
	private JComboBox comboBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblgame,lblintro,lblSound,lblColor;
	private JButton btnset;
	private JRadioButton rdbtnOff,rdbtnOn;
	public SoundSettingFile ssf = new SoundSettingFile();
	private Boolean sound = true;
	/**
	 * Launch the application.
	 */
	public void go(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting frame2 = new Setting();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Setting() {
		setTitle("Setting");
		setBounds(100, 100, 594, 568);
		Pane = new JPanel();
		Pane.setBackground(KoreanChess.c);
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);
		
		lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 50));
		lblgame.setBounds(14, 12, 548, 71);
		lblgame.setHorizontalAlignment(SwingConstants.CENTER);
		Pane.add(lblgame);
		
		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(121, 459, 326, 18);
		Pane.add(lblintro);
		
		btnset = new JButton("SETTING");
		btnset.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		btnset.setForeground(new Color(160, 82, 45));
		btnset.setBackground(KoreanChess.c);
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("GRAY")==true) KoreanChess.c=Color.LIGHT_GRAY;
				if (comboBox.getSelectedItem().equals("PINK")==true) KoreanChess.c=Color.PINK;
				if (comboBox.getSelectedItem().equals("BLUE")==true) KoreanChess.c=new Color(0,206,209);
				if (comboBox.getSelectedItem().equals("WHITE")==true) KoreanChess.c=Color.WHITE;
				if (comboBox.getSelectedItem().equals("YELLOW")==true) KoreanChess.c=Color.YELLOW;
				if (comboBox.getSelectedItem().equals("GREEN")==true) KoreanChess.c=new Color(154,205,50);
				if (comboBox.getSelectedItem().equals("BEIGE")==true) KoreanChess.c=new Color(255,218,185);
				
				Pane.setBackground(KoreanChess.c);
				rdbtnOn.setBackground(KoreanChess.c);
				rdbtnOff.setBackground(KoreanChess.c);
				btnset.setBackground(KoreanChess.c);
				dispose();
				KoreanChess kc=new KoreanChess();
				kc.go();
			}
		});
		btnset.setBounds(198, 314, 178, 64);
		Pane.add(btnset);
		
		lblSound = new JLabel("SOUND");
		lblSound.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		lblSound.setBounds(139, 156, 123, 47);
		Pane.add(lblSound);
		
		lblColor = new JLabel("COLOR");
		lblColor.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		lblColor.setBounds(139, 215, 123, 35);
		Pane.add(lblColor);
		
		rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ssf.conductSerializing("false");
			}
			
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBackground(KoreanChess.c);
		rdbtnOff.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 18));
		rdbtnOff.setBounds(336, 156, 81, 47);
		Pane.add(rdbtnOff);
		
		rdbtnOn = new JRadioButton("ON");
		rdbtnOn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				ssf.conductSerializing("true");
			}
			
		});
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBackground(KoreanChess.c);
		rdbtnOn.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 18));
		rdbtnOn.setBounds(272, 156, 66, 47);
		Pane.add(rdbtnOn);
		sound = ssf.DeconductSerializing();
		if(sound == true){
			rdbtnOn.setSelected(true);
			rdbtnOff.setSelected(false);
		}else{
			rdbtnOn.setSelected(false);
			rdbtnOff.setSelected(true);			
		}
		comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GRAY", "PINK", "GREEN", "BLUE", "BEIGE", "YELLOW", "WHITE"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(277, 220, 123, 24);
		Pane.add(comboBox);
	}
}