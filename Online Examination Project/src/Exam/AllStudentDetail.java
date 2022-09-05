package Exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AllStudentDetail extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllStudentDetail frame = new AllStudentDetail();
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
	public AllStudentDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(143, 163, 768, 390);
		contentPane.add(table);
		
		
		
		try {
			Connection con = ConnectionProvider.getcon();
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from form");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			JLabel lblNewLabel_3 = new JLabel("Online Examination System");
			lblNewLabel_3.setForeground(new Color(153, 51, 51));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
			lblNewLabel_3.setBounds(254, 10, 459, 42);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblStudentDetails = new JLabel("Student Details");
			lblStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblStudentDetails.setBounds(293, 62, 231, 59);
			contentPane.add(lblStudentDetails);
			
			JLabel lblNewLabel_1 = new JLabel("Course");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(143, 139, 45, 13);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Semister");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_1.setBounds(259, 140, 70, 13);
			contentPane.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Student Name");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_2.setBounds(366, 140, 95, 13);
			contentPane.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_3 = new JLabel("Enrollment no.");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_3.setBounds(477, 139, 95, 13);
			contentPane.add(lblNewLabel_1_3);
			
			JLabel lblNewLabel_1_4 = new JLabel("Clg Name");
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_4.setBounds(591, 139, 95, 13);
			contentPane.add(lblNewLabel_1_4);
			
			JLabel lblNewLabel_1_5 = new JLabel("Student Rollno.");
			lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_5.setBounds(698, 140, 100, 13);
			contentPane.add(lblNewLabel_1_5);
			
			JLabel lblNewLabel_1_6 = new JLabel("Marks");
			lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_6.setBounds(820, 140, 45, 13);
			contentPane.add(lblNewLabel_1_6);
			
			JButton btnNewButton = new JButton("Close");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Admine.open=0;
					setVisible(false);
				
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton.setBounds(889, 29, 85, 21);
			contentPane.add(btnNewButton);
			
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
	}
}
