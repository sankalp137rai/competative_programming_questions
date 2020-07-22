package Number_theory_basics;

import java.util.Scanner;

public class BinaryExponention {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number and power number :");
		long base=sc.nextInt();
		int power=sc.nextInt();
		long result=1;
		while(power!=0) {
			if(power%2==0) {
				power=power/2;
				//System.out.println("power: "+power);
				base*=base;
				//System.out.println("base: "+base);
			}
			else {
				result*=base;
			//	System.out.println("result: "+result);
				power--;
			//	System.out.println("power: "+power);
			}
		}
		System.out.println("answer: "+result);
	}

}
