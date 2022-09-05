package Exam;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;
import java.awt.SystemColor;
import java.awt.Color;

public class Exam extends JFrame {

	public String questionId ="1";
	public String answer;
	public String studentAnswer="";
	
	public int marks=0;
	private JLabel lblNewLabel_7_2;
	private Window btnNext;
	
	public void answerCheck() {
		 //String studentAnswer="";
		if (textField_14.equals(answer))
		{
			studentAnswer=textField_14.getText();
		}
//		else
//		{
//			
//		}
//		else if(textField_14.isSelected())
//		{
//			studentAnswer=rdbtnNewRadioButton_2.getText();
//		}
//		else
//		{
//			studentAnswer=rdbtnNewRadioButton_3.getText();
//		}
		
		//if (studentAnswer.equals(answer)) {
			marks=marks+1;
			String marks1 = String.valueOf(marks);
			//textField_8.setText(marks1);
		//}
	int questionId1 = Integer.parseInt(questionId);
	questionId1 =questionId1+1;
	questionId=String.valueOf(questionId1);
	
//	rdbtnNewRadioButton.setSelected(false);
//	rdbtnNewRadioButton_1.setSelected(false);
//	rdbtnNewRadioButton_2.setSelected(false);
//	rdbtnNewRadioButton_3.setSelected(false);
		
	if (questionId.equals("10")) {
		btnNext.setVisible(false);
	}
	}
	public void question() {

		try {
			java.sql.Connection con = ConnectionProvider.getcon();
			Statement st = con.createStatement();
			
			ResultSet rs1=st.executeQuery("select * from question where id ='"+questionId+"'");
			while (rs1.next())
			{
				textField_6.setText(rs1.getString(1));
				textField_9.setText(rs1.getString(2));
				textField_10.setText(rs1.getString(3));
				textField_11.setText(rs1.getString(4));
				textField_12.setText(rs1.getString(5));
				textField_13.setText(rs1.getString(6));
				answer=rs1.getString(7);
			}
		}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
	public void submit() {
		String rollno = textField_1.getText();
		//answerCheck();
		try {
			java.sql.Connection con = ConnectionProvider.getcon();
			Statement st = con.createStatement();
			st.executeUpdate("update form set marks='"+marks+"'where rollno='"+rollno+"'");
			String marks1=String.valueOf(marks);
			JOptionPane.showMessageDialog(null, "exam submited");
		}
		catch(Exception e1) {
			//JOptionPane.showMessageDialog(null, e1);
			e1.printStackTrace();
		}
	}
	
	private JPanel contentPane;
//	private JRadioButton rdbtnNewRadioButton;
//	private JRadioButton rdbtnNewRadioButton_1;
//	private JRadioButton rdbtnNewRadioButton_2;
//	private JRadioButton rdbtnNewRadioButton_3;
//	private JTextField textField_7;
//	private JLabel lblNewLabel_7_3;
//	private JLabel lblNewLabel_7_4;
//	private JLabel lblNewLabel_7_5;
//	private JLabel lblNewLabel_7_6;
//	private JLabel lblNewLabel_7_7;
//	private JLabel lblNewLabel_7_8;
//	private JLabel lblNewLabel_7;
//	private JLabel lblNewLabel_8;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
//	private JTextField textField_8;
	private JTextField textField_9;
	//private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam frame = new Exam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */public Exam(){
		 Exam();
	 }
	 
	 public Exam(String rollno){
		 Exam();
		textField_1.setText(rollno);
		try {
			java.sql.Connection con = ConnectionProvider.getcon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from registrations where rollno ='"+rollno+"'");
			while (rs.next())
			{
				textField.setText(rs.getString(1));
				textField_2.setText(rs.getString(5));
				textField_3.setText(rs.getString(2));
				textField_4.setText(rs.getString(6));
				textField_5.setText(rs.getString(3));
				
			}
			ResultSet rs1=st.executeQuery("select * from question where id = '"+questionId+"'" );
			while (rs1.next())
			{
				textField_6.setText(rs1.getString(1));
				textField_9.setText(rs1.getString(2));
				textField_10.setText(rs1.getString(3));
				textField_11.setText(rs1.getString(4));
				textField_12.setText(rs1.getString(5));
				textField_13.setText(rs1.getString(6));
				answer=rs1.getString(7);
			}
		}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		
//		 setLocationRelativeTo(this);
//		 time = new javax.swing.Timer(1000, action);
		 
	 }
	public void Exam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 623);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_14.setText("");
				answerCheck();
				question();
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setBounds(286, 492, 85, 29);
		contentPane.add(btnNext);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "do you really want to submit","select",JOptionPane.YES_NO_OPTION);
				if (a==0) 
				{
					//answerCheck();
					submit();
				}
			}});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBounds(680, 492, 119, 29);
		contentPane.add(btnSubmit);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(26, 152, 980, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(29, 11, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Enrolment no.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(29, 29, 119, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("College Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 48, 104, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Roll No.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(591, 12, 67, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Course");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(591, 30, 67, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(591, 49, 85, 13);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(158, 10, 212, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setBounds(703, 11, 104, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(158, 28, 212, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(703, 29, 104, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(158, 47, 212, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(703, 48, 104, 19);
		panel.add(textField_5);
		
		JLabel lblNewLabel_6 = new JLabel("No.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(149, 275, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(182, 273, 34, 19);
		contentPane.add(textField_6);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(253, 272, 434, 21);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_10.setBounds(253, 303, 243, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_11.setColumns(10);
		textField_11.setBounds(253, 333, 243, 21);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_12.setColumns(10);
		textField_12.setBounds(253, 364, 243, 21);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_13.setColumns(10);
		textField_13.setBounds(253, 395, 243, 21);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_14.setBounds(330, 436, 332, 19);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Type Correct Answer");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(183, 434, 137, 21);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Online Examination System");
		lblNewLabel_8.setForeground(new Color(153, 51, 51));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_8.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_8.setBounds(255, 10, 459, 42);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Exam Starts");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_9.setBounds(286, 70, 322, 35);
		contentPane.add(lblNewLabel_9);
		
		btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admine.open=0;
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(897, 29, 85, 21);
		contentPane.add(btnNewButton);

		

		
		
		
	}
}









//JButton btnNewButton = new JButton("load");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				 
//					try {
//						java.sql.Connection con = ConnectionProvider.getcon();
//						Statement st = con.createStatement();
//						ResultSet rs=st.executeQuery("select * from question ");
//						while (rs.next())
//						{
//							textField_2.setText(rs.getString(2));
//							rdbtnNewRadioButton.setText(rs.getString(3));
//							rdbtnNewRadioButton_1.setText(rs.getString(4));
//							rdbtnNewRadioButton_2.setText(rs.getString(5));
//							rdbtnNewRadioButton_3.setText(rs.getString(6));
//							answer=rs.getString(7);
//						}
//					}
//						catch(Exception e1) {
//							JOptionPane.showMessageDialog(null, e1);
//						}
//				
//				
//			}
//		});
