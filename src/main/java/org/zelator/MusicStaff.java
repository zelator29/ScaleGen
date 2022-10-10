package org.zelator;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class MusicStaff extends StaffPanel
{
	static private final Font MUSIC_FONT = new Font("Bravura", Font.PLAIN, 90);
	static private final AffineTransform scaleTransform = AffineTransform.getScaleInstance(1, 1.15);
	static private final Font ADJ_FONT = MUSIC_FONT.deriveFont(scaleTransform);

	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		// Draw the body of the staff
		Rectangle staffBounds = g2.getClipBounds();
		staffBounds.grow(-25, -25);
		g2.drawRect(staffBounds.x, staffBounds.y, staffBounds.width, staffBounds.height);

		staffBounds.translate(0, -1);
		int factor = Math.round((int) Math.floor(staffBounds.getHeight()/ 6.0d));
		int increment = factor;
		for (int j=0; j < 5; j++) {
			g2.drawLine(staffBounds.x, staffBounds.y + increment,
					staffBounds.x + staffBounds.width, staffBounds.y + increment);
			increment += factor;
		}

		g2.setFont(ADJ_FONT);
		g2.setColor(Color.BLACK);
		g2.drawString("\uD834\uDD1E", 20, 100);
	}

	@Override
	protected Color getBackgroundColor()
	{
		return HTMLColors.FLORAL_WHITE;
	}
}
