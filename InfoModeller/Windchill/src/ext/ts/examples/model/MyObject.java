package ext.ts.examples.model;



import java.lang.String;
import wt.util.WTException;
import com.ptc.windchill.annotations.metadata.*;

/*
 * 
 */

@GenAsPersistable(superClass=wt.fc.WTObject.class,
		serializable=Serialization.EXTERNALIZABLE_BASIC,
		properties={
	@GeneratedProperty(name="MyObjectName", type=String.class),
	@GeneratedProperty(name="MyObjectNumber", type=String.class),
	
})

public class MyObject extends _MyObject {
	static final long serialVersionUID = 1;

	/**
	 * Default factory for the class.
	 *
	 * @return    MyObject
	 * @exception wt.util.WTException
	 **/
	public static MyObject newMyObject() throws WTException {

		MyObject instance = new MyObject();
		instance.initialize();
		return instance;
	}
}