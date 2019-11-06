package Kata4View.view;

import Kata4Model.model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            IteratorReader iteratorreader = new IteratorReader(reader);
            
            for (String line : iteratorreader) 
                if(Mail.isMail(line))
                    list.add(new Mail(line));
            
            // Utilizamos el patrón de diseño "Decorador" y el "Iterador" para mejorar este código
            /**while(true){
            String line = reader.readLine();
            if(line == null)
                break;
            if(Mail.isMail(line))
                list.add(new Mail(line));
            }**/
            
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR MailListReader: read (File Not Fount)" + e.getMessage());
        }
        catch(IOException e){
            System.out.println("ERROR MailListReader: read (IO)" + e.getMessage());
        }
        return list;
    }
    
}