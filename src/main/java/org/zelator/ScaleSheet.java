package org.zelator;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScaleSheet extends JPanel implements PropertyChangeListener
{
	protected MusicStaff musicStaff = new MusicStaff();
	protected TabStaff tabStaff = new TabStaff();

	public ScaleSheet()
	{
		super.setLayout(new GridLayout(2, 1));
		super.add(musicStaff);
		super.add(tabStaff);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		// TODO propagate model changes to children
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);

	}
}
