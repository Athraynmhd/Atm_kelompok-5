package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList; // ini pasti paham kan
import java.util.Scanner;
import java.util.StringTokenizer;


public class Akun
{
    private String pin;
    private String noRek;
    private String saldo;
    private String username;
    private String noHP;
    private String email;
    
    public Akun()
    {

    } 
    public Akun(String noRek, String pin) throws IOException
    {
        this.noRek = noRek;
      
        this.pin = pin;
    }
    public String getPin()
    {
        return this.pin;
    }
    
    public String getPin(String noRek) throws IOException
    {
        FileReader fileReader = new FileReader("DatabaseBank.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
      
        String data = bufferedReader.readLine();
        
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        
        while (data != null){
            stringTokenizer = new StringTokenizer(data, ",");
           
            if(noRek.equals(stringTokenizer.nextToken())){
              
                this.pin = stringTokenizer.nextToken();
                break;
            }else{
          
                data = bufferedReader.readLine();
            }
        }
       
        bufferedReader.close();
        fileReader.close();

        return this.pin;
    }
    
    public void setPin(String pinBaru) throws IOException
    {
        File file = new File("DatabaseBank.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        
        File temp = new File("TempDatabaseDokter.txt");
        FileWriter fileWriter = new FileWriter(temp);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String data = bufferedReader.readLine();
    
        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
        
        while(data != null)
        {
            stringTokenizer = new StringTokenizer(data, ",");
            
            if(noRek.equals(stringTokenizer.nextToken())){
               
                stringTokenizer.nextToken();
              
                String saldot = stringTokenizer.nextToken();
               
                String usernamet = stringTokenizer.nextToken();
                
                String noHPt = stringTokenizer.nextToken();
               
                String emailt = stringTokenizer.nextToken();
             
                bufferedWriter.write(noRek + "," + pinBaru + "," + saldot + "," + usernamet + "," + noHPt+ "," + emailt);
            }else{
                
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            data = bufferedReader.readLine();
        }
        
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
        file.delete();

        temp.renameTo(file);
    }

public void isiDataAkun(String norek){
        String path = "DatabaseBank.txt";
        try {
  
        File file = new File(path);
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("[,\\n]");
        

        while(scan.hasNext())
        {
            this.noRek = scan.next();
            if(this.noRek.equals(norek)){
                this.pin = scan.next();
                this.saldo = scan.next();
                this.username = scan.next();
                this.noHP = scan.next();
                this.email = scan.next();
            }else{
                continue;
            }
        }
      
        bufferedReader.close();
        scan.close();
        fileReader.close();
        }
        catch (Exception e){
            
        }
    }
    
