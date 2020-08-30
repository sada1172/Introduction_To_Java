import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int basic = s.nextInt();
		double hra = basic*0.2;
		double da = basic*0.5;
		double pf = basic*(11.0/100.0);
		int allow =0;
		char grad =s.next().charAt(0);
		double salary;
		if(grad == 65){
			 allow = 1700;
			}
		else if(grad == 66){
			allow = 1500;
			
		}
		else{
			allow = 1300;
		}
		 salary = basic+hra+da+allow-pf;
		int total =(int)salary;
		if(salary-total>0.5)
			total = total+1;
		else
			salary = total;
		System.out.println(total);
        // Write your code here

	}
}
