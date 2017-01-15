package ext.ts.examples.model;



import wt.fc.ObjectToObjectLink;
import wt.util.WTException;
import com.ptc.windchill.annotations.metadata.*;


/*
 * 
 *  
 */

@GenAsBinaryLink(superClass=ObjectToObjectLink.class, 
		serializable=Serialization.EXTERNALIZABLE_BASIC,
		roleA=@GeneratedRole(name="partPTC", type=wt.part.WTPart.class,
				cardinality=Cardinality.ONE),
				roleB=@GeneratedRole(name="myObject", type=MyObject.class),
				tableProperties=@TableProperties(tableName="MyObject2WTPartLink")
)
public class MyObject2WTPartLink extends _MyObject2WTPartLink{

	static final long serialVersionUID = 1;

	/**
	 * Default factory for the class.
	 *
	 * 
	 **/
	
	public static MyObject2WTPartLink newMyObject2WTPartLink( wt.part.WTPart part, MyObject myObject )
	throws WTException {

		MyObject2WTPartLink instance = new MyObject2WTPartLink();
		instance.initialize( part, myObject );
		return instance;
	}


}
