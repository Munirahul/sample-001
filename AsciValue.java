import java.util.Scanner;
public class AsciValue {
    public static void main(String[] args) {
                
                Scanner s = new Scanner(System.in);
                int[] a; 
                a = new int[4];
                
        System.out.println("Enter the digits:");
        for(int i = 0; i < 4; i++)
        {
            a[i] = s.nextInt();
        }
         for(int i = 0; i < 4; i++) 
         {
           System.out.println(a[i] + "-" + (char)a[i]);  
         }
              
    }
}
