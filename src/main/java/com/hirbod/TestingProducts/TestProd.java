package com.hirbod.TestingProducts;

import java.io.*;

public class TestProd {
    //writing to a file
    public static void writeToFile(){
        String[] names = {"carl", "John", "Mike"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("OutPutFile.txt"));
            writer.write("writing to a file");
            writer.write("\nHere is another line");
            for (String name : names){
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //reading from a file
    public static void readFromFile(){
        try {
        BufferedReader reader = new BufferedReader(new FileReader("OutPutFile.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    } catch (IOException e){
            e.printStackTrace();
        }
    }
}
