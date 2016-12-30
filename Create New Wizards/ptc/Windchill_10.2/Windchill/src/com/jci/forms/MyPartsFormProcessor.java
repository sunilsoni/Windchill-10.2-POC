package com.jci.forms;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.ptc.core.components.beans.ObjectBean;
import com.ptc.core.components.forms.DefaultObjectFormProcessor;
import com.ptc.core.components.forms.FormProcessingStatus;
import com.ptc.core.components.forms.FormResult;
import com.ptc.core.components.util.FeedbackMessage;
import com.ptc.core.ui.resources.FeedbackType;
import com.ptc.netmarkets.util.beans.NmCommandBean;

import wt.fc.PersistenceHelper;
import wt.fc.QueryResult;
import wt.folder.FolderHelper;
import wt.inf.container.WTContainerRef;
import wt.part.WTPart;
import wt.pdmlink.PDMLinkProduct;
import wt.pds.StatementSpec;
import wt.query.QuerySpec;
import wt.query.SearchCondition;
import wt.util.WTException;
import wt.util.WTPropertyVetoException;

public class MyPartsFormProcessor  extends DefaultObjectFormProcessor{

	@Override
	public FormResult doOperation(NmCommandBean commandBean, List<ObjectBean> objectBean) throws WTException {
		System.out.println("#### STarting MyPartsFormProcessor. doOperation ###");
		//commandBean.getRadio();
		HashMap map = commandBean.getText();
		System.out.println("map-->"+map);
		
		Collection keys = map.keySet();
		
		for(Object key:keys){
			System.out.println("Keys-->"+key);
			System.out.println("values-->"+map.get(key));
		}
		 
		map = commandBean.getMap();
		keys = map.keySet();
		for(Object key:keys){
			System.out.println("Map Keys-->"+key);
			System.out.println("MAp values-->"+map.get(key));
		}
		
		System.out.println("#### Ending MyPartsFormProcessor. doOperation ###");
		return super.doOperation(commandBean, objectBean);
	}

	@Override
	public FormResult preProcess(NmCommandBean arg0, List<ObjectBean> arg1) throws WTException {
		System.out.println("#### STarting MyPartsFormProcessor. preProcess ###");
		
		HashMap map = arg0.getText();
		System.out.println("map-->"+map);
		
		String name = map.get("name").toString();
		
		if(name.length()<3){			
			FormResult result = new FormResult();
			result.setStatus(FormProcessingStatus.FAILURE);
			result.addFeedbackMessage(new FeedbackMessage(FeedbackType.FAILURE,arg0.getLocale(),null,null,"Name Must be greater than 2 characters!"));  
			return result;
		}
		
		String number = map.get("number").toString();
		if(number.length()<3){			
			FormResult result = new FormResult();
			result.setStatus(FormProcessingStatus.FAILURE);
			result.addFeedbackMessage(new FeedbackMessage(FeedbackType.FAILURE,arg0.getLocale(),null,null,"Number Must be greater than 2 characters!"));  
			return result;
		}
		
		
		
		
		
		WTPart part = WTPart.newWTPart();
		try {
			part.setName(name);
			part.setNumber(number);
		} catch (WTPropertyVetoException e) {
			e.printStackTrace();
		}
		
		
		QuerySpec qs = new QuerySpec(PDMLinkProduct.class);
		
		SearchCondition sc = new SearchCondition(PDMLinkProduct.class,PDMLinkProduct.NAME,SearchCondition.LIKE,"Drive System",true);
		qs.appendSearchCondition(sc);
		
		QueryResult  result = PersistenceHelper.manager.find((StatementSpec)qs);
		PDMLinkProduct container =null;
		
		while(result.hasMoreElements()){
			container = (PDMLinkProduct) result.nextElement();
		}
		
		if(container!=null){
			FolderHelper.assignLocation(part, "/Default/Part Folder", WTContainerRef.newWTContainerRef(container)); 
			
			//Saving to DB from Java and updating Java memory for further updating
			part = (WTPart) PersistenceHelper.manager.save(part);
		}
		
		System.out.println("part--->"+part.toString());
		
		
		System.out.println("#### Ending MyPartsFormProcessor. preProcess ###");
		return super.preProcess(arg0, arg1);
	}

	
	@Override
	public FormResult postProcess(NmCommandBean arg0, List<ObjectBean> arg1) throws WTException {


		System.out.println("#### STarting MyPartsFormProcessor. postProcess ###");
		return super.postProcess(arg0, arg1);
	}

	@Override
	public FormResult postTransactionProcess(NmCommandBean arg0, List<ObjectBean> arg1) throws WTException {
		System.out.println("#### STarting MyPartsFormProcessor. postTransactionProcess ###");
		return super.postTransactionProcess(arg0, arg1);
	}


	
	
}