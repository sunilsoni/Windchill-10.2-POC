package com.jci.helper;

import com.ptc.mvc.components.AbstractComponentBuilder;
import com.ptc.mvc.components.AttributeConfig;
import com.ptc.mvc.components.AttributePanelConfig;
import com.ptc.mvc.components.ComponentBuilder;
import com.ptc.mvc.components.ComponentConfig;
import com.ptc.mvc.components.ComponentConfigFactory;
import com.ptc.mvc.components.ComponentParams;
import com.ptc.mvc.components.GroupConfig;

import wt.util.WTException;
@ComponentBuilder("ext.ts.myPartsAttributePanel")
public class MyPartsAttributePanel  extends AbstractComponentBuilder{

	@Override
	public Object buildComponentData(ComponentConfig arg0, ComponentParams arg1) throws Exception {
		 
		return "";
	}

	@Override
	public ComponentConfig buildComponentConfig(ComponentParams arg0) throws WTException {

		ComponentConfigFactory factory = getComponentConfigFactory();
		AttributePanelConfig attPanelConfig =  factory.newAttributePanelConfig();
		
		//First Group
		GroupConfig groupConfig = factory.newGroupConfig("MYDETAILSHTMLID", "My Parts Attributes:",1);
		
		//First Attribute
		AttributeConfig firstAttribute = factory.newAttributeConfig("name","Enter Name");
		firstAttribute.setDataUtilityId("myPartsDetails");
		groupConfig.addComponent(firstAttribute);
		
		//Socond Attribute
		AttributeConfig secondAttribute = factory.newAttributeConfig("number","Enter number");
		secondAttribute.setDataUtilityId("myPartsDetails");
		groupConfig.addComponent(secondAttribute);
		
		attPanelConfig.addComponent(groupConfig);
		
		
		//Second Group
		 groupConfig = factory.newGroupConfig("MYDETAILSHTMLID2", "My Parts Attributes2:",1);
		
		//First Attribute
		 firstAttribute = factory.newAttributeConfig("name1","Enter Name1");
		firstAttribute.setDataUtilityId("myPartsDetails");
		groupConfig.addComponent(firstAttribute);
		
		//Socond Attribute
		 secondAttribute = factory.newAttributeConfig("number1","Enter number1");
		secondAttribute.setDataUtilityId("myPartsDetails");
		groupConfig.addComponent(secondAttribute);
		attPanelConfig.addComponent(groupConfig);
		
		return attPanelConfig;
	}


}
