package Exam;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Admine extends JFrame {
public static int open=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admine frame = new Admine();
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
	public Admine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 591);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add new question");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if (open==0)
				{
					new AddQuestion().setVisible(true);
					open=1;
				}
				else
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"one form is allready open");
				}
			}
		});
		
		btnNewButton.setBounds(127, 174, 182, 21);
		contentPane.add(btnNewButton);
		
		JButton btnUpdateQuestion = new JButton("Update Question");
		btnUpdateQuestion.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdateQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (open==0)
				{
					new UpdateQuestion().setVisible(true);
					open=1;
				}
				else
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"one form is allready open");
				}
			}
		});
		btnUpdateQuestion.setBounds(127, 216, 182, 21);
		contentPane.add(btnUpdateQuestion);
		
		JButton btnAllQuestions = new JButton("All questions");
		btnAllQuestions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (open==0)
				{
					new AllQuestion().setVisible(true);
					open=1;
				}
				else
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"one form is allready open");
				}
			}
		});
		btnAllQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAllQuestions.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAllQuestions.setBounds(127, 321, 182, 21);
		contentPane.add(btnAllQuestions);
		
		JButton btnDeleteQuestion = new JButton("Delete Question");
		btnDeleteQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (open==0)
				{
					new DeleteQuestion().setVisible(true);
					open=1;
				}
				else
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"one form is allready open");
				}
			}
		});
		btnDeleteQuestion.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeleteQuestion.setBounds(127, 265, 182, 21);
		contentPane.add(btnDeleteQuestion);
		
		JButton btnLogout = new JButton("logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admine.open=0;
				setVisible(false);
			
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogout.setBounds(815, 79, 85, 21);
		contentPane.add(btnLogout);
		
		JButton btnNewButton_1 = new JButton("All Student Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (open==0)
				{
					new AllStudentDetail().setVisible(true);
					open=1;
				}
				else
				{
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"one form is allready open");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(127, 374, 208, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Online Examination System");
		lblNewLabel_3.setForeground(new Color(153, 51, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(220, 10, 459, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\MyDownloads\\Exam1.jpg"));
		lblNewLabel.setBounds(10, 48, 916, 481);
		contentPane.add(lblNewLabel);
	}
}
