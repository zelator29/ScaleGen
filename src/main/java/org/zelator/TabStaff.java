package org.zelator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TabStaff extends StaffPanel
{
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		Font font = new Font("Rockwell Extra Bold", Font.PLAIN, 30);
		g2.setFont(font);
		g2.drawString("T", 40, 50);
		g2.drawString("A", 40, 80);
		g2.drawString("B", 40, 110);
	}

	@Override
	protected Color getBackgroundColor()
	{
		return HTMLColors.ALICE_BLUE;
	}
}