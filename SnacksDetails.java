import java.util.Scanner;
public class SnacksDetails {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter the no of pizzas bought:");
    	int p = input.nextInt();
    	
    	System.out.println("Enter the no of puffs bought:");
    	int u = input.nextInt();
    	
    	System.out.println("Enter the no of cool drinks bought:");
    	int c = input.nextInt();
        
    	System.out.println("Bill Details");
    	System.out.println("No of pizzas:"+p);
        System.out.println("No of puffs:"+u);
        System.out.println("No of cooldrinks::"+c);
        System.out.println("Total price="+(p*100 + u*20 + c*10));
        System.out.println("ENJOY THE SHOW!!!");
    }
}