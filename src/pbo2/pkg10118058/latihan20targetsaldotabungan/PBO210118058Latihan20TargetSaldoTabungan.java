/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan20targetsaldotabungan;

/**
 *
 * @author user
 * Nama : Satyaning Andaru Bawalaksana
 * Nim : 10118058
 * Kelas : IF-2
 */
public class PBO210118058Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,total,bunga;
        total=3500000;
        bunga= (int) (total*0.08);
        total = total+bunga;
        i=1;
        do{
            System.out.println("Saldo dibulan ke- " +i + " Rp. " +total);
            i++;
            bunga =(int)(total * 0.08);
            total+=bunga;
        }while(i<=8);
        System.out.println("developed By Satyaning Andaru");
    }
    
}
