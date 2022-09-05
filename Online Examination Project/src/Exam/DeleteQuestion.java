package Exam;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class DeleteQuestion extends JFrame {

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
					DeleteQuestion frame = new DeleteQuestion();
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
	public DeleteQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1027, 652);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Online Examination System");
		lblNewLabel_3.setForeground(new Color(153, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(202, 0, 459, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Question");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(286, 69, 322, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =textField.getText();
				try {
					java.sql.Connection con =ConnectionProvider.getcon();
					java.sql.Statement st = con.createStatement();
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
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(307, 137, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admine.open=0;
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(891, 31, 85, 21);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(214, 135, 55, 19);
		contentPane.add(textField);
		
		JLabel lblQuestionId = new JLabel(" Question Id");
		lblQuestionId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuestionId.setBounds(49, 125, 111, 35);
		contentPane.add(lblQuestionId);
		
		JLabel lblNewLabel = new JLabel("Question");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(49, 176, 111, 35);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(286, 184, 598, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(286, 238, 598, 19);
		contentPane.add(textField_2);
		
		JLabel lblOption = new JLabel("Option1");
		lblOption.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption.setBounds(49, 230, 111, 35);
		contentPane.add(lblOption);
		
		JLabel lblOption_1 = new JLabel("Option2");
		lblOption_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_1.setBounds(49, 287, 111, 35);
		contentPane.add(lblOption_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(286, 295, 598, 19);
		contentPane.add(textField_3);
		
		JLabel lblOption_2 = new JLabel("Option3");
		lblOption_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_2.setBounds(49, 349, 111, 35);
		contentPane.add(lblOption_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(286, 357, 598, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(286, 424, 598, 19);
		contentPane.add(textField_5);
		
		JLabel lblOption_3 = new JLabel("Option4");
		lblOption_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOption_3.setBounds(49, 416, 111, 35);
		contentPane.add(lblOption_3);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnswer.setBounds(49, 479, 111, 35);
		contentPane.add(lblAnswer);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(286, 487, 598, 19);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id= textField.getText();
				try {
					java.sql.Connection con = ConnectionProvider.getcon();
					PreparedStatement ps = con.prepareStatement("delete from question where id =?");
					ps.setString(1,id);
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully update");
					setVisible(false);
					new DeleteQuestion().setVisible(true);
				}
				catch(Exception e1) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(184, 557, 85, 21);
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
		btnCleaar.setBounds(360, 557, 85, 21);
		contentPane.add(btnCleaar);
	}

	
}
