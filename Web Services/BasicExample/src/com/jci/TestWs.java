package com.jci;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import net.webservicex.www.GeoIPServiceLocator;
import net.webservicex.www.GeoIPServiceSoap;

public class TestWs {
	public static void main(String[] args) throws ServiceException, RemoteException {
		GeoIPServiceLocator ipService = new GeoIPServiceLocator();

		GeoIPServiceSoap geoIp = ipService.getGeoIPServiceSoap();

		System.out.println(geoIp.getGeoIP("212.58.246.78").getCountryName());
		System.out.println(geoIp.getGeoIP("172.20.10.4").getCountryName());

		// System.out.println(geoIp.getGeoIP("212.58.246.78").);
	}
}
