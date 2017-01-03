package net.webservicex.www;

public class GeoIPServiceSoapProxy implements net.webservicex.www.GeoIPServiceSoap {
  private String _endpoint = null;
  private net.webservicex.www.GeoIPServiceSoap geoIPServiceSoap = null;
  
  public GeoIPServiceSoapProxy() {
    _initGeoIPServiceSoapProxy();
  }
  
  public GeoIPServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initGeoIPServiceSoapProxy();
  }
  
  private void _initGeoIPServiceSoapProxy() {
    try {
      geoIPServiceSoap = (new net.webservicex.www.GeoIPServiceLocator()).getGeoIPServiceSoap();
      if (geoIPServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)geoIPServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)geoIPServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (geoIPServiceSoap != null)
      ((javax.xml.rpc.Stub)geoIPServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.webservicex.www.GeoIPServiceSoap getGeoIPServiceSoap() {
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap;
  }
  
  public net.webservicex.www.GeoIP getGeoIP(java.lang.String IPAddress) throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getGeoIP(IPAddress);
  }
  
  public net.webservicex.www.GeoIP getGeoIPContext() throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getGeoIPContext();
  }
  
  
}