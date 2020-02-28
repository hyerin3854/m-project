package chapter18.network;

import java.net.InetAddress;

public class IPAddressEx1 {

	public static void main(String[] args) throws Exception {
	InetAddress myip =InetAddress.getLocalHost();
	System.out.println(myip.getHostAddress());
	}
	}


