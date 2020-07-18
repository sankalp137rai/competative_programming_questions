package JulyLong20;

import java.util.Scanner;

public class chefStr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] ar = new int[n];
			int tskipedStr = 0;
			int diff = 0;
			for(int i=0;i<n;i++) {
				ar[i] = sc.nextInt();
			}
			for(int i=n-1;i>0;i--) {
				if(ar[i]>ar[i-1])
				diff = ar[i] - ar[i-1] ;
				else diff = ar[i-1] -ar[i];
				diff-=1;
				System.out.print(diff+" ");
				tskipedStr += diff;
			}
			System.out.println("\n"+tskipedStr);
		}

	}

}
