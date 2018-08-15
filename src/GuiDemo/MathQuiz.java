package GuiDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MathQuiz {

	private JFrame frame;
	private JTextField num1_1;
	private JTextField num2_1;
	private JTextField ans_1;
	private JTextField num1_2;
	private JTextField num2_2;
	private JTextField ans_2;
	private JTextField num1_3;
	private JTextField num2_3;
	private JTextField ans_3;
	private JTextField num1_4;
	private JTextField num2_4;
	private JTextField ans_4;
	private JTextField num1_5;
	private JTextField num2_5;
	private JTextField ans_5;
	private JLabel lblMath;
	private JButton btnAnswers;
	private JPanel comments_1;
	private JPanel comments_2;
	private JPanel comments_3;
	private JPanel comments_4;
	private JPanel comments_5;

	public void input_num() {

	}

	public int random_num() {

		return ThreadLocalRandom.current().nextInt(0, 10);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathQuiz window = new MathQuiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathQuiz() {
		initialize();

		num1_1.setText(Integer.toString(random_num()));
		num1_2.setText(Integer.toString(random_num()));
		num1_3.setText(Integer.toString(random_num()));
		num1_4.setText(Integer.toString(random_num()));
		num1_5.setText(Integer.toString(random_num()));
		num2_1.setText(Integer.toString(random_num()));
		num2_2.setText(Integer.toString(random_num()));
		num2_3.setText(Integer.toString(random_num()));
		num2_4.setText(Integer.toString(random_num()));
		num2_5.setText(Integer.toString(random_num()));

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(-27, -22, 955, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
				num2_1 = new JTextField();
				num2_1.setBounds(291, 67, 130, 54);
				frame.getContentPane().add(num2_1);
				num2_1.setColumns(10);
		
				ans_2 = new JTextField();
				ans_2.setColumns(10);
				ans_2.setBounds(517, 133, 130, 54);
				frame.getContentPane().add(ans_2);
		
				ans_3 = new JTextField();
				ans_3.setColumns(10);
				ans_3.setBounds(517, 199, 130, 54);
				frame.getContentPane().add(ans_3);
		
				num1_1 = new JTextField();
				num1_1.setBounds(65, 67, 130, 54);
				frame.getContentPane().add(num1_1);
				num1_1.setColumns(10);
		
				num1_3 = new JTextField();
				num1_3.setColumns(10);
				num1_3.setBounds(65, 199, 130, 54);
				frame.getContentPane().add(num1_3);
		
				num2_4 = new JTextField();
				num2_4.setColumns(10);
				num2_4.setBounds(291, 265, 130, 54);
				frame.getContentPane().add(num2_4);
		
				num2_3 = new JTextField();
				num2_3.setColumns(10);
				num2_3.setBounds(289, 199, 130, 54);
				frame.getContentPane().add(num2_3);
		
				ans_5 = new JTextField();
				ans_5.setColumns(10);
				ans_5.setBounds(517, 331, 130, 54);
				frame.getContentPane().add(ans_5);
		
				num2_5 = new JTextField();
				num2_5.setColumns(10);
				num2_5.setBounds(289, 331, 130, 54);
				frame.getContentPane().add(num2_5);
		
				num2_2 = new JTextField();
				num2_2.setColumns(10);
				num2_2.setBounds(289, 133, 130, 54);
				frame.getContentPane().add(num2_2);
		
				ans_1 = new JTextField();
				ans_1.setColumns(10);
				ans_1.setBounds(519, 67, 130, 54);
				frame.getContentPane().add(ans_1);
		
				num1_4 = new JTextField();
				num1_4.setColumns(10);
				num1_4.setBounds(67, 265, 130, 54);
				frame.getContentPane().add(num1_4);
		
				num1_5 = new JTextField();
				num1_5.setColumns(10);
				num1_5.setBounds(65, 331, 130, 54);
				frame.getContentPane().add(num1_5);
		
				num1_2 = new JTextField();
				num1_2.setColumns(10);
				num1_2.setBounds(65, 133, 130, 54);
				frame.getContentPane().add(num1_2);
		
				ans_4 = new JTextField();
				ans_4.setColumns(10);
				ans_4.setBounds(519, 265, 130, 54);
				frame.getContentPane().add(ans_4);
				
				num1_1.setHorizontalAlignment(JTextField.CENTER);
				num1_2.setHorizontalAlignment(JTextField.CENTER);
				num1_3.setHorizontalAlignment(JTextField.CENTER);
				num1_4.setHorizontalAlignment(JTextField.CENTER);
				num1_5.setHorizontalAlignment(JTextField.CENTER);
				num2_1.setHorizontalAlignment(JTextField.CENTER);
				num2_2.setHorizontalAlignment(JTextField.CENTER);
				num2_3.setHorizontalAlignment(JTextField.CENTER);
				num2_4.setHorizontalAlignment(JTextField.CENTER);
				num2_5.setHorizontalAlignment(JTextField.CENTER);
				ans_1.setHorizontalAlignment(JTextField.CENTER);
				ans_2.setHorizontalAlignment(JTextField.CENTER);
				ans_3.setHorizontalAlignment(JTextField.CENTER);
				ans_4.setHorizontalAlignment(JTextField.CENTER);
				ans_5.setHorizontalAlignment(JTextField.CENTER);

		JLabel label = new JLabel("+");
		label.setForeground(Color.RED);
		label.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label.setBounds(224, 82, 17, 16);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("=");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_1.setBounds(468, 86, 17, 16);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("=");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_2.setBounds(466, 152, 17, 16);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("+");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_3.setBounds(222, 148, 17, 16);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("=");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_4.setBounds(466, 218, 17, 16);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("+");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_5.setBounds(222, 214, 17, 16);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("=");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_6.setBounds(468, 284, 17, 16);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("+");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_7.setBounds(224, 280, 17, 16);
		frame.getContentPane().add(label_7);

		JLabel label_8 = new JLabel("=");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_8.setBounds(466, 350, 17, 16);
		frame.getContentPane().add(label_8);

		JLabel label_9 = new JLabel("+");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_9.setBounds(222, 346, 17, 16);
		frame.getContentPane().add(label_9);

		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setBounds(734, 23, 61, 16);
		frame.getContentPane().add(lblNewLabel);

		lblMath = new JLabel("Math For Kids:");
		lblMath.setForeground(Color.BLUE);
		lblMath.setBounds(63, 6, 165, 33);
		frame.getContentPane().add(lblMath);

		btnAnswers = new JButton("Click here for Answers");
		btnAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAnswers.setBounds(324, 436, 249, 29);
		frame.getContentPane().add(btnAnswers);

		comments_1 = new JPanel();
		comments_1.setBounds(692, 67, 241, 54);
		frame.getContentPane().add(comments_1);

		comments_2 = new JPanel();
		comments_2.setBounds(692, 133, 241, 54);
		frame.getContentPane().add(comments_2);

		comments_3 = new JPanel();
		comments_3.setBounds(692, 199, 241, 54);
		frame.getContentPane().add(comments_3);

		comments_4 = new JPanel();
		comments_4.setBounds(692, 265, 241, 54);
		frame.getContentPane().add(comments_4);

		comments_5 = new JPanel();
		comments_5.setBounds(692, 331, 241, 54);
		frame.getContentPane().add(comments_5);
	}
}
