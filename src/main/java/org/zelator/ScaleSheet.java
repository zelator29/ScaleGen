package org.zelator;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScaleSheet extends JPanel implements PropertyChangeListener
{
	@Override
	public void addNotify()
	{
		super.addNotify();
		this.setBackground(Color.BLACK);
	}

	public ScaleSheet()
	{
		super.setLayout(new GridLayout(2, 1));

		super.add(new MusicStaff());
		super.add(new TabStaff());
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{

	}
}
