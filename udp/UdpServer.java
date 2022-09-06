package udp;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws SocketException, IOException{
        DatagramSocket rec = new DatagramSocket(2022);
        byte[] receiveData = new byte[100000];
        DatagramPacket dpReceive = null;
        while(true){
            dpReceive = new DatagramPacket(receiveData, receiveData.length);
            rec.receive(dpReceive);
            System.out.println("Client : " + data(receiveData));
            if(data(receiveData).toString().equals("bye")){
                System.out.println("Exit...");
                break;
            }
        }

    }

    public static StringBuilder data(byte[] receiveData) {
        if(receiveData == null)
            return null;
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(receiveData[i] != 0){
            res.append((char) receiveData[i]);
            i++;
        }
        return res;

    }
}
