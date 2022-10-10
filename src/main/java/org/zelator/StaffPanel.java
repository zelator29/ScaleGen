package org.zelator;

import javax.swing.*;
import java.awt.*;

public abstract class StaffPanel extends JPanel
{
	protected abstract Color getBackgroundColor();

	@Override
	public void addNotify()
	{
		super.addNotify();
		this.setBackground(getBackgroundColor());
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// Draw the top line of the staff
		Rectangle staffBounds = g2.getClipBounds();
		staffBounds.grow(-10, -10);
		g2.drawRect(staffBounds.x, staffBounds.y, staffBounds.width, staffBounds.height);
	}
}
