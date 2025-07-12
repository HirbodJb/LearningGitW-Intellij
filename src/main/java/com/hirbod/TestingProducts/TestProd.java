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
        String searchText = "carl";
        try {
        BufferedReader reader = new BufferedReader(new FileReader("OutPutFile.txt"));
        String line;
        int lineNumber = 0;
        int foundLine = 0;
        boolean found = false;
        while((line = reader.readLine()) != null) {
            lineNumber++;
            System.out.println(line);
            if (line.contains(searchText)){
                found = true;
                foundLine = lineNumber;
            }
        }
        if(found){
            System.out.println("Found - " + searchText + " - on Line " + foundLine);
        }
        else {
            System.out.println(searchText + " - is not in the file");
        }
        reader.close();
    } catch (IOException e){
            e.printStackTrace();
        }
    }
}
