/**
 * GeoIPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.webservicex.www;

public class GeoIPServiceLocator extends org.apache.axis.client.Service implements net.webservicex.www.GeoIPService {

    public GeoIPServiceLocator() {
    }


    public GeoIPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GeoIPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GeoIPServiceSoap
    private java.lang.String GeoIPServiceSoap_address = "http://www.webservicex.net/geoipservice.asmx";

    public java.lang.String getGeoIPServiceSoapAddress() {
        return GeoIPServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GeoIPServiceSoapWSDDServiceName = "GeoIPServiceSoap";

    public java.lang.String getGeoIPServiceSoapWSDDServiceName() {
        return GeoIPServiceSoapWSDDServiceName;
    }

    public void setGeoIPServiceSoapWSDDServiceName(java.lang.String name) {
        GeoIPServiceSoapWSDDServiceName = name;
    }

    public net.webservicex.www.GeoIPServiceSoap getGeoIPServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GeoIPServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGeoIPServiceSoap(endpoint);
    }

    public net.webservicex.www.GeoIPServiceSoap getGeoIPServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.webservicex.www.GeoIPServiceSoapStub _stub = new net.webservicex.www.GeoIPServiceSoapStub(portAddress, this);
            _stub.setPortName(getGeoIPServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGeoIPServiceSoapEndpointAddress(java.lang.String address) {
        GeoIPServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.webservicex.www.GeoIPServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.webservicex.www.GeoIPServiceSoapStub _stub = new net.webservicex.www.GeoIPServiceSoapStub(new java.net.URL(GeoIPServiceSoap_address), this);
                _stub.setPortName(getGeoIPServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GeoIPServiceSoap".equals(inputPortName)) {
            return getGeoIPServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webservicex.net/", "GeoIPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webservicex.net/", "GeoIPServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GeoIPServiceSoap".equals(portName)) {
            setGeoIPServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
