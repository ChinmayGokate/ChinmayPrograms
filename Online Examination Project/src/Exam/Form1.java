package Exam;

import java.awt.BorderLayout;
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

public class Form1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 frame = new Form1();
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
	public Form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setToolTipText("ndd");
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Course Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(86, 148, 131, 13);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Semester");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(86, 192, 131, 13);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Subject Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(86, 229, 117, 19);
		contentPane_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(227, 147, 96, 19);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(227, 191, 96, 19);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(227, 229, 96, 19);
		contentPane_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String course = textField.getText();
				String sem =textField_1.getText();
				String subject =textField_2.getText();
//				String opt2 =textField_3.getText();
//				String opt3 =textField_4.getText();
//				String opt4 =textField_5.getText();
//				String answer =textField_6.getText();
			
				try {
					Connection con = ConnectionProvider.getcon();
					PreparedStatement ps = con.prepareStatement("insert into form value(?,?,?)");
					ps.setString(1, course);
					ps.setString(2, sem);
					ps.setString(3, subject);
//					ps.setString(4, opt2);
//					ps.setString(5, opt3);
//					ps.setString(6, opt4);
//					ps.setString(7, answer);
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully save");
					setVisible(false);
					new AddQuestion().setVisible(true);
					}
				catch(Exception e1)
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
				
				setVisible(false);
				new AddQuestion().setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(161, 309, 85, 21);
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(626, 72, 85, 21);
		contentPane_1.add(btnNewButton_2);
	}

}
