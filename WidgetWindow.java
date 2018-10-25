package com.swtjface.Ch2;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;

public class WidgetWindow extends ApplicationWindow
{
	public WidgetWindow()
	{
		super(null);
	}
	protected Control createContents(Composite parent) 
	{
		getShell().setText("Widget Window.02");
		parent.setSize(200,400);
		return parent;
	}
	
	public static void main(String[] args) {
		WidgetWindow wwin = new WidgetWindow();
		wwin.setBlockOnOpen(true);
		wwin.open();
		
		Display.getCurrent().dispose();
	}

}
