import java.util.Scanner;
import java.util.Calendar;
class BahasUTS{
    public static void main (String args[]){
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();
        
        System.out.println(username + " " + password);

        if(username.equals("okyza") && password.equals("12345")){
            System.out.println("Login berhasil");
        }
        else{
            System.out.println("Login gagal");
            System.exit(0);
        }

        System.out.println("---------------------------------------------");
        System.out.println("1. Input Sejumlah Uang");
        System.out.println("---------------------------------------------");
        // Deklarasi si variabel Uang
        int[] uang = new int[7];
        int sum=0;
        // Input uang oleh User
        for(int a=0;a<7;a++){
            System.out.print("Masukkan jumlah uang: ");
            
            // uang[0] = 1000
            // uang[1] = 2000
            // dst
            uang[a] = input.nextInt();
            System.out.println("Uang = " + uang[a]);
            if(uang[a] >=10000)
            {
                System.out.println("Tersimpan");
            
            }
            else
            {
                uang[a]=404;
                System.out.println("Tidak Tersimpan");
            }
        }

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("2. Total Simpanan");
        System.out.println("---------------------------------------------");
        for(int a = 0; a < uang.length; a++)
        {
            System.out.print(uang[a] + " ");
            if(uang[a] != 404)
            {
                sum = uang[a] + sum;
            }
            
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
  
            while (j>=0 && uang[j] < key) 
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
                        System.out.print("Lemari Nomor (" + a + "," + b + ") = " + uang[0] + "\t");
                        System.out.print("Lemari Nomor (" + 31 + "," + 12 + ") = " + uang[uang.length-4] + "\t");
                    }
                }
                
            }
            // System.out.println("");
        }
        System.out.println("");
    }
    
}