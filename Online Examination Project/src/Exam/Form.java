package Exam;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 523);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setToolTipText("ndd");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Course Name");
		lblNewLabel_3.setBounds(118, 215, 131, 13);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Semester");
		lblNewLabel_4.setBounds(118, 259, 131, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setEditable(false);
		textField_2.setBounds(259, 215, 276, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setEditable(false);
		textField_3.setBounds(259, 255, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String course = textField_2.getText();
				String sem = textField_3.getText();
				String name = textField_1.getText();
				//String course = textField_2.getText();
				//String semester = textField_3.getText();
				String rollno = textField.getText();
				String enrolmentno = textField_4.getText();
				String collegename = textField_5.getText();
				String marks = textField_7.getText();
				Connection con = ConnectionProvider.getcon();
				try {
					Statement st = con.createStatement();
					
					PreparedStatement ps = con.prepareStatement("insert into form value(?,?,?,?,?,?,?)");
					ps.setString(3, name);
					ps.setString(1, course);
					ps.setString(2, sem);
					ps.setString(6, rollno);
					ps.setString(4, enrolmentno);
					ps.setString(5, collegename);
					ps.setString(7, marks);
					ps.execute();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					
					
					ResultSet set = st.executeQuery(" select course,sem from form where course = '"+course+"' and sem = '"+sem+"'");	
						
							setVisible(false);
						new Instruction(rollno).setVisible(true);
						JOptionPane.showMessageDialog(null,"Read Instructions Carefully Before Exam Start");
						
	
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
				}
				
				
				
//				try
//				{
//					
//					String url = " select rollno,password from Registrations where rollno = '"+rollno+"' and password = '"+password+"'";
//					java.sql.Statement st= con.createStatement();
//					ResultSet set = st.executeQuery(url);
//					
				
//				if (textField_2.getText().equal  &&textField_3.getText().equals("sem3"))
//					{
//						setVisible(false);
//						new Instruction().setVisible(true);
//						JOptionPane.showMessageDialog(null,"Read Instructions Carefully Before Exam Start");
//					}
				
//				try{
//					Connection con =ConnectionProvider.getcon();
//				Statement st = con.createStatement();
//				ResultSet rs = st.executeQuery("SELECT * FROM registrations where rollno = '"+rollno+"' ");
//				
//				if (textField_2.setText(rs.getString(2)) && textField_3.setText(rs.getString(3)))
//				{
//					setVisible(false);
//					new Instruction().setVisible(true);
//					JOptionPane.showMessageDialog(null,"Read Instructions Carefully Before Exam Start");
//				}
//				}catch() {
//					
//				}
			}
		});
		
		//;textField_2.getText().equals("Mcm")textField_3.getText().equals("sem3")
		btnNewButton.setBounds(303, 445, 85, 21);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Student Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(118, 177, 117, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Roll no.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(118, 139, 117, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(259, 138, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setEditable(false);
		textField_1.setBounds(259, 176, 276, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				new Home().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(634, 445, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admine.open=0;
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(724, 27, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rollno =textField.getText();
				try {
					Connection con =ConnectionProvider.getcon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM registrations where rollno = '"+rollno+"' ");
					if (rs.next()== true) {
						
						textField_1.setText(rs.getString(1));
						textField_2.setText(rs.getString(2));
						textField_3.setText(rs.getString(3));
						textField_4.setText(rs.getString(5));
						textField_5.setText(rs.getString(6));
						textField_6.setText(rs.getString(4));
						textField.setEditable(false);
					}
					else {
						JFrame jf= new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "roll no does not exist");
						
					}
						
				}
				catch(Exception e1) {
					JFrame jf= new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
				
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(372, 137, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Enrolment no");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(118, 294, 131, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("College Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(118, 336, 117, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Id");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(136, 381, 39, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setBounds(260, 294, 95, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setBounds(259, 336, 276, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setBounds(259, 377, 85, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(833, 447, 1, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Online Examination System");
		lblNewLabel_3_1.setForeground(new Color(153, 51, 51));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3_1.setBounds(165, 10, 459, 42);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your Details");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(193, 73, 322, 35);
		contentPane.add(lblNewLabel_1_1);
	}
}
