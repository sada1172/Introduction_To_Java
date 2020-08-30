/* 
Print the following pattern
Pattern for N = 4
       1
      23  
     345
    4567
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input :
5
Sample Output :
          1
         23
        345
       4567
      56789

*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n){
			int space =1;
			while(space<= n-i){
				System.out.print(" ");
				space = space+1;
			}
			int j =0;
			while(j<i){
				System.out.print(j+i);
				//val = val+1;
				j = j+1;
			}
			System.out.println();
			i = i+1;
		}

	}

}

