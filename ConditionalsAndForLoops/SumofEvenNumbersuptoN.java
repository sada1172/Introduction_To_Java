import java.util.Scanner;
public class sumofEvennum {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int i = 0;
        int n = s.nextInt();
        int sum = 0;
        
        while(i<=n){
            if(i%2 == 0){
                sum = sum +i;
            }
            i = i+1;
        }
        System.out.println(sum);
		

		
	}

}
