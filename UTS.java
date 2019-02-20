

import java.util.Scanner;
import java.util.Calendar;

public class UTS {
        
    /* Referensi https://github.com/okyzaprabowo/SIP-Case-1/blob/master/case2.java
    Team Fiola, Syahrin dan Devira
    */
    public static void main (String args[]){
        System.out.println("---------------------------------");
        System.out.println("No. 2  Menginput Uang Pecahan");
        System.out.println("---------------------------------");
        
        int [] uang = new int [7];
        int sum=0;
        
        Scanner s = new Scanner (System.in);
        for(int a=0; a<7; a++){
        System.out.print("Masukan Jumlah Uang: ");
     
            uang[a] = s.nextInt();
            System.out.println("Uang = " + uang[a]);
            
            if(uang[a] >=10000){
                System.out.println("Tersimpan");
            
            }else{uang[a]=0;
                System.out.println("Tidak Tersimpan");
            }
           
        }
         s.close();
        System.out.println("");
        
        
        
        /*
        Refensi https://github.com/okyzaprabowo/SIP-Case-1/blob/master/PraUts.java
        Team Fiola, Syahrin dan Devira
        */
         System.out.println("---------------------------");
         System.out.println("No. 3. Penjumlahan");
         System.out.println("---------------------------");
         
         for(int a = 0; a < uang.length; a++){
            System.out.print(uang[a] + " ");
            sum = uang[a] + sum;
        }
        System.out.println("Jumlah Simpanan Anda "+sum);
        System.out.println("");
        
        
         /*
        Refensi https://github.com/okyzaprabowo/SIP-Case-1/blob/master/PraUts.java
        Team Fiola, Syahrin dan Devira
        */
        
        System.out.println("--------------------------------");
        System.out.println("No. 4. Pengurutan Nominal Uang");
        System.out.println("--------------------------------");
        
        
        int n = 7;
        int a, b;
        System.out.println("Data Setelah Di Urut = ");
        for ( a= 0; a<n; a++)
            System.out.println(uang[a]+ " ");
            System.out.println("");
            
            for (a=0; a<(n-1); a++)
            for (b=0; b<(n-1); b++)
            if (uang[b]>uang[b+1])
            {int temp = uang [b+1];
            uang [b+1]= uang [b];
            uang [b] = temp ;
    }
            
            System.out.print("Data Sebelum Di Urut = ");
            for (a=0; a<n;a++)
                System.out.print(uang[a]+" ");
            
            System.out.println("");
            
            /* Referensi https://github.com/okyzaprabowo/SIP-Case-1/blob/master/PraUts.java
            Bertanya kepada Wisang dan Fahmi
            Team Fiola, Syahrin dan Devira
            */
            System.out.println("-----------------------------------------");
            System.out.println("No. 5 Terbesar dan Terkecil Bag a dan b");
            System.out.println("-----------------------------------------");
            Calendar w = Calendar.getInstance();
              int [][] arr2 = new int [29][13];
              //baris
              for (int f=0; f<29; f++){
                  for (int g=0; g<13; g++){
                      arr2[f][g] = f + g;
                              if(f ==w.get(Calendar.DAY_OF_MONTH)){
                                  if(g ==w.get(Calendar.MONTH)+1)
                                  {
                                      System.out.println("Tanggal dan Bulan (" + f + "," + g + ") = " + uang[uang.length-1] +
                                              " Dan " + uang[uang.length-7]+ "\t");
                                      
                                  }
                              }
                  }
                 // System.out.println("");
              }
             System.out.println("");
            
                    
    
   
    } 
}