import java.util.*;

class Pertemuan8{
    public static void main (String args[]){
        System.out.println("---------------------------------");
        System.out.println("No. 2  Menginput Uang Pecahan");
        System.out.println("---------------------------------");
        
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        int uang=0;
        
        Scanner s = new Scanner (System.in);
        for(int a=0; a<3; a++){
        System.out.print("Masukan Jumlah Uang: ");
     
            uang = s.nextInt();
            System.out.println("Uang = " + uang);
            
            if(uang >=10000){
                System.out.println("Tersimpan");
                list.add(uang);
            
            }else{uang=0;
                System.out.println("Tidak Tersimpan");
            }
           
        }
        s.close();
        System.out.println(list);
        
        
        
        /*
        Refensi https://github.com/okyzaprabowo/SIP-Case-1/blob/master/PraUts.java
        Team Fiola, Syahrin dan Devira
        */
        System.out.println("---------------------------");
        System.out.println("No. 3. Penjumlahan");
        System.out.println("---------------------------");
         
        // for(int a = 0; a < list.size(); a++){
        //     System.out.print(list.get(a) + " ");
        //     sum = list.get(a) + sum;
        // }

        for(int number : list)
            sum += number;


        System.out.println("Jumlah Simpanan Anda "+sum);
        System.out.println("");


        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Nomor 4");
        System.out.println(list.get(1));

        System.out.println("Nomor 5");
        list.remove(list.size()-1);
        System.out.println(list);

        System.out.println("Nomor 6");
        list.clear();
        System.out.println(list);
        
    }
}