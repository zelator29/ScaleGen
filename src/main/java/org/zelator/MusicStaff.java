package org.zelator;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MusicStaff extends JPanel implements PropertyChangeListener
{
	@Override
	public void addNotify()
	{
		super.addNotify();
		this.setBackground(Color.PINK);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		Font font = new Font("Bravura", Font.PLAIN, 80);

		g2.setFont(font);
		g2.drawString("\uD834\uDD1E", 40, 80);// Gclef
	}


	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{

	}
}
