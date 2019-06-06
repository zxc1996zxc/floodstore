package com.CHat;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by zxc1996zxc on 2019-06-04.
 */
public class Chat extends Thread{
    //数据输入输出流
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public BufferedWriter getBufferedWriter() {
        return bufferedWriter;
    }

    public void setBufferedWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void run() {
        try {
            Socket server=new Socket(InetAddress.getLocalHost(),7777);
            //转换流
            InputStreamReader inputStreamReader=new InputStreamReader(server.getInputStream());
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(server.getOutputStream());
            bufferedReader=new BufferedReader(inputStreamReader);
            bufferedWriter=new BufferedWriter(outputStreamWriter);
            while (true){
                String s=bufferedReader.readLine();
                while (s!=null){
                    System.out.println("succeed=chant="+s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }}
        public void send(String msg){
            try {
                bufferedWriter.write("haske");
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

