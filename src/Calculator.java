import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window.Type;

public class Calculator {
	private JFrame frame;
	private JTextField textField;
	static double first;
	static double second;
	static double result;
	static String operation;
	static boolean equalpress = false;

	 /**
	   * Launch the application through JFrame Window/Frame management
	   * In Window, created textField to accept the numbers, to display 
	   * the result after calculation. 
	   * Buttons are created to enable entering the numbers and perform 
	   * the operations.
	   * Internally SwingUtilities has been used .
	   */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}
	 /**
	   * Initialize the contents of the Frame
	   * The following parameters are set
	   * Title
	   * Type
	   * Boundaries
	   * Type of default operation
	   * Setting the position
	   */ 
	private void initialize() {
		frame = new JFrame("CALCULATOR");
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 256, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setBounds(10, 11, 231, 51);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		CreateUI Ui=new CreateUI();
		CreateOperator Op=new CreateOperator();
		/**
		 * Declare a String backspace and assign null to it
		 * For the backspace operation, length of the textField is
		 * checked and is reduced by 1 for every button press
		 * and refreshes the textField with new String
		*/ 
		Ui.CreateButtonBackspace(frame,textField);
		Ui.CreateButton1(frame, textField);
		Ui.CreateButton2(frame, textField);
		Ui.CreateButton7(frame, textField);
		Ui.CreateButton4(frame, textField);
		Ui.CreateButton0(frame, textField);
		Ui.CreateButtonCLR(frame, textField);
		Ui.CreateButton8(frame, textField);
		Ui.CreateButton5(frame, textField);
		Ui.CreateButtonDOT(frame, textField);
		Ui.CreateButton9(frame, textField);
		Ui.CreateButton6(frame, textField);
		Ui.CreateButton3(frame, textField);
		/**
		 * The boundary values, font are set 
		 * and the button equal is added to the frame
		 * when the equal button is pressed it checks the 
		 * operation to be performed (+,-,%,/,√) based on the operation button pressed
		 * and takes the recent number in the textField as second number
		*/
		Op.CreateButtonEQ(frame, textField);
		/**
		 * Determine the first number when operation button +,-,*,/,% and √ is pressed
		 * and clear the textField for the second number 
		*/
		Op.CreateButtonSQRT(frame, textField);
		Op.CreateButtonADD(frame, textField);
		Op.CreateButtonSUB(frame, textField);
		Op.CreateButtonMUL(frame, textField);
		Op.CreateButtonDIV(frame, textField);
		Op.CreateButtonREM(frame, textField);
		
	}
}



