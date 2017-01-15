package ext.ts.examples.model;

@SuppressWarnings({"cast", "deprecation", "unchecked"})
public abstract class _MyObject extends wt.fc.WTObject implements java.io.Externalizable {
   static final long serialVersionUID = 1;

   static final java.lang.String RESOURCE = "ext.ts.examples.model.modelResource";
   static final java.lang.String CLASSNAME = MyObject.class.getName();

   /**
    * @see ext.ts.examples.model.MyObject
    */
   public static final java.lang.String MY_OBJECT_NAME = "MyObjectName";
   static int MY_OBJECT_NAME_UPPER_LIMIT = -1;
   java.lang.String MyObjectName;
   /**
    * @see ext.ts.examples.model.MyObject
    */
   public java.lang.String getMyObjectName() {
      return MyObjectName;
   }
   /**
    * @see ext.ts.examples.model.MyObject
    */
   public void setMyObjectName(java.lang.String MyObjectName) throws wt.util.WTPropertyVetoException {
      MyObjectNameValidate(MyObjectName);
      this.MyObjectName = MyObjectName;
   }
   void MyObjectNameValidate(java.lang.String MyObjectName) throws wt.util.WTPropertyVetoException {
      if (MY_OBJECT_NAME_UPPER_LIMIT < 1) {
         try { MY_OBJECT_NAME_UPPER_LIMIT = (java.lang.Integer) wt.introspection.WTIntrospector.getClassInfo(CLASSNAME).getPropertyDescriptor("MyObjectName").getValue(wt.introspection.WTIntrospector.UPPER_LIMIT); }
         catch (wt.introspection.WTIntrospectionException e) { MY_OBJECT_NAME_UPPER_LIMIT = 200; }
      }
      if (MyObjectName != null && !wt.fc.PersistenceHelper.checkStoredLength(MyObjectName.toString(), MY_OBJECT_NAME_UPPER_LIMIT, true))
         throw new wt.util.WTPropertyVetoException("wt.introspection.introspectionResource", wt.introspection.introspectionResource.UPPER_LIMIT,
               new java.lang.Object[] { new wt.introspection.PropertyDisplayName(CLASSNAME, "MyObjectName"), java.lang.String.valueOf(java.lang.Math.min(MY_OBJECT_NAME_UPPER_LIMIT, wt.fc.PersistenceHelper.DB_MAX_SQL_STRING_SIZE/wt.fc.PersistenceHelper.DB_MAX_BYTES_PER_CHAR)) },
               new java.beans.PropertyChangeEvent(this, "MyObjectName", this.MyObjectName, MyObjectName));
   }

   /**
    * @see ext.ts.examples.model.MyObject
    */
   public static final java.lang.String MY_OBJECT_NUMBER = "MyObjectNumber";
   static int MY_OBJECT_NUMBER_UPPER_LIMIT = -1;
   java.lang.String MyObjectNumber;
   /**
    * @see ext.ts.examples.model.MyObject
    */
   public java.lang.String getMyObjectNumber() {
      return MyObjectNumber;
   }
   /**
    * @see ext.ts.examples.model.MyObject
    */
   public void setMyObjectNumber(java.lang.String MyObjectNumber) throws wt.util.WTPropertyVetoException {
      MyObjectNumberValidate(MyObjectNumber);
      this.MyObjectNumber = MyObjectNumber;
   }
   void MyObjectNumberValidate(java.lang.String MyObjectNumber) throws wt.util.WTPropertyVetoException {
      if (MY_OBJECT_NUMBER_UPPER_LIMIT < 1) {
         try { MY_OBJECT_NUMBER_UPPER_LIMIT = (java.lang.Integer) wt.introspection.WTIntrospector.getClassInfo(CLASSNAME).getPropertyDescriptor("MyObjectNumber").getValue(wt.introspection.WTIntrospector.UPPER_LIMIT); }
         catch (wt.introspection.WTIntrospectionException e) { MY_OBJECT_NUMBER_UPPER_LIMIT = 200; }
      }
      if (MyObjectNumber != null && !wt.fc.PersistenceHelper.checkStoredLength(MyObjectNumber.toString(), MY_OBJECT_NUMBER_UPPER_LIMIT, true))
         throw new wt.util.WTPropertyVetoException("wt.introspection.introspectionResource", wt.introspection.introspectionResource.UPPER_LIMIT,
               new java.lang.Object[] { new wt.introspection.PropertyDisplayName(CLASSNAME, "MyObjectNumber"), java.lang.String.valueOf(java.lang.Math.min(MY_OBJECT_NUMBER_UPPER_LIMIT, wt.fc.PersistenceHelper.DB_MAX_SQL_STRING_SIZE/wt.fc.PersistenceHelper.DB_MAX_BYTES_PER_CHAR)) },
               new java.beans.PropertyChangeEvent(this, "MyObjectNumber", this.MyObjectNumber, MyObjectNumber));
   }

