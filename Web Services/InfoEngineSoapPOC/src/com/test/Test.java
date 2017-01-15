package com.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.ptc.www.infoengine.soap.rpc.message.createparts.IESoapServletLocator;
import com.ptc.www.infoengine.soap.rpc.message.createparts.SoapBindingStub;

public class Test {

	public static void main(String[] args) {

		IESoapServletLocator locator = new IESoapServletLocator();

		locator.setIESoapPortEndpointAddress(
				"http://wcadmin:wcadmin@M2241383.asia.jci.com:8000//Windchill/servlet/SimpleTaskDispatcher?VERSION=1.1=http://www.ptc.com/"
						+ "infoengine/soap/document/message/wcadmin.team.ws");

		/*
		 * locator.setIESoapPortEndpointAddress(
		 * "https://wcadmin:wcadmin@m2241383.asia.jci.com:8000//Windchill/servlet/SimpleTaskDispatcher?VERSION=1.1"
		 * );
		 */
		SoapBindingStub stub;
		try {
			stub = (SoapBindingStub) locator.getIESoapPort();

			boolean result = stub.myDeligateCust("viperPart041", "GENERIC_COMPUTER");
			if (result) {
				System.out.println("The part is created ");
			} else {
				System.out.println("The part fail to creat ");
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
