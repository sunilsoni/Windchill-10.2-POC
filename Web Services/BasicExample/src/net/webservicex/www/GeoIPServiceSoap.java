/**
 * GeoIPServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.webservicex.www;

public interface GeoIPServiceSoap extends java.rmi.Remote {

    /**
     * GeoIPService - GetGeoIP enables you to easily look up countries
     * by IP addresses
     */
    public net.webservicex.www.GeoIP getGeoIP(java.lang.String IPAddress) throws java.rmi.RemoteException;

    /**
     * GeoIPService - GetGeoIPContext enables you to easily look up
     * countries by Context
     */
    public net.webservicex.www.GeoIP getGeoIPContext() throws java.rmi.RemoteException;
}
