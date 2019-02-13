import java.awt.*;
class ContohFunction{  
    static int hitungLuas(int panjang, int lebar){
        // fungsi luas persegi panjang
        int luas = 0;
        luas = panjang * lebar;
        return luas;
    }
    public static void main(String args[]){ 
        int panjang1 = 3;
        int lebar1 = 4;
        int luas1 = 0;

        int panjang2 = 4;
        int lebar2 = 5;
        int luas2 = 0;

        int panjang3 = 5;
        int lebar3 = 6;
        int luas3 = 0;

        luas1 = hitungLuas(panjang1, lebar1);
        luas2 = hitungLuas(panjang2, lebar2);
        luas3 = hitungLuas(panjang3, lebar3);

        System.out.println(luas1);
        System.out.println(luas2);
        System.out.println(luas3);
        Toolkit.getDefaultToolkit().beep();
    }  
}  