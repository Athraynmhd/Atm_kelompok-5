/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 * Sebuah Class abstract yang tidak dapat untuk dibuat objek 
 * untuk mengaksesnya harus diturunkan dari class lain
 */
public abstract class Transaksi {
    private Akun akun;
    private int saldo;
    private String norek;
    
