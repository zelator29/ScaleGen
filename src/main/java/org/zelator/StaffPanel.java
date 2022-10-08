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
}
