package org.zelator;

import java.awt.*;

import static org.zelator.HTMLColors.LAVENDER_BLUSH;

public class GuitarStaff extends StaffPanel
{
	public GuitarStaff()
	{
		super(TYPE.DOUBLE);
	}
	@Override
	protected Color getBackgroundColor()
	{
		return LAVENDER_BLUSH;
	}

}
