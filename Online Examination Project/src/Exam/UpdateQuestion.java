package Exam;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class UpdateQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateQuestion frame = new UpdateQuestion();
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
	public UpdateQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1058, 713);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Update Question");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(264, 88, 322, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblQuestionId = new JLabel(" Question Id");
		lblQuestionId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuestionId.setBounds(84, 151, 111, 35);
		contentPane.add(lblQuestionId);
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(199, 155, 55, 26);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Question");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(142, 207, 111, 35);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(315, 207, 598, 26);
		contentPane.add(textField_1);
		
		JLabel lblOption = new JLabel("Option1");
		lblOption.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption.setBounds(142, 261, 111, 35);
		contentPane.add(lblOption);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(315, 261, 598, 26);
		contentPane.add(textField_2);
		
		JLabel lblOption_1 = new JLabel("Option2");
		lblOption_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_1.setBounds(142, 318, 111, 35);
		contentPane.add(lblOption_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(315, 318, 598, 26);
		contentPane.add(textField_3);
		
		JLabel lblOption_2 = new JLabel("Option3");
		lblOption_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_2.setBounds(142, 380, 111, 35);
		contentPane.add(lblOption_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(315, 380, 598, 26);
		contentPane.add(textField_4);
		
		JLabel lblOption_3 = new JLabel("Option4");
		lblOption_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_3.setBounds(142, 447, 111, 35);
		contentPane.add(lblOption_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(315, 447, 598, 26);
		contentPane.add(textField_5);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnswer.setBounds(146, 512, 111, 35);
		contentPane.add(lblAnswer);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(315, 510, 598, 27);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String name = textField_1.getText();
				String opt1 = textField_2.getText();
				String opt2 = textField_3.getText();
				String opt3 = textField_4.getText();
				String opt4 = textField_5.getText();
				String answer = textField_6.getText();
				
				try {
					Connection con = ConnectionProvider.getcon();
					PreparedStatement ps = con.prepareStatement("update question set name=?,opt1=?,opt2=?,opt3=?,opt4=?,answer=? where id=?");
					ps.setString(7, id);
					ps.setString(1, name);
					ps.setString(2, opt1);
					ps.setString(3, opt2);
					ps.setString(4, opt3);
					ps.setString(5, opt4);
					ps.setString(6, answer);
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully update");
					setVisible(false);
					new UpdateQuestion().setVisible(true);
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
		btnNewButton.setBounds(377, 580, 122, 26);
		contentPane.add(btnNewButton);
		
		JButton btnCleaar = new JButton("Clear");
		btnCleaar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField.setEditable(true);
			}
		});
		btnCleaar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCleaar.setBounds(673, 580, 85, 26);
		contentPane.add(btnCleaar);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admine.open=0;
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(876, 45, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =textField.getText();
				try {
					Connection con =ConnectionProvider.getcon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM question where id = '"+id+"' ");
					if (rs.next()== true) {
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
						textField_4.setText(rs.getString(5));
						textField_5.setText(rs.getString(6));
						textField_6.setText(rs.getString(7));
						textField.setEditable(false);
					}
					else {
						JFrame jf= new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "quetion id does not exist");
						
					}
						
				}
				catch(Exception e1) {
					JFrame jf= new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
			}
			
		});
		btnNewButton_2.setBounds(264, 157, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Online Examination System");
		lblNewLabel_3.setForeground(new Color(153, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(246, 28, 459, 42);
		contentPane.add(lblNewLabel_3);
	}
	
	private void initComponents() {		
	}
}
