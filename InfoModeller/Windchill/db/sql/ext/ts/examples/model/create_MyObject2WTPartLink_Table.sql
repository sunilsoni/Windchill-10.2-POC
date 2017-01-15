set echo on
REM Creating table MyObject2WTPartLink for ext.ts.examples.model.MyObject2WTPartLink
set echo off
CREATE TABLE MyObject2WTPartLink (
   classnamekeyroleAObjectRef   VARCHAR2(200),
   idA3A5   NUMBER,
   classnamekeyroleBObjectRef   VARCHAR2(200),
   idA3B5   NUMBER,
   createStampA2   DATE,
   markForDeleteA2   NUMBER NOT NULL,
   modifyStampA2   DATE,
   classnameA2A2   VARCHAR2(200),
   idA2A2   NUMBER NOT NULL,
   updateCountA2   NUMBER,
   updateStampA2   DATE,
 CONSTRAINT PK_MyObject2WTPartLink PRIMARY KEY (idA2A2))
 STORAGE ( INITIAL 20k NEXT 20k PCTINCREASE 0 )
ENABLE PRIMARY KEY USING INDEX
 TABLESPACE INDX
 STORAGE ( INITIAL 20k NEXT 20k PCTINCREASE 0 )
/
COMMENT ON TABLE MyObject2WTPartLink IS 'Table MyObject2WTPartLink created for ext.ts.examples.model.MyObject2WTPartLink'
/
REM @//ext/ts/examples/model/MyObject2WTPartLink_UserAdditions
