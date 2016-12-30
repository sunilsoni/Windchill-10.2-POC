<%@ taglib prefix="jca" uri="http://www.ptc.com/windchill/taglib/components" 
%>

<%@ include file="/netmarkets/jsp/components/beginWizard.jspf"%>

<jca:wizard title ="MyDetails Step 1 Page">
	  <jca:wizardStep action="MyPartsStep1" type="MyPartsActionType"/>
	  
 
</jca:wizard>



<%@ include file="/netmarkets/jsp/util/end.jspf"%>