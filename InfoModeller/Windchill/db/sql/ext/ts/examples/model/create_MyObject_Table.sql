set echo on
REM Creating table MyObject for ext.ts.examples.model.MyObject
set echo off
CREATE TABLE MyObject (
   MyObjectName   VARCHAR2(200),
   MyObjectNumber   VARCHAR2(200),
   createStampA2   DATE,
   markForDeleteA2   NUMBER NOT NULL,
   modifyStampA2   DATE,
   classnameA2A2   VARCHAR2(200),
   idA2A2   NUMBER NOT NULL,
   updateCountA2   NUMBER,
   updateStampA2   DATE,
 CONSTRAINT PK_MyObject PRIMARY KEY (idA2A2))
 STORAGE ( INITIAL 20k NEXT 20k PCTINCREASE 0 )
ENABLE PRIMARY KEY USING INDEX
 TABLESPACE INDX
 STORAGE ( INITIAL 20k NEXT 20k PCTINCREASE 0 )
/
COMMENT ON TABLE MyObject IS 'Table MyObject created for ext.ts.examples.model.MyObject'
/
REM @//ext/ts/examples/model/MyObject_UserAdditions
