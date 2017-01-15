package com.ptc.www.infoengine.soap.rpc.message.createparts;

public class IEServiceProxy implements com.ptc.www.infoengine.soap.rpc.message.createparts.IEService {
  private String _endpoint = null;
  private com.ptc.www.infoengine.soap.rpc.message.createparts.IEService iEService = null;
  
  public IEServiceProxy() {
    _initIEServiceProxy();
  }
  
  public IEServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIEServiceProxy();
  }
  
  private void _initIEServiceProxy() {
    try {
      iEService = (new com.ptc.www.infoengine.soap.rpc.message.createparts.IESoapServletLocator()).getIESoapPort();
      if (iEService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iEService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iEService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iEService != null)
      ((javax.xml.rpc.Stub)iEService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ptc.www.infoengine.soap.rpc.message.createparts.IEService getIEService() {
    if (iEService == null)
      _initIEServiceProxy();
    return iEService;
  }
  
  public boolean myDeligateCust(java.lang.String part_name, java.lang.String product_name) throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.myDeligateCust(part_name, product_name);
  }
  
  public java.lang.String carambolaQueryLinks() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.carambolaQueryLinks();
  }
  
  public java.lang.String carambolaSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.carambolaSearch();
  }
  
  public java.lang.String carambolaTree7() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.carambolaTree7();
  }
  
  public java.lang.String jcaListChangeItems() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.jcaListChangeItems();
  }
  
  public java.lang.String datamaintArchiveSystemQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintArchiveSystemQuery();
  }
  
  public java.lang.String datamaintAttachAttributes() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintAttachAttributes();
  }
  
  public java.lang.String datamaintAttachFolderPath() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintAttachFolderPath();
  }
  
  public java.lang.String datamaintCopyCriteria() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintCopyCriteria();
  }
  
  public java.lang.String datamaintCreateMergeQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintCreateMergeQuery();
  }
  
  public java.lang.String datamaintCreateObjectPurge() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintCreateObjectPurge();
  }
  
  public java.lang.String datamaintCreateObjectRule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintCreateObjectRule();
  }
  
  public java.lang.String datamaintCreateModelRestoreJob() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintCreateModelRestoreJob();
  }
  
  public java.lang.String datamaintEditCriteriaContainer() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintEditCriteriaContainer();
  }
  
  public java.lang.String datamaintEditObjectRule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintEditObjectRule();
  }
  
  public java.lang.String datamaintEnabledisableSchedule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintEnabledisableSchedule();
  }
  
  public java.lang.String datamaintImportQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintImportQuery();
  }
  
  public java.lang.String datamaintNoOp() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintNoOp();
  }
  
  public java.lang.String datamaintQueryFolderTree() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintQueryFolderTree();
  }
  
  public java.lang.String datamaintQueryChildDomain() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintQueryChildDomain();
  }
  
  public java.lang.String datamaintQueryJobsFromSchedule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintQueryJobsFromSchedule();
  }
  
  public java.lang.String datamaintQueryTypeTree() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintQueryTypeTree();
  }
  
  public java.lang.String datamaintRenameCriteria() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintRenameCriteria();
  }
  
  public java.lang.String datamaintRepairQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintRepairQuery();
  }
  
  public java.lang.String datamaintRestore() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintRestore();
  }
  
  public java.lang.String datamaintSearchContainer() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintSearchContainer();
  }
  
  public java.lang.String datamaintSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintSearch();
  }
  
  public java.lang.String datamaintUpdate() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.datamaintUpdate();
  }
  
  public java.lang.String replicationCopyCriteria() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationCopyCriteria();
  }
  
  public java.lang.String replicationCreateObjectRule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationCreateObjectRule();
  }
  
  public java.lang.String replicationCreateObjectSchedule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationCreateObjectSchedule();
  }
  
  public java.lang.String replicationDeleteSchedule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationDeleteSchedule();
  }
  
  public java.lang.String replicationEditRule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationEditRule();
  }
  
  public java.lang.String replicationEnabledisableSchedule() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationEnabledisableSchedule();
  }
  
  public java.lang.String replicationMergeQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationMergeQuery();
  }
  
  public java.lang.String replicationQueryJobs() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationQueryJobs();
  }
  
  public java.lang.String replicationQueryRuleforVaults() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationQueryRuleforVaults();
  }
  
  public java.lang.String replicationQuerySiteVault() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationQuerySiteVault();
  }
  
  public java.lang.String replicationScheduleUpdate() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationScheduleUpdate();
  }
  
  public java.lang.String replicationSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.replicationSearch();
  }
  
  public java.lang.String searchArchiveSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchArchiveSearch();
  }
  
  public java.lang.String searchCallQueryTypeTree() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchCallQueryTypeTree();
  }
  
  public java.lang.String searchCreateSavedQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchCreateSavedQuery();
  }
  
  public java.lang.String searchDeleteSavedQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchDeleteSavedQuery();
  }
  
  public java.lang.String searchDescribeAttributes() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchDescribeAttributes();
  }
  
  public java.lang.String searchExport2() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchExport2();
  }
  
  public java.lang.String searchExportInitTask() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchExportInitTask();
  }
  
  public java.lang.String searchExportOrg() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchExportOrg();
  }
  
  public java.lang.String searchExportProEResults() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchExportProEResults();
  }
  
  public java.lang.String searchExportSearchResults() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchExportSearchResults();
  }
  
  public java.lang.String searchFindGroupsForSavedQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchFindGroupsForSavedQuery();
  }
  
  public java.lang.String searchGetContainerTypes() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchGetContainerTypes();
  }
  
  public java.lang.String searchGetSearchableAttributesWrapper() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchGetSearchableAttributesWrapper();
  }
  
  public java.lang.String searchGetSearchableAttributes() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchGetSearchableAttributes();
  }
  
  public java.lang.String searchGetSearchableTypes() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchGetSearchableTypes();
  }
  
  public java.lang.String searchGetTypeContainer() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchGetTypeContainer();
  }
  
  public java.lang.String searchIndexSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchIndexSearch();
  }
  
  public java.lang.String searchMultiDeleteAction() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchMultiDeleteAction();
  }
  
  public java.lang.String searchProEQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchProEQuery();
  }
  
  public java.lang.String searchProERetrieveResults() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchProERetrieveResults();
  }
  
  public java.lang.String searchQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchQuery();
  }
  
  public java.lang.String searchSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchSearch();
  }
  
  public java.lang.String searchSearchResults() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchSearchResults();
  }
  
  public java.lang.String searchSelectedSavedQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchSelectedSavedQuery();
  }
  
  public java.lang.String searchSystemWideSearch() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchSystemWideSearch();
  }
  
  public java.lang.String searchJCACreateSavedQuery() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.searchJCACreateSavedQuery();
  }
  
  public java.lang.String generateSequence() throws java.rmi.RemoteException{
    if (iEService == null)
      _initIEServiceProxy();
    return iEService.generateSequence();
  }
  
  
}