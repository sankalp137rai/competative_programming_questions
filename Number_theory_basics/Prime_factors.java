package Number_theory_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for it's prime factor");
		int num=sc.nextInt();
		primeFactors(num);

	}
	static void primeFactors(int num) {
		int temp=num;
		ArrayList<Integer> al=new ArrayList<Integer>();
		/*while(num%2==0) {
			al.add(2);
			num=num/2;
		}*/
		for(int i=2;i<=Math.sqrt(temp);i=i+1){
			while(num%i==0) {
				al.add(i);
				num=num/i;
			}
		}
		System.out.print("prime factors of "+temp+" are: ");
		if(temp==num) {
			System.out.print(num);
		}
		if(!al.isEmpty()) {
			for(int i: al) {
				System.out.print(i+" ");
			}
		}
	}

}
