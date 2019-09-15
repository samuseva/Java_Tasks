package com.company;

import java.io.*;

public class Task13 {
    void start() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("file.txt")));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());

        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e){

        }finally {

        }
    }
}
