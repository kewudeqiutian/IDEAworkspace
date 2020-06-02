package example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocketTest implements Runnable{
    public void run() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        Date data = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            serverSocket = new ServerSocket(10002);
            socket = serverSocket.accept();
            System.out.println("监听中。。。");
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = bufferedReader.readLine();
            System.out.println(s);
            outputStream = socket.getOutputStream();
//            if ("yes".equals(s)){
//                outputStream.write(("OK" + simpleDateFormat.format(data)).getBytes());
//            }
//            else{
//                outputStream.write(("not yes" + simpleDateFormat.format(data)).getBytes());
//            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
//            try {
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Run已结束");
    }
}
