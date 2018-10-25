package com.swtjface.Ch3; //Ch3_Composite Ŭ���� �����̴� �۾� widgets, window,
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;

//TabFolder ����. composite�� composite �߰�
import com.swtjface.Ch3.*;

public class WidgetWindow extends ApplicationWindow
{
	public WidgetWindow()
	{
		super(null);
	}
		protected Control createContents(Composite parent)
		{
			//3.5 tabfolder �߰�
			TabFolder tf = new TabFolder(parent, SWT.NONE);
			
			TabItem chap3 = new TabItem(tf, SWT.NONE);
			chap3.setText("Chapter3");
			chap3.setControl(new Ch3_Composite(tf));  //Ch3_Composite �޾ƿ�
			
			getShell().setText("Widget Window"); //��ü �� ��ȯ
			return parent;
		}
		public static void main(String[] args) 
		{
			WidgetWindow wwin = new WidgetWindow();
			wwin.setBlockOnOpen(true);
			wwin.open();
			Display.getCurrent().dispose(); //user interface thread ��ȯ
		}

}
