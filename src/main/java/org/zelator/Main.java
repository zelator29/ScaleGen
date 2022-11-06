package org.zelator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("ScaleGen");
		frame.setSize(900, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(2, 1));
		frame.add(new MusicStaff());
		frame.add(new GuitarStaff());
		frame.setVisible(true);
	}
}