   public java.lang.String getConceptualClassname() {
      return CLASSNAME;
   }

   public wt.introspection.ClassInfo getClassInfo() throws wt.introspection.WTIntrospectionException {
      return wt.introspection.WTIntrospector.getClassInfo(getConceptualClassname());
   }

   public java.lang.String getType() {
      try { return getClassInfo().getDisplayName(); }
      catch (wt.introspection.WTIntrospectionException wte) { return wt.util.WTStringUtilities.tail(getConceptualClassname(), '.'); }
   }

   public static final long EXTERNALIZATION_VERSION_UID = -2762877878305040833L;

   public void writeExternal(java.io.ObjectOutput output) throws java.io.IOException {
      output.writeLong( EXTERNALIZATION_VERSION_UID );

      super.writeExternal( output );

      output.writeObject( MyObjectName );
      output.writeObject( MyObjectNumber );
   }

   protected void super_writeExternal_MyObject(java.io.ObjectOutput output) throws java.io.IOException {
      super.writeExternal(output);
   }

   public void readExternal(java.io.ObjectInput input) throws java.io.IOException, java.lang.ClassNotFoundException {
      long readSerialVersionUID = input.readLong();
      readVersion( (ext.ts.examples.model.MyObject) this, input, readSerialVersionUID, false, false );
   }
   protected void super_readExternal_MyObject(java.io.ObjectInput input) throws java.io.IOException, java.lang.ClassNotFoundException {
      super.readExternal(input);
   }

   public void writeExternal(wt.pds.PersistentStoreIfc output) throws java.sql.SQLException, wt.pom.DatastoreException {
      super.writeExternal( output );

      output.setString( "MyObjectName", MyObjectName );
      output.setString( "MyObjectNumber", MyObjectNumber );
   }

   public void readExternal(wt.pds.PersistentRetrieveIfc input) throws java.sql.SQLException, wt.pom.DatastoreException {
      super.readExternal( input );

      MyObjectName = input.getString( "MyObjectName" );
      MyObjectNumber = input.getString( "MyObjectNumber" );
   }

   boolean readVersion_2762877878305040833L( java.io.ObjectInput input, long readSerialVersionUID, boolean superDone ) throws java.io.IOException, java.lang.ClassNotFoundException {
      if ( !superDone )
         super.readExternal( input );

      MyObjectName = (java.lang.String) input.readObject();
      MyObjectNumber = (java.lang.String) input.readObject();
      return true;
   }

   protected boolean readVersion( MyObject thisObject, java.io.ObjectInput input, long readSerialVersionUID, boolean passThrough, boolean superDone ) throws java.io.IOException, java.lang.ClassNotFoundException {
      boolean success = true;

      if ( readSerialVersionUID == EXTERNALIZATION_VERSION_UID )
         return readVersion_2762877878305040833L( input, readSerialVersionUID, superDone );
      else
         success = readOldVersion( input, readSerialVersionUID, passThrough, superDone );

      if (input instanceof wt.pds.PDSObjectInput)
         wt.fc.EvolvableHelper.requestRewriteOfEvolvedBlobbedObject();

      return success;
   }
   protected boolean super_readVersion_MyObject( _MyObject thisObject, java.io.ObjectInput input, long readSerialVersionUID, boolean passThrough, boolean superDone ) throws java.io.IOException, java.lang.ClassNotFoundException {
      return super.readVersion(thisObject, input, readSerialVersionUID, passThrough, superDone);
   }

   boolean readOldVersion( java.io.ObjectInput input, long readSerialVersionUID, boolean passThrough, boolean superDone ) throws java.io.IOException, java.lang.ClassNotFoundException {
      throw new java.io.InvalidClassException(CLASSNAME, "Local class not compatible: stream classdesc externalizationVersionUID="+readSerialVersionUID+" local class externalizationVersionUID="+EXTERNALIZATION_VERSION_UID);
   }
}
