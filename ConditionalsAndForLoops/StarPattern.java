import java.util.Scanner;
public class starPattern {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j;
		int i=1;
		while(i<=n)
        {
    j=0;
    while(j++<n-i)
                {
                        System.out.print(" "); ;
                }
      j=0;
                while(j++<(i*2)-1)
                {
                        System.out.print("*"); 
                }
              System.out.println();
              i = i+1;
        }
	
	}

}
