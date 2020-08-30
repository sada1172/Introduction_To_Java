 import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
         char ch;
		        Scanner scan = new Scanner(System.in);
				 ch = scan.next().charAt(0);
				if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		        {
		        	if(ch >= 65 && ch <= 90)
			    		System.out.println(1); 
			    	else if (ch >= 97 && ch <= 122)
			    		System.out.println(0);
		        }
		        else
		        {
		            System.out.print("-1");
		        }
		    }
	}
    
