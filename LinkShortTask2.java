package TaskOfWeek2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class LinkShortTask2 {

	private JFrame frame;
	private JTextField longURLs;
	private JTextField shortURLs;
	
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinkShortTask2 window = new LinkShortTask2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LinkShortTask2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 139, 34));
		frame.setBounds(500, 100, 648, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Paste Your LongURL :-");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 113, 225, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Here is your ShortURL :-");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 313, 225, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		longURLs = new JTextField();
		longURLs.setBounds(245, 113, 356, 41);
		frame.getContentPane().add(longURLs);
		longURLs.setColumns(10);
		
		shortURLs = new JTextField();
		shortURLs.setColumns(10);
		shortURLs.setBounds(245, 313, 356, 41);
		frame.getContentPane().add(shortURLs);
		
		JButton btnNewButton = new JButton("Click to Short it");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String longURL = longURLs.getText();
                String shortURL = ShortClass.generateShortURL(longURL);
                
                shortURLs.setText(shortURL);

                
			}
		});
		btnNewButton.setBounds(299, 201, 230, 52);
		frame.getContentPane().add(btnNewButton);
	}
	
	
}
