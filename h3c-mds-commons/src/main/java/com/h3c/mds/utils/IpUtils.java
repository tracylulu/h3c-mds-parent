package com.h3c.mds.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpUtils {

	public static String getIpInfo(){
		String ipInfo = "";
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			ipInfo = address.getHostName() + "--" + address.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
        return ipInfo;
	}
}
