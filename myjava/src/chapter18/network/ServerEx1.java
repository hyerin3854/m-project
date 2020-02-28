package chapter18.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket();
		server.bind(new InetSocketAddress(InetAddress.getLocalHost(), 9000));
		while (true) {

			System.out.println("연결 기다림");
			Socket socket = server.accept();
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(isa.getAddress() + "와 ");
			System.out.println("연결 완료");

			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String line = null;

			while (!(line = br.readLine()).equals("exit")) {
				System.out.println("수신]" + line);
			}

			br.close();
			if (!socket.isClosed()) {
				server.close();
			}
		}
	}
}
