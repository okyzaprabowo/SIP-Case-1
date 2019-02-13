class Quiz1{  
    public static void main(String args[]){ 
        // String nimString = "1142202"; 
        // char[] nimChar = nimString.toCharArray();
        char[] nimChar = {'1','1','4','2','2','0','2'};
        
        System.out.println("No. 1");
        for (char output : nimChar) {
			System.out.print(output + "  ");
        }
        System.out.println();

        System.out.println("No. 2");
        int panjang = Character.getNumericValue(nimChar[0]);
        int lebar = Character.getNumericValue(nimChar[3]);
        int luas = panjang * lebar;

        System.out.print(panjang + " x " + lebar + " = " + luas);
        System.out.println();

        System.out.println("No. 3");
        for (int i= 0; i < nimChar.length; i++)
        {
            if(i==2 || i==nimChar.length-1)
            {
                nimChar[i] = 'X';
            }

            System.out.print(nimChar[i] + "  ");
        }
        System.out.println();

        System.out.println("No. 4");
        for (int a = 0; a < nimChar.length; a++)
        {
            // terjadinya kolom
            for (int b = 0; b < nimChar.length; b++)
            {
                if( a == b){
                    System.out.print(nimChar[b]);
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }  
}  