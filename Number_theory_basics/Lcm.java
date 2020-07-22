package Number_theory_basics;

import java.util.Scanner;
public class Lcm {
    static int gcd(int a,int b) {
    	if (b==0)
    		return a;
    	return gcd(b,a%b);
		
	}
    static int lcm(int a,int b) {
    	return ((a*b)/gcd(a,b));
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numer to get LCM");
		int a=sc.nextInt();
		int b=sc.nextInt();
		/*if(a>b) {
			System.out.println("LCM : "+lcm(a,b));
		}
		else
			System.out.println("LCM : "+lcm(b,a));*/
		System.out.println("LCM : "+lcm(a,b));
	}
	
}
