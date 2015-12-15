package lesson7;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Question1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container c = frame.getContentPane();
		frame.setTitle("Matrix Conversion Assistant");
		frame.setSize(600, 300);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel lblMile = new JLabel("Mile :", SwingConstants.RIGHT);
		JLabel lblPound = new JLabel("Pound :", SwingConstants.RIGHT);
		JLabel lblGallon = new JLabel("Gallon :", SwingConstants.RIGHT);
		JLabel lblFahrenheit = new JLabel("Fahrenheit :", SwingConstants.RIGHT);

		JLabel lblKilometer = new JLabel("Kilometer :", SwingConstants.RIGHT);
		JLabel lblKilogram = new JLabel("Kilogram :", SwingConstants.RIGHT);
		JLabel lblLiter = new JLabel("Liter :", SwingConstants.RIGHT);
		JLabel lblCentigrade = new JLabel("Centigrade :", SwingConstants.RIGHT);

		JTextField txtMile = new JTextField();
		JTextField txtPound = new JTextField();
		JTextField txtGallon = new JTextField();
		JTextField txtFahrenheit = new JTextField();

		JTextField txtKilometer = new JTextField();
		JTextField txtKilogram = new JTextField();
		JTextField txtLiter = new JTextField();
		JTextField txtCentigrade = new JTextField();

		JLabel lblMessage = new JLabel("Message");
		JButton btnConvert = new JButton("Convert");

		lblMile.setBounds(10, 10, 100, 30);
		lblPound.setBounds(10, 40, 100, 30);
		lblGallon.setBounds(10, 70, 100, 30);
		lblFahrenheit.setBounds(10, 100, 100, 30);

		txtMile.setBounds(140, 10, 100, 30);
		txtPound.setBounds(140, 40, 100, 30);
		txtGallon.setBounds(140, 70, 100, 30);
		txtFahrenheit.setBounds(140, 100, 100, 30);

		lblKilometer.setBounds(230, 10, 100, 30);
		lblKilogram.setBounds(230, 40, 100, 30);
		lblLiter.setBounds(230, 70, 100, 30);
		lblCentigrade.setBounds(230, 100, 100, 30);

		txtKilometer.setBounds(350, 10, 100, 30);
		txtKilogram.setBounds(350, 40, 100, 30);
		txtLiter.setBounds(350, 70, 100, 30);
		txtCentigrade.setBounds(350, 100, 100, 30);

		btnConvert.setBounds(200, 140, 100, 30);
		// lblMessage.setBounds(610, 10, 100, 50);

		c.add(lblMile);
		c.add(lblPound);
		c.add(lblGallon);
		c.add(lblFahrenheit);

		c.add(txtMile);
		c.add(txtPound);
		c.add(txtGallon);
		c.add(txtFahrenheit);

		c.add(lblKilometer);
		c.add(lblKilogram);
		c.add(lblLiter);
		c.add(lblCentigrade);

		c.add(txtKilometer);
		c.add(txtKilogram);
		c.add(txtLiter);
		c.add(txtCentigrade);

		c.add(btnConvert);

		btnConvert.addActionListener(evt -> {
			if (txtMile.getText() != "") {
				double mile = Double.parseDouble(txtMile.getText()) * 1.60934;
				txtKilometer.setText(mile + "");
			}
			if (txtPound.getText() != "") {

				double pound = (Double.parseDouble(txtPound.getText()) * 0.453592);
				txtKilogram.setText(Double.toString(pound));
			}
			if (txtGallon.getText() != "") {
				double gallon = (Double.parseDouble(txtGallon.getText()) * 3.78541);
				txtLiter.setText(Double.toString(gallon));
			}
			if (txtFahrenheit.getText() != "") {
				double frh = ((Double.parseDouble(txtFahrenheit.getText()) - 32) / 1.8000);
				txtCentigrade.setText(Double.toString(Math.round(frh)));
			}

		});

	}

}
