/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kabisat;

import javax.swing.JOptionPane;


public class Kabisat {

    int kabs;
    
    public static void main(String[] args) {
        
        //kabby is used for menu
        int kabby = 0;
         while(kabby > 2 || kabby < 1){
         kabby = Integer.parseInt(JOptionPane.showInputDialog("Tekan 1 untuk mengecek tahun kabisat, dan tekan 2 untuk melihat tahun kabisat yang akan datang, nb:tolong jangan pilih selain 1 dan 2"));
         }
        
        if (kabby == 1){
            //kabby is used for temp
            kabby = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tahun yang akan di cek"));
            Kabisat cek = new Kabisat(kabby);
            cek.kabicek(kabby);
            if(cek.kabs == 1){
            System.out.println("Tahun "+ kabby +" merupakan tahun kabisat");
            }else{
            System.out.println("Tahun "+ kabby +" bukan merupakan tahun kabisat");
            }
        }else{
             //kabby is used for temp
            kabby = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah tahun kabisat berikutnya yang ingin diketahui"));
            Kabisat jumlah = new Kabisat(kabby);
            jumlah.kabisum(kabby);
        }
    }
    
    public Kabisat(int tahun){
    System.out.println(tahun);
    }
    
    public int kabicek(int cek){
    if(cek%400 == 0){
        kabs = 1;
    }else if(cek%100 == 0){
        kabs = 0;
    }else if(cek%4 == 0){
        kabs = 1;
    }else{
        kabs = 0;
    }    
    return kabs;
    } 
    
    public void kabisum( int a){
        int temp = 1;
        int kabtemp = 0;
        int cek = 2016;
        while(temp <= a){
        temp = temp +1;
        kabtemp = 0;
            while(kabtemp == 0){ 
                cek = cek +1;
                if(cek%400 == 0){
                    kabtemp = 1;
                }else if(cek%100 == 0){
                    kabtemp = 0;
                }else if(cek%4 == 0){
                    kabtemp = 1;
                }else{
                    kabtemp = 0;
                }
                
            }
           System.out.println(cek);
        }
        
    } 
    
    
    
}


