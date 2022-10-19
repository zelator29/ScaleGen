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
