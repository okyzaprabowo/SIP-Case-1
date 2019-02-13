class InsertionSort 
{
    public static void main(String args[]) 
    {         
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6}; 

        for (int i=1; i<arr.length; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            System.out.println("Loop ke " + i);
  
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1;
            } 
            arr[j+1] = key;
            
            for (int isi=0; isi<arr.length; ++isi)
            {
                System.out.print(arr[isi] + " "); 
            } 
  
            System.out.println();
        } 
    } 
}