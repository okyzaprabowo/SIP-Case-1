import java.util.Scanner;

class Case4{  
    public static void main(String args[]){ 
        int[][] arr2d = new int[32][13];
        // batas awal
        System.out.println("Array 2D");
        // terjadinya baris
        for (int a = 1; a < 32; a++)
        {
            // terjadinya kolom
            for (int b = 1; b <= 12; b++)
            {
                arr2d[a][b] = a + b;
                if(a == 26){
                    if(b == 1)
                    {
                        System.out.print(a + "," + b + " Lemarinya yang ini bro\t");
                    }
                }
                
            }
            // System.out.println("");
        }
        System.out.println("");
        // batas akhir
    }  
}  