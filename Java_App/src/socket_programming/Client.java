package socket_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client {



	private static final int SERVER_PORT = 5003;
	private static final String SERVER_IP = "127.0.0.1";

	public static void main(String[] args) throws IOException {

		Socket socket =new Socket(SERVER_IP,SERVER_PORT);
		
		ServerConnection sunucuBaglantisi = new ServerConnection(socket);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(socket.getOutputStream(),true);
		
		new Thread(sunucuBaglantisi).start();
		
		while(true){
			System.out.println("[Client]--> ");
			String komut = klavye.readLine();
			
			if(komut.equals("quit")) break;
			out.println(komut);

			}
		
		socket.close();
		System.exit(0);
		
		
	}

}
