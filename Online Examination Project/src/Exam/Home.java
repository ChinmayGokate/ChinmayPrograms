package Exam;
import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 621);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Id / Roll No.");
		lblNewLabel.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Online Examination Project\\src\\Login.png"));
		lblNewLabel.setBounds(398, 323, 166, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Online Examination Project\\src\\Password.png"));
		lblNewLabel_1.setBounds(398, 377, 102, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Online Examination Project\\src\\Login.png"));
		btnNewButton.setBounds(321, 500, 108, 29);
		btnNewButton.addActionListener(new ActionListener() {
			

			 

			Connection con= null;

			public void actionPerformed(ActionEvent e) {
				String rollno = textField.getText();
				String password = passwordField.getText();
				
				con = ConnectionProvider.getcon();
				try
				{
					
					String url = " select rollno,password from Registrations where rollno = '"+rollno+"' and password = '"+password+"'";
					java.sql.Statement st= con.createStatement();
					ResultSet set = st.executeQuery(url);
					
					if (set.next())
						{		
							JOptionPane.showMessageDialog(null,"Student login");
							setVisible(false);
							new Form().setVisible(true);
						}
					else if(textField.getText().equals("123") && passwordField.getText().equals("123"))
						{
							JOptionPane.showMessageDialog(null,"Admin Login Sucessfully");
							setVisible(false);
							new Admine().setVisible(true);
						}
					else 
						{
							JOptionPane.showMessageDialog(null,"Invalid Roll No. OR Password");
						}
				}
				catch( Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Online Examination Project\\src\\Back.png"));
		btnNewButton_1.setBounds(535, 500, 102, 29);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(398, 348, 146, 25);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show");
		chckbxNewCheckBox.setBounds(402, 438, 66, 21);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
				else
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		contentPane.add(chckbxNewCheckBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(398, 407, 146, 25);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(passwordField);
		
		JButton btnNewButton_2 = new JButton("Register Now");
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterNow().setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Online Examination Project\\src\\register.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(384, 158, 174, 31);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Online Examination System");
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setForeground(new Color(153, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(255, 10, 459, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Eclipse Workspace\\Online Examination Project\\src\\Exam2.jpg"));
		lblNewLabel_2.setBounds(23, 62, 935, 522);
		contentPane.add(lblNewLabel_2);
	}
}


