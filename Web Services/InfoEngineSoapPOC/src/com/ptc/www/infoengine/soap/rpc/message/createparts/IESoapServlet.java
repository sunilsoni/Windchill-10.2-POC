/**
 * IESoapServlet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ptc.www.infoengine.soap.rpc.message.createparts;

public interface IESoapServlet extends javax.xml.rpc.Service {
    public java.lang.String getIESoapPortAddress();

    public com.ptc.www.infoengine.soap.rpc.message.createparts.IEService getIESoapPort() throws javax.xml.rpc.ServiceException;

    public com.ptc.www.infoengine.soap.rpc.message.createparts.IEService getIESoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
