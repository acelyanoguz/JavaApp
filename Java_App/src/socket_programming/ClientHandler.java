package socket_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {

	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	private static ArrayList<ClientHandler>clients;
	
	public ClientHandler (Socket clientSocket, ArrayList<ClientHandler>clients) throws IOException {
		client = clientSocket;
		this.clients=clients;
		in=new BufferedReader(new InputStreamReader(client.getInputStream()));
		out=new PrintWriter(client.getOutputStream(),true);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String istek =in.readLine();
				if (istek.contains("sekil")) {
					out.println(Server.getRandomSekil());  //rastgele sekil seçip client e iletiyor
				} 
				else if(istek.startsWith("[Duyuru]")) {
					int ilkBosluk=istek.indexOf(" ");
					if(ilkBosluk != -1) {
						butunIstemcilereVeriGonder(istek.substring(ilkBosluk+1));
						
					}
				}
				else {
					out.println("random şekil için \"sekil\" yazın ");
				}
			}
		}catch(IOException e) {
			System.err.println("Client Handler da IO Exception");
			System.err.println(e.getStackTrace());
		}finally {
			out.close();
			try {
				in.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	private void butunIstemcilereVeriGonder(String msg) {
		for(ClientHandler tempClient: clients) {
			tempClient.out.println(Thread.currentThread().getName()+" :"+ msg);
		}
	}

}
