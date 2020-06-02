package demo;

public class TestServer {
    public static void main(String[] args) {
        SocketTest socketTest = new SocketTest();
        new Thread(socketTest).start();
    }
}
