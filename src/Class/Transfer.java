/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class ini merupakan turunan dari class Transaksi
 */
public class Transfer extends Transaksi{
    private String norektujuan;
    
    /**
     * Method constructor dengan parameter
     * @param norek
     * @param norektujuan 
     */
    public Transfer(String norek, String norektujuan){
        super(norek);
        this.norektujuan = norektujuan;
    }

      
    /**
     * Method getter untuk mendapatkan nilai norek tujuan
     * @return this.norektujuan
     */ 
    public String getnorektujuan(){
        return this.norektujuan;
    }
     
     /**
      * Method getter untuk mendapatkan nilai total transaksi
      * @param jumlah
      * @return 0
      */
    public int GetTotalTransaksi(int jumlah){
      return 0;
    }
     
