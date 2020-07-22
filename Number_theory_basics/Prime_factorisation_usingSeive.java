package Number_theory_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_factorisation_usingSeive {
	private static int ar[]=new int[1000001]; //array containing smallest prime factor
	private static int maxN=1000000;
    private static ArrayList<Integer> al=new ArrayList<>(); //will contain
	
	public static void sieve() {
		for(int i=2;i<=maxN;i++) {
			if(ar[i]==0) {
				for(int j=i;j<=maxN;j+=i) {
					ar[j]=i;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sieve();
		//System.out.println(ar[11]);
		while(n!=1) {
			System.out.print(ar[n]+" ");
			al.add(ar[n]);
			n/=ar[n];
		}
		for(int c: al) {
			System.out.print(c+" ");
		}
	}

}
