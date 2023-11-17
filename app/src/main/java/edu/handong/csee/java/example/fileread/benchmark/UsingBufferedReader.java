package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        
        if (args.length < 1) {
            System.out.println("Please provide the file name as a command line argument.");
            System.exit(1);
        }

        String fileName = args[0];

        StopWatch.start();

        //-------------- Test reading file specified in command line argument. --------------------
        BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
        while (inputStream.read() != -1) {}

        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");

        inputStream.close();
    }
}
