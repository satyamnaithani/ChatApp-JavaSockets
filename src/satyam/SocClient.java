package satyam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {
	
	public static void main(String args[]) throws Exception {
		
		String ip = "localhost";
		int port = 9056;
		Socket s = new Socket(ip, port);
		
		String str ="Satyam naithani";
		
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		out.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String nickName = br.readLine();
		
		System.out.println("C Data from Server" +nickName);
	}

}
