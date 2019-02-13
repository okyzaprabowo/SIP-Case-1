import java.util.Scanner;
import java.awt.*;
class Lat2Function{  
    static String login(String username, String password){
        String hasil = "";
        // fungsi luas persegi panjang
        if(username.equals("okyza") && password.equals("12345")){
            hasil = "Login berhasil";
        }
        else{
            // Toolkit.getDefaultToolkit().beep();
            hasil = "Login gagal";
        }

        return hasil;   
    }
    public static void main(String args[]){ 
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();
        input.close();
        
        System.out.println(username + " " + password);
        System.out.println(login(username,password));

        
    }  
}  