package GuiDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class Frame1 {

	private JFrame frmFirstGuiProgram;

	public JLabel lblmessage1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmFirstGuiProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFirstGuiProgram = new JFrame();
		frmFirstGuiProgram.setTitle("First GUI Program");
		frmFirstGuiProgram.setBounds(100, 100, 450, 300);
		frmFirstGuiProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnPressMe = new JButton("Press Me ");
		btnPressMe.setForeground(Color.ORANGE);
		btnPressMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "Hi this is my first GUI program");
				// lblmessage.setForeground(null);
				// ("Hi this is my first GUI program");
				// lblmessage.setText("Hello how are you ??????");
				JLabel lblmessage1 = new JLabel();
				lblmessage1.setBounds(46, 26, 281, 38);
				frmFirstGuiProgram.getContentPane().add(lblmessage1);
				lblmessage1.setText("Hello how are you ??????");
			
				btnPressMe.setText("I have changed to Exit");
				initialize();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmFirstGuiProgram.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(146)
					.addComponent(btnPressMe)
					.addContainerGap(201, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(147, Short.MAX_VALUE)
					.addComponent(btnPressMe)
					.addGap(102))
		);
		frmFirstGuiProgram.getContentPane().setLayout(groupLayout);

	}

}
