package lesson6;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container c = frame.getContentPane();
		JButton btnCountLetter = new JButton("Count Letter");
		JButton btnReverseLetter = new JButton("Reverse Letter");
		JButton btnRemoveDuplicate = new JButton("Remove Duplicate");
		JLabel lblInput = new JLabel("Input");
		JLabel lblOutput = new JLabel("Output");
		JTextField txtInput = new JTextField("", 20);
		JTextField txtOutput = new JTextField("", 20);
		JLabel lblMessage = new JLabel("");

		// lblMessage.setText("Hello kdfldk");
		// lblMessage.setForeground(Color.red);

		frame.setTitle("String Utility");
		frame.setSize(530, 300);
		frame.setVisible(true);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		btnCountLetter.setBounds(50, 20, 200, 40);
		btnReverseLetter.setBounds(50, 70, 200, 40);
		btnRemoveDuplicate.setBounds(50, 120, 200, 40);
		// lblMessage.setBounds(50,122,200,40);

		lblInput.setBounds(275, 25, 200, 30);
		txtInput.setBounds(275, 55, 200, 30);
		lblOutput.setBounds(275, 85, 200, 30);
		txtOutput.setBounds(275, 115, 200, 30);

		c.add(btnCountLetter);
		c.add(btnReverseLetter);
		c.add(btnRemoveDuplicate);
		c.add(lblInput);
		c.add(txtInput);
		c.add(lblOutput);
		c.add(txtOutput);
		// c.add(lblMessage);

		btnCountLetter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

				} else {
					int count = txtInput.getText().length();
					txtOutput.setText(Integer.toString(count));
				}

			}
		});
		btnReverseLetter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

				} else {
					String revString = "";
					for (int i = 0; i < txtInput.getText().trim().length(); i++) {
						revString = txtInput.getText().charAt(i) + revString;
					}
					txtOutput.setText(revString);
				}

			}
		});

		btnRemoveDuplicate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

				} else {
					String remove = "" + txtInput.getText().charAt(0);
					for (int i = 1; i < txtInput.getText().trim().length(); i++) {
						boolean flag = true;
						for (int j = 0; j < remove.length(); j++) {
							if (txtInput.getText().charAt(i) == remove.charAt(j)) {
								flag = false;
							}
						}
						if (flag) {
							remove += txtInput.getText().charAt(i);
						}
					}
					txtOutput.setText(remove);
				}
			}
		});
	}

}
