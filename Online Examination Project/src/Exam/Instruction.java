package Exam;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Instruction extends JFrame {

	private JPanel contentPane;

	public String rollno="0";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instruction frame = new Instruction();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */public Instruction(String rollno1){
		 rollno=rollno1;
		 Instruction();
		 //JOptionPane.showMessageDialog(null, rollno1);
	 }
	public void Instruction() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 596);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Exam(rollno).setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(235, 356, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Instructions");
		lblNewLabel.setForeground(new Color(255, 255, 51));
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 33));
		lblNewLabel.setBounds(126, 88, 200, 50);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrTheExamination = new JTextArea();
		txtrTheExamination.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrTheExamination.setEditable(false);
		txtrTheExamination.setText("1. The examination will comprise of Objective type Multiple Choice Questions (MCQs)\r\n2. All questions are compulsory and each carries One mark.\r\n3. The total number of questions, duration of examination, will be different based on\r\nthe course, the detail is available on your screen.\r\n4. The Subjects or topics covered in the exam will be as per the Syllabus.\r\n5. There will be no negative marking for the wrong answers.");
		txtrTheExamination.setBounds(39, 160, 588, 136);
		contentPane.add(txtrTheExamination);
		
		JLabel lblNewLabel_3 = new JLabel("Online Examination System");
		lblNewLabel_3.setForeground(new Color(153, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(168, 10, 459, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\MyDownloads\\Exam1.jpg"));
		lblNewLabel_1.setBounds(20, 75, 817, 458);
		contentPane.add(lblNewLabel_1);
		
	}

	public Instruction() {
		Instruction();
	}
}
