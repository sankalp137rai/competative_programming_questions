package JulyLong20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class missingPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int x, y,pointx=0,pointy=0;
			Map<Integer, Integer> mx = new HashMap<>();
			Map<Integer, Integer> my = new HashMap<>();
			for(int i=0; i < 4*n-1;i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				if(mx.containsKey(x)) {
					int v = mx.get(x);
					v++;
					mx.put(x,v);
				}
				else {
					mx.put(x,1);
//					System.out.println("mx= "+mx);
				}
				if(my.containsKey(y)) {
					int v = my.get(y);
					v++;
					my.put(y,v);
				}
				else {
					my.put(y,1);
//					System.out.println("my= "+my);
				}
			}
			for (Integer xpoint : mx.keySet())  
	        { 
	            // search  for value 
	            if(mx.get(xpoint)%2!=0) System.out.print(xpoint); 
	        }
			for (Integer ypoint : my.keySet())  
	        { 
	            // search  for value 
	            if(my.get(ypoint)%2!=0) {
	            	System.out.print(" "+ypoint);
	            	}
	        }
//			int x, y,pointx=0,pointy=0;
//			int[] xs = new int[1000000];
//			int[] ys= new int[1000000];
//			for(int i = 0; i < 4*n-1;i++) {
//				x = sc.nextInt();
//				y = sc.nextInt();
//				xs[x]++;
//				ys[y]++;
//			}
//			for(int i = 0; i<1000000; i++) {
//				if(xs[i]%2!=0 && xs[i]!=0) pointx = i;
//				if(ys[i]%2!=0 && xs[i]!=0) pointy = i;
//				System.out.println(xs[i]+" "+ys[i]);
//			}
		}

	}

}
