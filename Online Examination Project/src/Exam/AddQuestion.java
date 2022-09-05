package Exam;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.LinkedBlockingQueue;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class AddQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddQuestion frame = new AddQuestion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	
	
	//PreparedStatement ps;
	
	
	
	public AddQuestion()  {
		//autoid();
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1094, 674);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JLabel2 = new JLabel(); 
		JLabel lblNewLabel = new JLabel("Question");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(55, 201, 111, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblOption = new JLabel("Option1");
		lblOption.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption.setBounds(55, 255, 111, 35);
		contentPane.add(lblOption);
		
		JLabel lblOption_1 = new JLabel("Option2");
		lblOption_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_1.setBounds(55, 312, 111, 35);
		contentPane.add(lblOption_1);
		
		JLabel lblOption_2 = new JLabel("Option3");
		lblOption_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_2.setBounds(55, 374, 111, 35);
		contentPane.add(lblOption_2);
		
		JLabel lblOption_3 = new JLabel("Option4");
		lblOption_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_3.setBounds(55, 441, 111, 35);
		contentPane.add(lblOption_3);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnswer.setBounds(55, 504, 111, 35);
		contentPane.add(lblAnswer);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setBounds(292, 209, 598, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(292, 263, 598, 27);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(292, 320, 598, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(292, 382, 598, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(292, 449, 598, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(292, 512, 598, 27);
		contentPane.add(textField_6);
		
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String name =textField_1.getText();
				String opt1 =textField_2.getText();
				String opt2 =textField_3.getText();
				String opt3 =textField_4.getText();
				String opt4 =textField_5.getText();
				String answer =textField_6.getText();
			
				try {
					Connection con = ConnectionProvider.getcon();
					PreparedStatement ps = con.prepareStatement("insert into question value(?,?,?,?,?,?,?)");
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, opt1);
					ps.setString(4, opt2);
					ps.setString(5, opt3);
					ps.setString(6, opt4);
					ps.setString(7, answer);
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully update");
					setVisible(false);
					new AddQuestion().setVisible(true);
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
		btnNewButton.setBounds(190, 582, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnCleaar = new JButton("Clear");
		btnCleaar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
			textField_6.setText("");
			textField.setText("");
			}
		});
		btnCleaar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCleaar.setBounds(366, 582, 85, 21);
		contentPane.add(btnCleaar);
		
		
		JLabel lblQuestionId = new JLabel("Question Id");
		
		lblQuestionId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuestionId.setBounds(55, 153, 111, 35);
		contentPane.add(lblQuestionId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(166, 160, 55, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Add Question");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(313, 96, 322, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Admine.open=0;
			setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(909, 127, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Online Examination System");
		lblNewLabel_3.setForeground(new Color(153, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(272, 23, 459, 42);
		contentPane.add(lblNewLabel_3);
		
		
		
	}
	
	private void initComponents() {
		// TODO Auto-generated method stub
		
		
		
	}
//	Connection con;
//	public void autoid()
//	{
//		try{
//			con = ConnectionProvider.getcon();
//			String url = "SELECT id from question";
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(url);
//			rs.next();
//			rs.getString("id");
//			if( rs.getString("id")==null)
//			{
//				textField_6.setText("1");
//			}
//			else {
//				String id = rs.getString("id").substring(1, rs.getString("id").length());
//				id =id+1;
//				textField_6.setText("0"+String.format( id));
//			}
//		}
//		catch(Exception e)
//		{
//			JOptionPane.showMessageDialog(null,e);
//			
//		}
//	}

	
}
