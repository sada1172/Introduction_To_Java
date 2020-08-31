import java.util.Scanner;
public class DiamondOfStars {
    
    public static void main(String[] args) {
            int n, i, j, space = 1;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int n1 = (n+1)/2;
		    int n2 = n1-1;
	        space = n1 - 1;
	        for (j = 1; j <= n1; j++) 
	        {
	            for (i = 1; i <= space; i++) 
	            {
	                System.out.print(" ");
	            }
	            space--;
	            for (i = 1; i <= 2 * j - 1; i++) 
	            {
	                System.out.print("*");                
	            }
	            System.out.println("");
	        }
	        space = n2-1;
	        for (j = 1; j <= n2; j++) 
	        {
	            for (i = 1; i <= (j); i++) 
	            {
	                System.out.print(" ");
	            }
	            space++;
	            for (i = 1; i <= 2 * (n1 - j) - 1; i++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
        
    }
    }
