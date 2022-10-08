package org.zelator;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TabStaff extends StaffPanel
{
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		Font font = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
		g2.setFont(font);
		g2.drawString("T", 60, 50);
		g2.drawString("A", 60, 70);
		g2.drawString("B", 60, 90);
	}

	@Override
	protected Color getBackgroundColor()
	{
		return Color.GRAY.brighter();
	}
}