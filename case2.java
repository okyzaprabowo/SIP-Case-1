import java.util.Scanner;

class case2{  
    public static void main(String args[]){  
        System.out.println("Case 1");
        
        // Deklarasi si variabel Uang
        int uang ;
        int sum=0;
        // Input uang oleh User
        Scanner input = new Scanner(System.in);
        for(int a=0;a<5;a++){
            System.out.print("Masukkan jumlah uang: ");
            
            // uang[0] = 1000
            // uang[1] = 2000
            // dst
            uang = input.nextInt();
            System.out.println("Uang = " + uang);
            
            // Seleksi nilai uang

            if(uang < 10000){
                System.out.println("Mohon tukar uang anda dengan bank lain");
            }
            else if(uang >15000){
                System.out.println("tidak diterima");
            }else{
                System.out.println("disimpan");
        }
        input.close();
        System.out.println("Hasil simpanan");
       
    }  
}
}