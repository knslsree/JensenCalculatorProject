import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateUI{
	 /**
	 * The boundary values, font are set and the button UI 
	 * for numbers are added to the frame.
	 * And declare a String backspace and assign null to it.
	 * For the backspace operation, length of the textField is
	 * checked and is reduced by 1 for every button press
	 * and refreshes the textField with new String
	 **/ 
	
	public void CreateButtonBackspace(JFrame frame,JTextField textField ) {
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBounds(10, 73, 58, 29);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		frame.getContentPane().add(btnBackspace);
	}
	
	public void CreateButton1(JFrame frame, JTextField textField) {
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 151, 58, 29);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
	}
	
	public void CreateButton2(JFrame frame, JTextField textField){
		JButton btn2 = new JButton("2");
		btn2.setBounds(67, 151, 58, 29);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
	}
	
	public void CreateButton7(JFrame frame, JTextField textField) {
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 97, 58, 29);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);
	}
	
	public void CreateButton4(JFrame frame, JTextField textField) {
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 124, 58, 29);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
	}
	
	public void CreateButton0(JFrame frame, JTextField textField) {
		JButton btnZero = new JButton("0");
		btnZero.setBounds(10, 176, 58, 29);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btnZero.getText();
				textField.setText(number);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnZero);
	}
	
	public void CreateButtonCLR(JFrame frame, JTextField textField) {
		JButton btnClear = new JButton("C");
		btnClear.setBounds(67, 73, 58, 29);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnClear);
	}
	
	public void CreateButton8(JFrame frame, JTextField textField) {
		JButton btn8 = new JButton("8");
		btn8.setBounds(67, 97, 58, 29);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
	}
	
	public void CreateButton5(JFrame frame, JTextField textField) {
		JButton btn5 = new JButton("5");
		btn5.setBounds(67, 124, 58, 29);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
	}
	
	public void CreateButtonDOT(JFrame frame, JTextField textField) {
		JButton btnDot = new JButton(".");
		btnDot.setBounds(67, 176, 58, 29);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDot);
	}
	
	public void CreateButton9(JFrame frame, JTextField textField) {
		JButton btn9 = new JButton("9");
		btn9.setBounds(123, 97, 58, 29);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
	}
	
	public void CreateButton6(JFrame frame, JTextField textField) {
		JButton btn6 = new JButton("6");
		btn6.setBounds(123, 124, 58, 29);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
	}
	
	public void CreateButton3(JFrame frame, JTextField textField) {
		JButton btn3 = new JButton("3");
		btn3.setBounds(123, 151, 58, 29);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.equalpress == true) {
					textField.setText(null);
					Calculator.equalpress = false;
				}
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
	}
}