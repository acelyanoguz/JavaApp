package socket_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	private static String[] sekiller = {"Kare","Dikdortgen","Daire"};
	private static String[] renkler = {"sarı","yesil","mavi","kırmızı","siyah"};
	private static final int PORT =5003;
	
	private static ArrayList<ClientHandler> clients = new ArrayList<>();
	private static ExecutorService pool = Executors.newFixedThreadPool(4); //max 4 client 

	public static ArrayList<ClientHandler> getClients(){
		return clients;
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket sunucu = new ServerSocket(PORT);
		
		while(true){
			System.out.println("[SERVER] istemci baglantisi bekleniyor");
			Socket client = sunucu.accept();
			System.out.println("[SERVER] istemci baglandi");
		
			//istemci thread
			ClientHandler clientThread = new ClientHandler(client,clients);
			//clients içine client threadi ekle
			clients.add(clientThread);
			
			//istemciyi pool da aktifleştirme
			pool.execute(clientThread);
			
		}

		}
	
	public static String getRandomSekil() {
		String sekil= sekiller[(int) (Math.random() * sekiller.length)];
		String renk = renkler[(int) (Math.random() * renkler.length)];
		return sekil + " " + renk;
	}
}
