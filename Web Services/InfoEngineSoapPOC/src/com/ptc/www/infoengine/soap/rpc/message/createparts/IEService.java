/**
 * IEService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ptc.www.infoengine.soap.rpc.message.createparts;

public interface IEService extends java.rmi.Remote {

    /**
     * Create a WTPart object.
     */
    public boolean myDeligateCust(java.lang.String part_name, java.lang.String product_name) throws java.rmi.RemoteException;
    public java.lang.String carambolaQueryLinks() throws java.rmi.RemoteException;
    public java.lang.String carambolaSearch() throws java.rmi.RemoteException;
    public java.lang.String carambolaTree7() throws java.rmi.RemoteException;
    public java.lang.String jcaListChangeItems() throws java.rmi.RemoteException;
    public java.lang.String datamaintArchiveSystemQuery() throws java.rmi.RemoteException;
    public java.lang.String datamaintAttachAttributes() throws java.rmi.RemoteException;
    public java.lang.String datamaintAttachFolderPath() throws java.rmi.RemoteException;
    public java.lang.String datamaintCopyCriteria() throws java.rmi.RemoteException;
    public java.lang.String datamaintCreateMergeQuery() throws java.rmi.RemoteException;
    public java.lang.String datamaintCreateObjectPurge() throws java.rmi.RemoteException;
    public java.lang.String datamaintCreateObjectRule() throws java.rmi.RemoteException;
    public java.lang.String datamaintCreateModelRestoreJob() throws java.rmi.RemoteException;
    public java.lang.String datamaintEditCriteriaContainer() throws java.rmi.RemoteException;
    public java.lang.String datamaintEditObjectRule() throws java.rmi.RemoteException;
    public java.lang.String datamaintEnabledisableSchedule() throws java.rmi.RemoteException;
    public java.lang.String datamaintImportQuery() throws java.rmi.RemoteException;
    public java.lang.String datamaintNoOp() throws java.rmi.RemoteException;
    public java.lang.String datamaintQueryFolderTree() throws java.rmi.RemoteException;
    public java.lang.String datamaintQueryChildDomain() throws java.rmi.RemoteException;
    public java.lang.String datamaintQueryJobsFromSchedule() throws java.rmi.RemoteException;
    public java.lang.String datamaintQueryTypeTree() throws java.rmi.RemoteException;
    public java.lang.String datamaintRenameCriteria() throws java.rmi.RemoteException;
    public java.lang.String datamaintRepairQuery() throws java.rmi.RemoteException;
    public java.lang.String datamaintRestore() throws java.rmi.RemoteException;
    public java.lang.String datamaintSearchContainer() throws java.rmi.RemoteException;
    public java.lang.String datamaintSearch() throws java.rmi.RemoteException;
    public java.lang.String datamaintUpdate() throws java.rmi.RemoteException;
    public java.lang.String replicationCopyCriteria() throws java.rmi.RemoteException;
    public java.lang.String replicationCreateObjectRule() throws java.rmi.RemoteException;
    public java.lang.String replicationCreateObjectSchedule() throws java.rmi.RemoteException;
    public java.lang.String replicationDeleteSchedule() throws java.rmi.RemoteException;
    public java.lang.String replicationEditRule() throws java.rmi.RemoteException;
    public java.lang.String replicationEnabledisableSchedule() throws java.rmi.RemoteException;
    public java.lang.String replicationMergeQuery() throws java.rmi.RemoteException;
    public java.lang.String replicationQueryJobs() throws java.rmi.RemoteException;
    public java.lang.String replicationQueryRuleforVaults() throws java.rmi.RemoteException;
    public java.lang.String replicationQuerySiteVault() throws java.rmi.RemoteException;
    public java.lang.String replicationScheduleUpdate() throws java.rmi.RemoteException;
    public java.lang.String replicationSearch() throws java.rmi.RemoteException;
    public java.lang.String searchArchiveSearch() throws java.rmi.RemoteException;
    public java.lang.String searchCallQueryTypeTree() throws java.rmi.RemoteException;
    public java.lang.String searchCreateSavedQuery() throws java.rmi.RemoteException;
    public java.lang.String searchDeleteSavedQuery() throws java.rmi.RemoteException;
    public java.lang.String searchDescribeAttributes() throws java.rmi.RemoteException;
    public java.lang.String searchExport2() throws java.rmi.RemoteException;
    public java.lang.String searchExportInitTask() throws java.rmi.RemoteException;
    public java.lang.String searchExportOrg() throws java.rmi.RemoteException;
    public java.lang.String searchExportProEResults() throws java.rmi.RemoteException;
    public java.lang.String searchExportSearchResults() throws java.rmi.RemoteException;
    public java.lang.String searchFindGroupsForSavedQuery() throws java.rmi.RemoteException;
    public java.lang.String searchGetContainerTypes() throws java.rmi.RemoteException;
    public java.lang.String searchGetSearchableAttributesWrapper() throws java.rmi.RemoteException;
    public java.lang.String searchGetSearchableAttributes() throws java.rmi.RemoteException;
    public java.lang.String searchGetSearchableTypes() throws java.rmi.RemoteException;
    public java.lang.String searchGetTypeContainer() throws java.rmi.RemoteException;
    public java.lang.String searchIndexSearch() throws java.rmi.RemoteException;
    public java.lang.String searchMultiDeleteAction() throws java.rmi.RemoteException;
    public java.lang.String searchProEQuery() throws java.rmi.RemoteException;
    public java.lang.String searchProERetrieveResults() throws java.rmi.RemoteException;
    public java.lang.String searchQuery() throws java.rmi.RemoteException;
    public java.lang.String searchSearch() throws java.rmi.RemoteException;
    public java.lang.String searchSearchResults() throws java.rmi.RemoteException;
    public java.lang.String searchSelectedSavedQuery() throws java.rmi.RemoteException;
    public java.lang.String searchSystemWideSearch() throws java.rmi.RemoteException;
    public java.lang.String searchJCACreateSavedQuery() throws java.rmi.RemoteException;
    public java.lang.String generateSequence() throws java.rmi.RemoteException;
}
