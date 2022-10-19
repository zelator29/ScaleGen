package org.zelator;

import javax.swing.*;
import java.awt.*;

public abstract class StaffPanel extends JPanel
{
	protected enum TYPE {SINGLE, DOUBLE};

	protected TYPE type = null;
	protected static final Stroke THICK_STROKE = new BasicStroke(3, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL);

	public StaffPanel(TYPE type)
	{
		this.type = type;
	}

	public StaffPanel() {
		this(TYPE.SINGLE);
	}

	protected abstract Color getBackgroundColor();

	public final TYPE getType()
	{
		return this.type;
	}

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

		staffBounds.grow(-15, -15);
		g2.drawRect(staffBounds.x, staffBounds.y, staffBounds.width, staffBounds.height);

		staffBounds.translate(0, -1);


		if (this.type == TYPE.SINGLE)
		{
			int factor = Math.round((int) Math.floor(staffBounds.getHeight()/ 6.0d));
			int increment = factor;

			for (int j = 0; j < 5; j++)
			{
				g2.drawLine(staffBounds.x, staffBounds.y + increment,
						staffBounds.x + staffBounds.width, staffBounds.y + increment);
				increment += factor;
			}
			return;
		}

		int factor = Math.round((int) Math.floor(staffBounds.getHeight()/ 7.0d));
		int increment = factor;

		g2.setStroke(THICK_STROKE);
		for (int j = 0; j < 6; j++)
		{
			g2.drawLine(staffBounds.x, staffBounds.y + increment,
					staffBounds.x + staffBounds.width, staffBounds.y + increment);
			increment += factor;
		}

	}
}
