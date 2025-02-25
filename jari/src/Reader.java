import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    

    public static void readFile(){
        System.out.println("File beolvasása...");
        ArrayList<Vehicle> tarolas = new ArrayList<>();

        try{
            File file =  new File("jaribt.txt");
            Scanner sc = new Scanner(file, "utf-8");

            String line = sc.nextLine();
            while(sc.hasNextLine()) {
                String[] arr = line.split(":");
                
            }
            
        }catch(FileNotFoundException exception){

            System.err.println("Hiba! A fájl nem található.");
            System.err.println(exception.getMessage());
        }
    }
}
