package com.jci.dataUtils;

import com.ptc.core.components.descriptor.ModelContext;
import com.ptc.core.components.factory.AbstractDataUtility;
import com.ptc.core.components.rendering.guicomponents.TextBox;
import com.ptc.core.components.rendering.guicomponents.TextDisplayComponent;

import wt.util.WTException;

public class MyPartsDataUtils extends AbstractDataUtility {

	@Override
	public Object getDataValue(String arg0, Object arg1, ModelContext arg2) throws WTException {
		System.out.println("#### STarting MyPartsDataUtils. getDataValue ###"+arg0+"  arg1-->"+arg1);
		
		if(arg0.equalsIgnoreCase("name") || arg0.equalsIgnoreCase("number")){
			TextBox textBox = new TextBox();
			textBox.setId(arg0);
			textBox.setName(arg0);
			textBox.setEditable(true);
			textBox.setValue(" ");
			textBox.setMaxLength(50);
			textBox.setWidth(20);
			textBox.setTooltip("Please enter details");
			return textBox;
		}else {
			System.out.println("==============ELSE==============");
			TextDisplayComponent comp = new TextDisplayComponent("");
			comp.setId(arg0);
			comp.setName(arg0);
			comp.setValue("Some Dummy Value");
			comp.addStyleClass("dueDate");
			 
			return comp;
		}
	}
}
