/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfiledata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kwood
 */
public class ReadingFileData {
    static String location = "C:\\Users\\kwood\\OneDrive\\Desktop\\Filename.txt";
    static File myObj = new File(location);
    
    static void writeToFile(){
        try {
            FileWriter myWriter = new FileWriter(location, true);
            myWriter.write("Hello text file\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    static void readToFile(){
        try {
            Scanner myReader = new Scanner(myObj);  
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                    e.printStackTrace();
            }
    }
    
    public static void main(String[] args) {
        
        try {
            if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
            } 
            else {
                System.out.println("File already exists.");
            }
            
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
                e.printStackTrace();
        }
        writeToFile();
        readToFile();
    }
}
