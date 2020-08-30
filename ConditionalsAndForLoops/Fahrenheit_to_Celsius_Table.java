import java.util.Scanner;
public class fToC {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int E = scan.nextInt();
        int W = scan.nextInt();
        double c;
        
        while(S <= E){
           c = (S-32)*(5.0/9.0);
            int r =(int)c;
           System.out.println(S+" "+r);
           S = S+W;
            
        }
	}

}
