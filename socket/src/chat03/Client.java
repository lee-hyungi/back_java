package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    // 포트번호 7777
    // 192.168.5.12 내꺼
//	192.168.5.254
    public static void main(String[] args) {
        String name = "";
        String ip = "192.168.5.254";

        try (
                Socket socket = new Socket(ip, 7777);
                PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("서버와 연결 되었습니다.");

            // 서버 메시지 수신 스레드 시작
            ClientThread clientThread = new ClientThread(input);
            clientThread.start();

            // 사용자 입력 처리
            String message;
            while ((message = keyInput.readLine()) != null) {
                output.println(name + ": " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientThread extends Thread {
    private BufferedReader input;

    public ClientThread() {}

    public ClientThread(BufferedReader input) {
        this.input = input;
    }

    @Override
    public void run() {
        String message;
        try {
            while ((message = input.readLine()) != null) {
                System.out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            if (input != null) {
                try {
                    input.close();
                    System.out.println("입력 스트림 종료");
                } catch (IOException e) {
                    System.err.println("입력 스트림 닫기 중 오류 발생: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}