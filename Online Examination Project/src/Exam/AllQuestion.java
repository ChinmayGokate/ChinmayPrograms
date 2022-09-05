package Exam;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;
import net.proteanit.sql.DbUtils;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class AllQuestion extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllQuestion frame = new AllQuestion();
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
	public AllQuestion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 558);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("All Questions");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(298, 90, 231, 59);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admine.open=0;
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(815, 90, 85, 21);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.setBounds(10, 196, 960, 301);
		contentPane.add(table);
		
	
	
	try {
	Connection con = ConnectionProvider.getcon();
	Statement st = con.createStatement();
	ResultSet rs= st.executeQuery("select * from question");
	table.setModel(DbUtils.resultSetToTableModel(rs));
	
	JLabel lblNewLabel_3 = new JLabel("Online Examination System");
	lblNewLabel_3.setForeground(new Color(153, 51, 51));
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
	lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
	lblNewLabel_3.setBounds(234, 25, 459, 42);
	contentPane.add(lblNewLabel_3);
	
	JLabel lblNewLabel_1 = new JLabel("No.");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1.setBounds(10, 173, 45, 13);
	contentPane.add(lblNewLabel_1);
	
	JLabel lblNewLabel_1_1 = new JLabel("Questions");
	lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1_1.setBounds(153, 173, 70, 13);
	contentPane.add(lblNewLabel_1_1);
	
	JLabel lblNewLabel_1_2 = new JLabel("opt 1");
	lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1_2.setBounds(282, 173, 45, 13);
	contentPane.add(lblNewLabel_1_2);
	
	JLabel lblNewLabel_1_3 = new JLabel("opt 2");
	lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1_3.setBounds(420, 173, 45, 13);
	contentPane.add(lblNewLabel_1_3);
	
	JLabel lblNewLabel_1_4 = new JLabel("opt 3");
	lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1_4.setBounds(559, 173, 45, 13);
	contentPane.add(lblNewLabel_1_4);
	
	JLabel lblNewLabel_1_5 = new JLabel("opt 4");
	lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1_5.setBounds(696, 173, 45, 13);
	contentPane.add(lblNewLabel_1_5);
	
	JLabel lblNewLabel_1_6 = new JLabel("Answer");
	lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_1_6.setBounds(833, 173, 45, 13);
	contentPane.add(lblNewLabel_1_6);
	
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null, e);
	}
}
}
