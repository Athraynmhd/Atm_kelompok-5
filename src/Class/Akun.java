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
import java.util.ArrayList;
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
    
    public void setPin(String pinBaru) throws IOException {
        File file = new File("DatabaseBank.txt");
        File temp = new File("TempDatabaseDokter.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(temp))) {

            String data;
            while ((data = bufferedReader.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
                String noRekTemp = stringTokenizer.nextToken();

                if (noRek.equals(noRekTemp)) {
                    // Skip the old pin
                    stringTokenizer.nextToken();

                    String saldot = stringTokenizer.nextToken();
                    String usernamet = stringTokenizer.nextToken();
                    String noHPt = stringTokenizer.nextToken();
                    String emailt = stringTokenizer.nextToken();

                    // Write the updated line with the new pin
                    bufferedWriter.write(noRek + "," + pinBaru + "," + saldot + "," + usernamet + "," + noHPt + "," + emailt);
                } else {
                    // Write unchanged line
                    bufferedWriter.write(data);
                }

                bufferedWriter.newLine();
            }
        }

        // Delete the original file
        Files.deleteIfExists(file.toPath());

        // Rename the temporary file to the original file
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

public void setHasil(String norek, int hasil) throws IOException{
        String path = "DatabaseBank.txt";
        String temp = "TempDatabase.txt";
     
        File fileAwal = new File(path);
        File fileTemp = new File(temp);

        FileWriter fw = new FileWriter(temp, true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        PrintWriter pw = new PrintWriter(bw);
        
        String noRek;
        String pin;
        String saldo;
        String username;
        String noHP;
        String email;
       
        String saldoBaru = String.valueOf(hasil);

     
        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("[,\n]");
        
     
        while(scan.hasNext())
        {
            noRek = scan.next();
            pin = scan.next();
            saldo = scan.next();
            username = scan.next();
            noHP = scan.next();
            email = scan.next();
       
            if(noRek.equals(norek)){
                bw.write(noRek + "," + pin + "," + saldoBaru + "," + username + "," + noHP+ "," + email);
            
            }else{
                bw.write(noRek + "," + pin + "," + saldo + "," + username + "," + noHP+ "," + email);
           
            }
        }
        scan.close();
        pw.flush();
        pw.close();
        bw.flush();
        bw.close();
        fw.close();
        fileAwal.delete();
        
    
        fileTemp.renameTo(fileAwal); 
    }
    
    public void update(){
        String path = "DatabaseBank.txt";
        String temp = "TempDatabase.txt";
        Path fileAsli = Paths.get(path);


        File fileAwal = new File(path);
        File fileTemp = new File(temp);


        fileAwal.delete();
        fileTemp.renameTo(fileAwal);
    }
    
   
    public void akunBaru(ArrayList<String> dataUser)throws IOException{
 
        int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
        String noRekening= Integer.toString(random);
        
        this.noRek = noRekening;

        FileWriter filewr = new FileWriter("DatabaseBank.txt", true);
        BufferedWriter bufferedWr = new BufferedWriter(filewr);
        

        bufferedWr.write(noRekening+ "," + dataUser.get(0) + "," + dataUser.get(1) + "," + dataUser.get(2) + "," + dataUser.get(3)+ "," + dataUser.get(4));
        bufferedWr.newLine();
        bufferedWr.flush();

        bufferedWr.close();
        filewr.close();
    }
    
    public boolean checkNoRek(String noReken,String pinen) throws IOException{
        
        boolean adaData = true;
        String path = "DatabaseBank.txt";
        try {

        File file = new File(path);
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
               

        Scanner scan = new Scanner(new File(path));
        scan.useDelimiter("[,\\n]");
        
        String noReke, pine,saldoe, usernamee,noHPe,emaile;

        while(scan.hasNext())
        {
            noReke = scan.next();
            pine = scan.next();
            saldoe = scan.next();
            usernamee = scan.next();
            noHPe = scan.next();
            emaile = scan.next();

            if(noReke.equals(noReken) && pine.equals(pinen)){
                adaData = true;
                break;
            }else{
                adaData = false;
            }
        }
        bufferedReader.close();
        scan.close();
        fileReader.close();
        }
        catch (Exception e){
            
        }
        return adaData;
    }
    
    public boolean checkPin() throws IOException{
        
        boolean adaData = true;

        FileReader fileR = new FileReader("DatabaseBank.txt");
        BufferedReader bufferedR = new BufferedReader(fileR);
        String data = bufferedR.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        

        while(data != null){
           stringTokenizer = new StringTokenizer(data.substring(6),",");

           if(pin.equals(stringTokenizer.nextToken())){
               adaData = true;
               break;
           }else{
               adaData = false;
           }
           data = bufferedR.readLine();
       }
        bufferedR.close();
        fileR.close();
        return adaData;
    }


    public String getSaldo(){
        return this.saldo;
    }
    

    public String getUserName(){
        return this.username;
    }
    

    public String getNoHp(){
        return this.noHP;
    }
    

    public String getEmail(){
        return this.email;
    }
    

    public String getNomorRekening(){
        return this.noRek;
    }
}
     
