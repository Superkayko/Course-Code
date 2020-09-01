package readingfiledata;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class StoringData {
    
    static String location = "C:\\Users\\kwood\\OneDrive\\Desktop\\Filename.txt";
    static ArrayList<Student> Names = new ArrayList<Student>();
    
    
    static void PopulateArrayList(){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        String curName = "";
        do{
            
            try{
                Student tempStudent = new Student();
                
                System.out.println("Please enter a name, enter q to go back to menu");
                curName = sc4.nextLine();
                
                if(!curName.equalsIgnoreCase("q")){
                    tempStudent.name = curName;
                    System.out.println("Please enter the students age");
                    tempStudent.age = sc2.nextInt();
                    System.out.println("Please enter the students gender");
                    tempStudent.sex = sc.next();
                    System.out.println("Please enter the students course");
                    tempStudent.course = sc3.nextLine();
                    System.out.println("Please enter if fees paid as \"True\" or \"False\"");
                    tempStudent.feesPaid = sc.nextBoolean();
                    //Names.add(Format(curName));
                }
                Names.add(tempStudent);

            }catch(Exception e){
                System.out.println("Error");
            }
        }while(!curName.equalsIgnoreCase("q"));
        
        
    }
    
    /*
    static void removeName(){
        Scanner sc =  new Scanner(System.in);
        String strName = "";
        do{
            strName = "";
            System.out.println(Names);
            System.out.println("Please enter an existing name, press q to go back to menu");
            strName = sc.nextLine().toLowerCase();
            
            if(Names.contains(strName)){
                 Names.remove(strName);
                 System.out.println("This name has been removed");
            }
            else if(!Names.contains(strName)){
                System.out.println("This name is not in the list");
            }
        }while(!strName.equalsIgnoreCase("Q"));
        
    }
    */
    static void writeToFile(){
        try {
            FileWriter myWriter = new FileWriter(location);
            for (int i = 0; i < Names.size(); i++) {
                myWriter.write(Names.get(i) + "\n");
            }
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    /*
    static void searchAndReplace(){
        Scanner sc =  new Scanner(System.in);
        String searchStudent = "";
        String replaceStudent = "";
        do{
            searchStudent = "";
            replaceStudent = "";
            System.out.println(Names);
            System.out.println("Please enter a student to replace, press q to go back to menu");
            searchStudent = sc.nextLine().toLowerCase();
            
            if(Names.contains(searchStudent)){
                int index = Names.indexOf(searchStudent);
                System.out.println("Please enter student to replace " + searchStudent);
                replaceStudent = sc.nextLine().toLowerCase();
                Names.set(index, Format(replaceStudent));
                System.out.println(searchStudent + " has been replaced to " + replaceStudent);
            }
            else{
                System.out.println("This student is not on the list");
            }
        }while(!searchStudent.equalsIgnoreCase("Q"));
        
    }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        
        
        
        do{
        System.out.println("Student Maintenance Program:"
                +        "\n1) Add New Student"
                +        "\n2) Display All Students"
                +        "\n3) Remove Student"
                +        "\n4) Replace Student"
                +        "\n5) Exit");
        System.out.println("Please selct one of the above opions");
        userInput = sc.next();
        
        switch(userInput){
            case "1": PopulateArrayList(); break;
            //case "2": displayAllStudents(); break;
            //case "3": removeName(); break;
            //case "4": searchAndReplace(); break;
            case "5": System.out.println("Goodbye"); writeToFile();
        }
        
        }while(!userInput.equals("5"));
        sc.close();
    }
    /*
    static void displayAllStudents(){
        System.out.println("|=============|");
        System.out.println("|Student Names|");
        System.out.print("|=============|\n");
        for (int i = 0; i < Names.size(); i++) {
            System.out.println("| "+Names.get(i));
        }
        System.out.println("|=============|");
    }
    */
    /*
    static void readFromFile(){
        try{
            File myObj = new File(location);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                Names.add(Format(myReader.nextLine()));
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    static String Format(String str){
        String formattedName = "";
        if(str.length()>0){
            formattedName = str.toUpperCase().charAt(0)+ str.substring(1,str.length()).toLowerCase();
        }
        return formattedName;
    }
    */
}
