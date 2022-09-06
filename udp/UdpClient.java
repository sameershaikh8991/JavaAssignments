package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
    public static void main(String[] args) throws SocketException,UnknownHostException,IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket ds = new DatagramSocket();
        // DatagramSocket dsreceive = new DatagramSocket(2022);
        // DatagramSocket recClient = new DatagramSocket(2022); //
        // byte[] recData = new byte[100000]; //
        
        InetAddress ip;
        System.out.println("Connecting with Server...");
        ip = InetAddress.getByName("NEOLAP000001638");
        System.out.println("Connection Established with --> " + ip);
        byte send[] = null;
        DatagramPacket dp = null;  //
        while(true){
            String input = br.readLine();
            send = input.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(send,send.length,ip,2022);
            ds.send(sendPacket);

            // dp = new DatagramPacket(recData, recData.length);//
            // dp.receive(dp); 



            if(input.equals("bye"))
                break;
        }
    }
}
