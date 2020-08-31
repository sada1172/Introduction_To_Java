import java.util.Scanner;
public class FindPower {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();
        int r = 1;
        int i =1;
        while(i<=n){
            r = r*a;
            i = i+1;
        }
        System.out.println(r);
       
    }
}
