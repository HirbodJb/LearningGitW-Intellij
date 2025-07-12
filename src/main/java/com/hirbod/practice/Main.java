package com.hirbod.practice;
import com.hirbod.utils.Utilities; //first put package name then the class
import static com.hirbod.TestingProducts.TestProd.writeToFile;
import static com.hirbod.TestingProducts.TestProd.readFromFile; // we only need to import the packages and methods
                                                                // that we will be using here


public class Main {
public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5};
        Utilities.printAll(myArray);
        writeToFile();
        readFromFile();
        //I came here and made changes wiht the other account
    }
}

