package com.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.ptc.www.infoengine.soap.rpc.message.IESoapServletLocator;
import com.ptc.www.infoengine.soap.rpc.message.SoapBindingStub;

public class TestBom {

	public static void main(String[] args) {

		IESoapServletLocator locator = new IESoapServletLocator();

		locator.setIESoapPortEndpointAddress(
				"http://wcadmin:wcadmin@M2241383.asia.jci.com:8000//Windchill/servlet/SimpleTaskDispatcher?VERSION=1.1=http://www.ptc.com/"
						+ "infoengine/soap/document/message/wcadmin.team.ws");

		SoapBindingStub stub;
		try {
			stub = (SoapBindingStub) locator.getIESoapPort();

			boolean result = stub.createPartsSOAP("1212", "Drive System");
			System.out.println("result===>"+result);
			
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
