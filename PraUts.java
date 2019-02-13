
import java.util.Scanner;
import java.util.Calendar;

class PraUts{

    public static void main(String args[]){ 
        /*
        [1] https://github.com/okyzaprabowo/SIP-Case-1/blob/master/PraUts.java
        [2] Okyza
        */
        System.out.println("---------------------------------------------");
        System.out.println("1. Input Sejumlah Uang");
        System.out.println("---------------------------------------------");
        // Deklarasi si variabel Uang
        int[] uang = new int[5];
        int sum=0;
        // Input uang oleh User
        Scanner input = new Scanner(System.in);
        for(int a=0;a<5;a++){
            System.out.print("Masukkan jumlah uang: ");
            
            // uang[0] = 1000
            // uang[1] = 2000
            // dst
            uang[a] = input.nextInt();
            System.out.println("Uang = " + uang[a]);
        }
        input.close();
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("2. Total Simpanan");
        System.out.println("---------------------------------------------");
        for(int a = 0; a < uang.length; a++)
        {
            System.out.print(uang[a] + " ");
            sum = uang[a] + sum;
        }
        System.out.println("Jumlah Simpanan Anda "+sum);
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("No. 3 Pengurutan Nominal Uang");
        System.out.println("---------------------------------------------");
        for (int i=1; i<uang.length; ++i) 
        { 
            int key = uang[i]; 
            int j = i-1; 
            System.out.println("Loop ke " + i);
  
            while (j>=0 && uang[j] > key) 
            { 
                uang[j+1] = uang[j]; 
                j = j-1;
            } 
            uang[j+1] = key;
            
            for (int isi=0; isi<uang.length; ++isi)
            {
                System.out.print(uang[isi] + " "); 
            } 
  
            System.out.println();
            

        }
        System.out.println();
        /*
        [1] https://www3.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html
        [2] Tim: Okyza, Alif, Fiola, Lavita, Taufiq, Yuke
        */
        System.out.println("---------------------------------------------");
        System.out.println("No. 4 Simpan Uang di Brankas");
        System.out.println("---------------------------------------------");
        Calendar cal = Calendar.getInstance();
        int[][] arr2d = new int[32][13];
        // terjadinya baris
        for (int a = 1; a < 32; a++)
        {
            // terjadinya kolom
            for (int b = 1; b <= 12; b++)
            {
                arr2d[a][b] = a + b;
                if(a == cal.get(Calendar.DAY_OF_MONTH)){
                    if(b == cal.get(Calendar.MONTH)+1)
                    {
                        System.out.print("Lemari Nomor (" + a + "," + b + ") = " + uang[uang.length - 1] + "\t");
                    }
                }
                
            }
            // System.out.println("");
        }
        System.out.println("");
    }  

}