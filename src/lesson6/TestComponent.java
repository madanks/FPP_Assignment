package lesson6;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestComponent {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container c= frame.getContentPane();
		JLabel lblUserName = new JLabel("Username :");
		JLabel lblPassword = new JLabel("Password");
		JTextField txtUsername = new JTextField("", 20);
		JTextField txtPassword = new JTextField("", 20);
		JButton btnLogin = new JButton("Login");
		JButton btnRegister = new JButton("Register");
		JLabel lblMessage = new JLabel("");

		frame.setSize(350, 200);
		frame.setVisible(true);
		frame.setTitle("Login Screen");
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		lblUserName.setBounds(50, 10, 100, 20);
		txtUsername.setBounds(150,10,100,20);
		lblPassword.setBounds(50, 40, 100, 20);
		txtPassword.setBounds(150,40,100,20);
		btnLogin.setBounds(50,70,80,20);
		btnRegister.setBounds(150,70,90,20);
		c.add(lblUserName);
		c.add(txtUsername);
		c.add(lblPassword);
		c.add(txtPassword);
		c.add(btnLogin);
		c.add(btnRegister);
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});



	}

}
