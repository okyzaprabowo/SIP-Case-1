import java.util.Scanner;

class Case1{  
    public static void main(String args[]){  
        System.out.println("Case 1");
        
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
            
            // Seleksi nilai uang

            if(uang[a] >= 5000){
                System.out.println("Disimpan");
            }
            else{
                System.out.println("Terlalu kecil");
            }
        }
        input.close();
        System.out.println("Hasil simpanan");
        for(int a = 0; a < uang.length; a++)
        {
            System.out.print(uang[a] + " ");
            sum = uang[a] + sum;
        }
        System.out.println("Jumlah Simpanan Anda "+sum);
    }  
}  