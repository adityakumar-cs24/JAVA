package _0PRACTICE;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        try{
            File file = new File("data.txt");
            if(file.createNewFile()){
                System.out.println("File SuccessFully Created.");
            }
            else {
                System.out.println("File Already Exist");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        FileWriter fw = new FileWriter("data.txt");
        fw.write("I am Aditya Kumar");
        fw.close();


        //Reading the file with the help of File Reader
        FileReader fr = new FileReader("data.txt");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        System.out.println();
        // Reading the file with the help of Buffer Reader\
        BufferedReader bfr = new BufferedReader(new FileReader("data.txt"));
        String str;
        while((str = bfr.readLine()) != null){
            System.out.println(str);
        }
    }
}
