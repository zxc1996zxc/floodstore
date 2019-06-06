package com.CHat;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zxc1996zxc on 2019-06-04.
 */
public class Server extends Thread{
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public BufferedWriter getBufferedWriter() {
        return bufferedWriter;
    }

    public void setBufferedWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    @Override
    public void run() {
        try {
            ServerSocket server=new ServerSocket(7777);
            //拿去客户端的socket
            Socket clientSocket = server.accept();
            InputStreamReader inputStreamReader=new InputStreamReader(clientSocket.getInputStream());
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(clientSocket.getOutputStream());
            bufferedReader=new BufferedReader(inputStreamReader);
            bufferedWriter=new BufferedWriter(outputStreamWriter);
            while (true){
                String s=bufferedReader.readLine();
                while (s!=null){
                    System.out.println("succeed="+s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }}
    public void send(String msg){
        try {
            bufferedWriter.write("大大大");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
