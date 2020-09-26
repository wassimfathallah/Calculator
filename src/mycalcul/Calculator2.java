package mycalcul;
//
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator2 extends JFrame {
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Calculator2 frame = new Calculator2();
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
	
	double num ,ans;
	int calculation;
	private JTextField txtInvisible;
	
	public void arithmetic_operation() { // pour choisir les operation
		
		 switch(calculation) {
		 // addition
		 case 1: 
			 ans = num +Double.parseDouble(textField.getText());
			 textField.setText(Double.toString(ans));
		 break;
		 
		 // Substraction
		 case 2: 
			 ans = num - Double.parseDouble(textField.getText());
			 textField.setText(Double.toString(ans));
		 break;
		 
		 // multiplication
		 case 3: 
			 ans = num * Double.parseDouble(textField.getText());
			 textField.setText(Double.toString(ans));
		 break;
		 // Division
		 case 4: 
			 ans = num /Double.parseDouble(textField.getText());
			 textField.setText(Double.toString(ans));
		 break; 
		 /* Pourcentage
		 case 5: 
			 ans = (num +Double.parseDouble(textField.getText())) /100;
			 textField.setText(Double.toString(ans));
		 break;
		 */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
		
	}
	public Calculator2() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/wassimfathallah/Desktop/Logo/Paris_Saint8Germain_FC.png"));
		setBackground(Color.WHITE);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 292);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setName("txt");
		textField.setBorder(null);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEnabled(false);
		textField.setBounds(6, 6, 429, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		setLocationRelativeTo(null);
		
		//________Creation du buttons
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button.setBorder(BorderFactory.createLineBorder(Color.black));
		button.setBounds(6, 221, 98, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_1.setBorder(BorderFactory.createLineBorder(Color.black));
		button_1.setBounds(6, 180, 98, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_2.setBorder(BorderFactory.createLineBorder(Color.black));
		button_2.setBounds(116, 180, 98, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_3.setToolTipText("3");
		button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_3.setBorder(BorderFactory.createLineBorder(Color.black));
		button_3.setBounds(230, 180, 98, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_4.setBorder(BorderFactory.createLineBorder(Color.black));
		button_4.setBounds(6, 139, 98, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_5.setBorder(BorderFactory.createLineBorder(Color.black));
		button_5.setBounds(116, 139, 98, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_6.setBorder(BorderFactory.createLineBorder(Color.black));
		button_6.setBounds(230, 139, 98, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_7.setBorder(BorderFactory.createLineBorder(Color.black));
		button_7.setBackground(Color.YELLOW);
		button_7.setBounds(6, 98, 98, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_8.setBorder(BorderFactory.createLineBorder(Color.black));
		button_8.setBounds(116, 98, 98, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_9.setBorder(BorderFactory.createLineBorder(Color.black));
		button_9.setBounds(230, 98, 98, 29);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		button_10.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_10.setBorder(BorderFactory.createLineBorder(Color.black));
		button_10.setBounds(116, 221, 95, 29);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				txtInvisible.setText("");
			}
		});
		button_11.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_11.setBorder(BorderFactory.createLineBorder(Color.black));
		button_11.setBounds(230, 221, 205, 29);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation= 4;
				textField.setText("");
				txtInvisible.setText(num +"/");
			}
		});
		button_12.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_12.setBorder(BorderFactory.createLineBorder(Color.black));
		button_12.setBounds(340, 98, 95, 29);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation= 1;
				textField.setText("");
				txtInvisible.setText(num +"+");
				
			}
		});
		button_13.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_13.setBorder(BorderFactory.createLineBorder(Color.black));
		button_13.setBounds(340, 180, 95, 29);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation= 3;
				textField.setText("");
				txtInvisible.setText(num +"*");
			}
		});
		button_14.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_14.setBorder(BorderFactory.createLineBorder(Color.black));
		button_14.setBounds(340, 62, 95, 29);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("C");
		button_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//___________________To delete one number
				int longeur = textField.getText().length()-1;
				if(longeur>0) {
					
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(longeur);
					String text = 	back.toString();
					textField.setText(text);
					
				}
			}
		});
		button_15.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_15.setBorder(BorderFactory.createLineBorder(Color.black));
		button_15.setBounds(230, 57, 95, 29);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("AC");
		button_16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		button_16.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_16.setBorder(BorderFactory.createLineBorder(Color.black));
		button_16.setBounds(119, 57, 95, 29);
		contentPane.add(button_16);
		
		JButton button_18 = new JButton("-");
		button_18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num= Double.parseDouble(textField.getText());
				calculation= 2;
				textField.setText("");
				txtInvisible.setText(num +"-");
			}
		});
		button_18.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_18.setBorder(BorderFactory.createLineBorder(Color.black));
		button_18.setBounds(340, 139, 95, 29);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("+/-");
		button_19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops= ops* (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		button_19.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		button_19.setBorder(BorderFactory.createLineBorder(Color.black));
		button_19.setBounds(6, 57, 101, 29);
		contentPane.add(button_19);
		
		txtInvisible = new JTextField(); 
		txtInvisible.setVisible(false);
		txtInvisible.setText("invisible");
		txtInvisible.setBounds(340, 6, 130, 26);
		contentPane.add(txtInvisible);
		txtInvisible.setColumns(10);
	}
}
