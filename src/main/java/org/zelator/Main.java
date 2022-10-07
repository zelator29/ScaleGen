package org.zelator;

import javax.swing.*;
import java.awt.*;

public class Main
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("ScaleGen");
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(2, 1));
		frame.add(new ScaleSheet());
		frame.add(new ScaleSheet());
		frame.setVisible(true);
	}
}