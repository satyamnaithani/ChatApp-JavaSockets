package satyam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
	
	public static void main(String args[]) throws IOException {
		System.out.println("S : Server has strated");
		ServerSocket ss = new ServerSocket(9056);
		System.out.println("S : Server is waiting for client request");
		Socket s = ss.accept();
		
		System.out.println("S : Client Conneted");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		System.out.println("S : Client Data: " +str);
		
		String nickName = str.substring(6,13);
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
	     PrintWriter out = new PrintWriter(os);
	     out.println(nickName);
	     out.flush();
	     System.out.println("Data sent from Server to Client");
	     
	     
	}

}
