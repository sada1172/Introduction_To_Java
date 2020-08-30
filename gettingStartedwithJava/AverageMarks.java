import java.util.Scanner;
public class averageMarks {


	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        int m = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println(m);
		
		
		
	}

}
