import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
                
                Scanner s = new Scanner(System.in);
                int t,c=0;
                double sum=0;
                
        System.out.println("Enter total no.of employees:");
        int n = s.nextInt();
        if(n<2)
        {
            System.out.println("Please enter a valid employee count");
        }
        else
        {
            System.out.println("Enter the age for "+n+" employees:");
            for(int i=0;i<n;i++)
            {
                t = s.nextInt();
                if(t<28 || t>40)
                {
                     System.out.println("Invalid age encountered!");
                     c++;
                     break;
                }
                else{
                    sum+=t;
                }
            }
            if(c==0)
            {System.out.println("The average age is ");System.out.format("%.2f",(sum/n));}
        }
    }
}
