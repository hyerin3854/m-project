package chapter18.network;

import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) throws Exception {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP주소:" + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
