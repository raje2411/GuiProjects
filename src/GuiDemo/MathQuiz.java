package GuiDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MathQuiz {
	public int[] num1;
	public int[] num2;
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
	public int collect_answer_arry[], correct_answer_arry[];
	private JLabel lblComment1;
	private JLabel lblComment2;
	private JLabel lblComment3;
	private JLabel lblComment4;
	private JLabel lblComment5;
	public JLabel[] lblComment;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel lblNewLabel;

	public void collect_answers(int answers, int position) {
		collect_answer_arry[position] = answers;
		return;
	}

	public void math(int num1[], int num2[]) {

		for (int i = 0; i < 5; i++) {
			correct_answer_arry[i] = num1[i] + num2[i];

		}

	}

	public int random_num() {

		return ThreadLocalRandom.current().nextInt(0, 10);
	}

	public void validate_and_print_message() {

		lblComment = new JLabel[] { lblComment1, lblComment2, lblComment3, lblComment4, lblComment5 };
		//ImageIcon image = new ImageIcon(getClass().getResource("/Users/rraman/Desktop/Java_program/GuiDemo/src/GuiDemo/"  + ".gif"));
		for (int j = 0; j < 5; j++) {
			if (collect_answer_arry[j] == correct_answer_arry[j]) {
				lblComment[j].setText("CORRECT");
				//lblComment[j].setIcon(image);
			} else {
				lblComment[j].setText("Wrong TARUN " + num1[j] + " +  " + num2[j] + " = " + correct_answer_arry[j]);
			}
		}

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
					System.out.println("hey something wrong in try catch in main function");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathQuiz() {

		num1 = new int[5];
		num2 = new int[5];
		collect_answer_arry = new int[5];
		correct_answer_arry = new int[5];

		initialize();

		num1[0] = random_num();
		num1_1.setText(Integer.toString(num1[0]));

		num1[1] = random_num();
		num1_2.setText(Integer.toString(num1[1]));

		num1[2] = random_num();
		num1_3.setText(Integer.toString(num1[2]));

		num1[3] = random_num();
		num1_4.setText(Integer.toString(num1[3]));

		num1[4] = random_num();
		num1_5.setText(Integer.toString(num1[4]));

		num2[0] = random_num();
		num2_1.setText(Integer.toString(num2[0]));

		num2[1] = random_num();
		num2_2.setText(Integer.toString(num2[1]));

		num2[2] = random_num();
		num2_3.setText(Integer.toString(num2[2]));

		num2[3] = random_num();
		num2_4.setText(Integer.toString(num2[3]));

		num2[4] = random_num();
		num2_5.setText(Integer.toString(num2[4]));

		// computing the value math() for the questions.
		math(num1, num2);

		lblComment1 = new JLabel("");
		lblComment1.setIcon(null);
		lblComment1.setBackground(Color.WHITE);
		lblComment1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblComment1.setForeground(new Color(0, 0, 0));
		lblComment1.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment1.setBounds(685, 71, 242, 46);
		frame.getContentPane().add(lblComment1);

		lblComment2 = new JLabel("");
		lblComment2.setIcon(null);
		lblComment2.setBackground(Color.WHITE);
		lblComment2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblComment2.setForeground(new Color(0, 0, 0));
		lblComment2.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment2.setBounds(685, 133, 242, 46);
		frame.getContentPane().add(lblComment2);

		lblComment3 = new JLabel("");
		lblComment3.setIcon(null);
		lblComment3.setBackground(Color.WHITE);
		lblComment3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblComment3.setForeground(new Color(0, 0, 0));
		lblComment3.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment3.setBounds(685, 207, 242, 46);
		frame.getContentPane().add(lblComment3);

		lblComment4 = new JLabel("");
		lblComment4.setIcon(null);
		lblComment4.setBackground(Color.WHITE);
		lblComment4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblComment4.setForeground(new Color(0, 0, 0));
		lblComment4.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment4.setBounds(685, 273, 242, 46);
		frame.getContentPane().add(lblComment4);

		lblComment5 = new JLabel("");
		lblComment5.setIcon(null);
		lblComment5.setBackground(Color.WHITE);
		lblComment5.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblComment5.setForeground(new Color(0, 0, 0));
		lblComment5.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment5.setBounds(685, 339, 242, 46);
		frame.getContentPane().add(lblComment5);
		
		JButton btnAnotherQuiz = new JButton("Another Quiz ?");
		btnAnotherQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathQuiz.main(new String[] {});

			}
		});
		btnAnotherQuiz.setBounds(65, 545, 117, 29);
		frame.getContentPane().add(btnAnotherQuiz);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{num1_1, lblComment4, num2_1, ans_2, ans_3, num1_3, num2_4, num2_3, ans_5, num2_5, num2_2, ans_1, num1_4, num1_5, num1_2, ans_4, label, label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_8, label_9, lblNewLabel, lblMath, btnAnswers, lblComment1, lblComment2, lblComment3, lblComment5, btnAnotherQuiz}));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 204, 255));
		frame.setForeground(Color.BLUE);
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

		label = new JLabel("+");
		label.setForeground(Color.RED);
		label.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label.setBounds(224, 82, 17, 16);
		frame.getContentPane().add(label);

		label_1 = new JLabel("=");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_1.setBounds(468, 86, 17, 16);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("=");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_2.setBounds(466, 152, 17, 16);
		frame.getContentPane().add(label_2);

		label_3 = new JLabel("+");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_3.setBounds(222, 148, 17, 16);
		frame.getContentPane().add(label_3);

		label_4 = new JLabel("=");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_4.setBounds(466, 218, 17, 16);
		frame.getContentPane().add(label_4);

		label_5 = new JLabel("+");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_5.setBounds(222, 214, 17, 16);
		frame.getContentPane().add(label_5);

		label_6 = new JLabel("=");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_6.setBounds(468, 284, 17, 16);
		frame.getContentPane().add(label_6);

		label_7 = new JLabel("+");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_7.setBounds(224, 280, 17, 16);
		frame.getContentPane().add(label_7);

		label_8 = new JLabel("=");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_8.setBounds(466, 350, 17, 16);
		frame.getContentPane().add(label_8);

		label_9 = new JLabel("+");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		label_9.setBounds(222, 346, 17, 16);
		frame.getContentPane().add(label_9);

		lblNewLabel = new JLabel("Answer");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setBounds(734, 23, 61, 16);
		frame.getContentPane().add(lblNewLabel);

		lblMath = new JLabel("Math Quiz For Kids:");
		lblMath.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMath.setForeground(Color.BLUE);
		lblMath.setBounds(63, 6, 165, 33);
		frame.getContentPane().add(lblMath);

		btnAnswers = new JButton("Click here for Answers");

		btnAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// collecting the Answers data and sending to method to store in array

				/*
				 * collect_answer_arry[0] = Integer.parseInt(ans_1.getText());
				 * collect_answer_arry[1] = Integer.parseInt(ans_2.getText());
				 * collect_answer_arry[2] = Integer.parseInt(ans_3.getText());
				 * collect_answer_arry[3] = Integer.parseInt(ans_4.getText());
				 * collect_answer_arry[4] = Integer.parseInt(ans_5.getText());
				 */

				collect_answers(Integer.parseInt(ans_1.getText()), 0);
				collect_answers(Integer.parseInt(ans_2.getText()), 1);
				collect_answers(Integer.parseInt(ans_3.getText()), 2);
				collect_answers(Integer.parseInt(ans_4.getText()), 3);
				collect_answers(Integer.parseInt(ans_5.getText()), 4);
				//

				// validate_and_print_message();
				//

				// computing the value math() for the questions.

				// math(num1,num2);
				// lblComment1.setText("Yes math is processed");

				validate_and_print_message();

			}
		});
		btnAnswers.setBounds(324, 436, 249, 29);
		frame.getContentPane().add(btnAnswers);
	}
}
