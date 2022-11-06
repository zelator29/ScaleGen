package org.zelator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.BasicStroke.CAP_BUTT;
import static org.zelator.HTMLColors.LAVENDER_BLUSH;
import static org.zelator.HTMLColors.FRET_METAL;

public class GuitarStaff extends StaffPanel
{
	static BufferedImage GUITAR_NECK_IMAGE = null;
	static
	{
		try
		{
			GUITAR_NECK_IMAGE = ImageIO.read(new File("src/main/resources/guitar-neck.jpg"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public GuitarStaff()
	{
		super(TYPE.DOUBLE);
	}
	@Override
	protected Color getBackgroundColor()
	{
		return LAVENDER_BLUSH;
	}
	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// Draw the top line of the staff
		Rectangle staffBounds = g2.getClipBounds();
		staffBounds.grow(-10, -10);
		g2.drawRect(staffBounds.x, staffBounds.y, staffBounds.width, staffBounds.height);
		//g2.setPaint(this.getBackgroundColor());
		//g2.fillRect(staffBounds.x, staffBounds.y, staffBounds.width, staffBounds.height);
		staffBounds.grow(-10, -10);
		g2.drawImage(GUITAR_NECK_IMAGE, 20, 20,
				staffBounds.width, staffBounds.height,null);
		g2.setPaint(FRET_METAL);
		g2.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 1f, null, 0));
		g2.drawLine(staffBounds.x + 100, staffBounds.y, staffBounds.x + 100, staffBounds.y + staffBounds.height);
		g2.drawLine(staffBounds.x + 200, staffBounds.y, staffBounds.x + 200, staffBounds.y + staffBounds.height);
		g2.drawLine(staffBounds.x + 300, staffBounds.y, staffBounds.x + 300, staffBounds.y + staffBounds.height);

		/*
		float distance = 18;
		float scale = 0.75f;
		for (int fret = 1; fret <= 16; fret++)
		{
			float location = scale - distance;
			float scaling_factor = location / 5f;
			distance = distance + scaling_factor;
			System.out.println("Distance to fret " + fret + " is " + distance);
		}



		d=s(1 -exp(-kn))

where:

k = 5.71584144995393e-2.
		 */

	}
}
