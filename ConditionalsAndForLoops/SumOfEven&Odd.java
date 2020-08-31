import java.util.Scanner;
public class sum {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sume = 0;
		int sumo = 0;
		int m;
		while(n>0){
			m=n%10;
			if(m%2==0)
				sume = sume+m;
			else
				sumo = sumo+m;
			n=n/10;
			
		}
		System.out.println(sume+" "+sumo);
	
	}
}
