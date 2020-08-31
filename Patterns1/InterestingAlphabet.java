import java.util.Scanner;
public class InterestingAlphabet  {


	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        while(i<=n){
	            int j = 1;
	            char ch = (char)('A'+n-i);
	            while(j<=i){
	                System.out.print(ch);
	                ch++;
	                j++;
	            }
	            System.out.println();
	            i++;
	        }	
	}

}
