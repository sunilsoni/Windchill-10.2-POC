package ext.ts.examples.builders;


import wt.doc.WTDocument;
import wt.fc.QueryResult;
import wt.util.WTException;

import com.ptc.mvc.components.AbstractComponentBuilder;
import com.ptc.mvc.components.ColumnConfig;
import com.ptc.mvc.components.ComponentBuilder;
import com.ptc.mvc.components.ComponentConfig;
import com.ptc.mvc.components.ComponentConfigFactory;
import com.ptc.mvc.components.ComponentParams;
import com.ptc.mvc.components.TableConfig;

import ext.ts.examples.model.MyObject2WTPartLink;


@ComponentBuilder("ext.ts.examples.builders.TableOnPart")
public class TableOnPart extends AbstractComponentBuilder {

	@Override
	public ComponentConfig buildComponentConfig(ComponentParams arg0)
	throws WTException {
		// TODO Auto-generated method stub
		final ComponentConfigFactory factory = getComponentConfigFactory();
		final TableConfig table; {
			table = factory.newTableConfig();
			table.setComponentMode( com.ptc.core.ui.resources.ComponentMode.VIEW);
			table.setType(wt.fc.WTObject.class.getName());
			table.setLabel("My Custom Table");
			table.setMenubarName("Enquiry_RelatedCustomer_ActionModel");
			table.setSelectable(false);
			table.setShowCount(true);
			table.setId("ext.ts.examples.builders.TableOnPart");
			//table.setActionModel("Enquiry_RelatedItem_ActionModel");


			final ColumnConfig name0; {
				name0 = factory.newColumnConfig("MyObjectName", true);
				name0.setLabel("My Object Name");

			}table.addComponent(name0);

			final ColumnConfig namea1; {
				namea1 = factory.newColumnConfig("MyObjectNumber", true);
				namea1.setLabel("My Object Number");
			}table.addComponent(namea1);




			return	table;
		}
	}

	@Override
	public Object buildComponentData(ComponentConfig arg0, ComponentParams arg1)
	throws Exception {
		// TODO Auto-generated method stub
		wt.part.WTPart part=(wt.part.WTPart) arg1.getContextObject();
			QueryResult qr1 = wt.fc.PersistenceHelper.manager.navigate(part,"myObject", MyObject2WTPartLink.class);
		return qr1;
	}
}
