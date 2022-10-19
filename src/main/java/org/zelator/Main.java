package org.zelator;

import javax.swing.*;
import java.awt.*;

public class Main
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("ScaleGen");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(2, 1));
		frame.add(new MusicStaff());
		frame.add(new GuitarStaff());
		frame.setVisible(true);
	}
}