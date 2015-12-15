package lesson6;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container c= frame .getContentPane();
		JLabel lblMessage = new JLabel("");
		JButton one=new JButton("");
		JButton two=new JButton("");
		JButton three=new JButton("");
		JButton four=new JButton("");
		JButton five=new JButton("");
		JButton six=new JButton("");
		JButton seven=new JButton("");
		
		one.setPreferredSize(new Dimension(200,200));
		one.setBackground(Color.RED);
		two.setPreferredSize(new Dimension(200,200));
		two.setBackground(Color.ORANGE);
		three.setPreferredSize(new Dimension(200,200));
		three.setBackground(Color.YELLOW);
		four.setPreferredSize(new Dimension(200,200));
		four.setBackground(Color.GREEN);
		five.setPreferredSize(new Dimension(200,200));
		five.setBackground(Color.BLUE);
		six.setPreferredSize(new Dimension(200,200));
		six.setBackground(Color.decode("#4B0082"));
		seven.setPreferredSize(new Dimension(200,200));
		seven.setBackground(Color.decode("#EE82EE"));
		
		frame.setTitle("Rainbow Color Frame");
		frame.setVisible(true);
		frame.setSize(1500, 300);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		c.add(one);
		c.add(two);
		c.add(three);
		c.add(four);
		c.add(five);
		c.add(six);
		c.add(seven);
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Red signifies passion, vitality, enthusiasm and security.");
				
			}
		});
		two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Orange signifies creativity, practicality, playfulness as well as equilibrium or control");
				
			}
		});
		three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Yellow Signifies clarity of thought, wisdom, orderliness and energy");
				
			}
		});
		four.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "This is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth");
				
			}
		});
		five.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "This the fifth color of the rainbow which makes us think of the Unknown.");
				
			}
		});
		six.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Indigo is mystical as it bridges the Gap between Finite and Infinite.");
				
			}
		});
		seven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "violet are associated with sorrow.");
				
			}
		});

	}

}
