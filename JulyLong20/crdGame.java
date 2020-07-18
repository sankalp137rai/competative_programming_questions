package JulyLong20;

import java.util.Scanner;

public class crdGame {
	static int digitSum(int num) {
		int sum = 0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int cNum,mNum;
			int cPoints = 0;
			int mPoints = 0;
			int cDigitSum,mDigitSum;
			while(n-->0) {
				cNum = sc.nextInt();
				mNum = sc.nextInt();
				cDigitSum = digitSum(cNum);
				mDigitSum = digitSum(mNum);
				if(cDigitSum>mDigitSum) cPoints+=1;
				else if(mDigitSum > cDigitSum) mPoints+=1;
				else {
					mPoints+=1;
					cPoints+=1;
				}
			}
			if(cPoints>mPoints) System.out.println("0 "+cPoints);
			else if(mPoints>cPoints) System.out.println("1 "+mPoints);
			else System.out.println("2 "+cPoints);
		}
		
		

	}

}
