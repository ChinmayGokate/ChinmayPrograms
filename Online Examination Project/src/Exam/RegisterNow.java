package Exam;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class RegisterNow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterNow frame = new RegisterNow();
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
	public RegisterNow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 616);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(238, 74, 268, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(103, 152, 111, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(103, 226, 111, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Roll no.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(103, 267, 111, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enrolment no.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(103, 311, 134, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("College Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(103, 348, 111, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(103, 386, 111, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Confirm Password");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(103, 427, 161, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Course");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(103, 188, 111, 13);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(291, 144, 628, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(291, 187, 628, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(291, 225, 628, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(291, 266, 628, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(291, 310, 628, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(291, 347, 628, 26);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textField.getText();
				String course = textField_1.getText();
				String semester = textField_2.getText();
				String rollno = textField_3.getText();
				String enrolmentno = textField_4.getText();
				String collegename = textField_5.getText();
				String password = passwordField.getText();
				String confirmpassword = passwordField_1.getText();
				String emailid = textField_6.getText();
				
				try {
					Connection con = ConnectionProvider.getcon();
					PreparedStatement ps = con.prepareStatement("insert into registrations value(?,?,?,?,?,?,?,?,?)");
					ps.setString(1, name);
					ps.setString(2, course);
					ps.setString(3, semester);
					ps.setString(4, rollno);
					ps.setString(5, enrolmentno);
					ps.setString(6, collegename);
					ps.setString(7, password);
					ps.setString(8, confirmpassword);
					ps.setString(9, emailid);
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Registration Successful");
					}
				catch(Exception e1)
				{
				JFrame jf = new JFrame();
				jf.setAlwaysOnTop(true);
				JOptionPane.showMessageDialog(jf, e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(255, 518, 99, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				passwordField.setText("");
				passwordField_1.setText("");
				textField_6.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(471, 519, 85, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(680, 519, 85, 26);
		contentPane.add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(291, 385, 265, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String password1 = passwordField.getText();
				String password2 = passwordField_1.getText();
				if (!password1.equals(password2))
				{
					JOptionPane.showMessageDialog(null, "Password Not Matched");
				}
			}
		});
		passwordField_1.setBounds(291, 426, 265, 26);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_9 = new JLabel("Email Id");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_9.setBounds(107, 467, 93, 13);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setBounds(291, 466, 265, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Online Examination System");
		lblNewLabel_3_1.setForeground(new Color(153, 51, 51));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3_1.setBounds(232, 10, 459, 42);
		contentPane.add(lblNewLabel_3_1);
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		
		
		
	}
}

