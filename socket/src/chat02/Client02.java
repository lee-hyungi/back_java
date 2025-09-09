package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
//      포트번호 7777
//      192.168.5.12

		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);

//		"localhost"
		try {
			socket = new Socket("localhost", 7777);

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.println("클라이언트에서 서버로 보내기>>");
				String outMessgae = sc.nextLine();
				
				out.write(outMessgae + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버 >>" + inMessage);
				
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				if (sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
