import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateOperator {
	
	/**
	 * The boundary values, font are set 
	 * and the button equal is added to the frame
	 * when the equal button is pressed it checks the 
	 * operation to be performed (+,-,%,/,√) based on the operation button pressed
	 * and takes the recent number in the textField as second number
	*/
	public void CreateButtonEQ(JFrame frame, JTextField textField) {
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(123, 176, 58, 29);
		btnEqual.setToolTipText("");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				if (!textField.getText().isBlank()) {
					Calculator.equalpress = true;
					Calculator.second = Double.parseDouble(textField.getText());
					if (Calculator.operation == "+") {
						Calculator.result = Calculator.first + Calculator.second;
						answer = String.format("%.2f", Calculator.result);
						textField.setText(answer);
					} else if (Calculator.operation == "-") {
						Calculator.result = Calculator.first - Calculator.second;
						answer = String.format("%.2f", Calculator.result);
						textField.setText(answer);
					} else if (Calculator.operation == "*") {
						Calculator.result = Calculator.first * Calculator.second;
						answer = String.format("%.2f", Calculator.result);
						textField.setText(answer);
					} else if (Calculator.operation == "/") {
						Calculator.result = Calculator.first / Calculator.second;
						answer = String.format("%.2f", Calculator.result);
						textField.setText(answer);
						if (Calculator.second == 0) {
							textField.setText(" Invalid Division");
						} else if (Calculator.result == Calculator.result / Calculator.second) {
							textField.setText(answer);
						}
					} else if (Calculator.operation == "%") {
						Calculator.result = Calculator.first % Calculator.second;
						answer = String.format("%.2f", Calculator.result);
						textField.setText(answer);
					} else if (Calculator.operation == "√") {
						Calculator.result = Double.parseDouble(textField.getText());
						Double sqrt = Math.sqrt(Calculator.result);
						answer = String.format("%.2f", Calculator.result);
						textField.setText(Double.toString(sqrt));
					}
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnEqual);
	}
	
	/**
	 * The boundary values, font are set and the button for arithmetic operations Addition, 
	 * Subtraction, Multiplication, Division, Remainder and Square root are added to the frame.
	 * The arithmetic operation will be performed only if the textField is not blank,
	 * or number is available. Otherwise, textField shall be set to zero.
	 */
	public void CreateButtonSQRT(JFrame frame, JTextField textField) {
		JButton btnSqrt = new JButton("√");
		btnSqrt.setBounds(123, 73, 58, 29);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					Calculator.first = Double.parseDouble(textField.getText());
					Calculator.operation = "√";
				} else {
					textField.setText("0");
				}
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSqrt);
	}
	
	public void CreateButtonADD(JFrame frame, JTextField textField) {
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(178, 73, 58, 29);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					Calculator.first = Double.parseDouble(textField.getText());
					textField.setText("");
					Calculator.operation = "+";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPlus);
	}
	
	public void CreateButtonSUB(JFrame frame, JTextField textField) {
		JButton btnSub = new JButton("-");
		btnSub.setBounds(178, 97, 58, 29);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					Calculator.first = Double.parseDouble(textField.getText());
					textField.setText("");
					Calculator.operation = "-";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSub);
	}
	
	public void CreateButtonMUL(JFrame frame, JTextField textField) {
		JButton btnMul = new JButton("*");
		btnMul.setBounds(178, 124, 58, 29);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					Calculator.first = Double.parseDouble(textField.getText());
					textField.setText("");
					Calculator.operation = "*";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnMul);
	}
	
	public void CreateButtonDIV(JFrame frame, JTextField textField) {
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(178, 151, 58, 29);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					Calculator.first = Double.parseDouble(textField.getText());
					textField.setText("");
					Calculator.operation = "/";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDivide);
	}
	
	public void CreateButtonREM(JFrame frame, JTextField textField) {
		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(163, 176, 73, 29);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					Calculator.first = Double.parseDouble(textField.getText());
					textField.setText("");
					Calculator.operation = "%";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPercent);
	}
}
