package JulyLong20;

import java.util.Scanner;

public class AdaKing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [][] ar1 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".","X","O","X",".",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar2 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".","X","X","X","X",".",".","."},
				{".","X","O",".","X",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar3 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X",".",".",".",".",".","."},
				{".","X","X",".",".",".",".","."},
				{"O",".","X",".",".",".",".","."}
				
		};
		String [][] ar4 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X",".",".",".",".","."},
				{".",".","X",".",".",".",".","."},
				{"O",".","X",".",".",".",".","."}
				
		};
		String [][] ar5 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X",".",".",".",".","."},
				{".",".","X","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
		};
		String [][] ar6 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".","X","X","X","X",".",".","."},
				{".","X",".",".","X",".",".","."},
				{".","X","O",".","X",".",".","."},
				{".","X",".",".","X",".",".","."},
				{".","X","X","X","X",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar7 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".","X","X","X","X",".",".","."},
				{".","X",".",".","X",".",".","."},
				{".","X","O",".","X",".",".","."},
				{".","X",".",".","X",".",".","."},
				{".","X","X",".","X",".",".","."},
				{".",".","X","X","X",".",".","."}
				
		};
		String [][] ar8 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X","X",".",".",".","."},
				{".",".","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar9 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar10 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X",".",".",".",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar11 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X","X",".",".",".","."},
				{".",".","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar12 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar13 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X",".",".",".",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar14 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X",".",".",".",".","."},
				{".",".","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar15 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{"X","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar16 = {
				{".",".",".",".",".",".",".","."},
				{"X","X",".",".",".",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar17 = {
				{".",".",".",".",".",".",".","."},
				{"X","X","X",".",".",".",".","."},
				{".",".","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar18 = {
				{".",".",".",".",".",".",".","."},
				{"X","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
				
		};
		String [][] ar19 = {
				{"X","X",".",".",".",".",".","."},
				{".","X","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar20 = {
				{"X","X","X",".",".",".",".","."},
				{".",".","X","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar21 = {
				{"X","X","X",".",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
		};
		String [][] ar22 = {
				{"X","X",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar23 = {
				{"X",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar24 = {
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar25 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar26 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar27 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar28 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".","X",".",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
		};
		String [][] ar29 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".","X",".",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar30 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar31 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".","X",".",".",".","."}
				
		};
		String [][] ar32 = {
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar33 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar34 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".",".","X",".",".","."}
		};
		String [][] ar35 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar36 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar37 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{".",".",".",".","X",".",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar38 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar39 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{".",".",".",".","X","X",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar40 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".","X","X",".","."},
				{"O",".",".",".","X",".",".","."}
				
		};
		String [][] ar41 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{"O",".",".",".","X","X",".","."}
				
		};
		String [][] ar42 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{"O",".",".",".",".","X",".","."}
				
		};
		String [][] ar43 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
		};
		String [][] ar44 = {
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X",".","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
		};
		String [][] ar45 = {
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
		};
		String [][] ar46 = {
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
				
		};
		String [][] ar47 = {
				{".",".",".",".",".","X","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
				
		};
		String [][] ar48 = {
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
		};
		String [][] ar49 = {
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".","X","X"},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{".",".",".",".",".",".","X","."},
				{"O",".",".",".",".",".","X","."}
				
				
		};
		String [][] ar50 = {
				{".",".",".",".",".",".","X","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".","O","X","X",".",".","X"},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
				
		};
		String [][] ar51 = {
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".","O","X","X",".",".","X"},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar52 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".","O","X","X",".",".","X"},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
		};
		String [][] ar53 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","X"},
				{".",".",".",".",".",".",".","X"},
				{".",".","O","X","X",".",".","X"},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar54 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","X"},
				{".",".","O","X","X",".",".","X"},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar55 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","X"},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar56 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".",".","X","X",".",".","X"},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar57 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".",".","X",".",".","X"},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar58 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".",".",".",".","X"}
				
		};
		String [][] ar59 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".",".","X",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar60 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".",".","X","X",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar61 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".","X",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar62 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X","X",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
		};
		String [][] ar63 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O","X",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		String [][] ar64 = {
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".","O",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}
				
		};
		
		int t = sc.nextInt();
		while(t-->0) {
			int k = sc.nextInt();
			switch(k) {
			case 1:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar1[i][j]);
					System.out.println();
				}
				break;
			case 2:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar2[i][j]);
					System.out.println();
				}
				break;
			case 3:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar3[i][j]);
					System.out.println();
				}
				break;
			case 4:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar4[i][j]);
					System.out.println();
				}
				break;
			case 5:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar5[i][j]);
					System.out.println();
				}
				break;
			case 6:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar6[i][j]);
					System.out.println();
				}
				break;
			case 7:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar7[i][j]);
					System.out.println();
				}
				break;
			case 8:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar8[i][j]);
					System.out.println();
				}
				break;
			case 9:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar9[i][j]);
					System.out.println();
				}
				break;
			case 10:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar10[i][j]);
					System.out.println();
				}
				break;
			case 11:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar11[i][j]);
					System.out.println();
				}
				break;
			case 12:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar12[i][j]);
					System.out.println();
				}
				break;
			case 14:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar14[i][j]);
					System.out.println();
				}
				break;
			case 15:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar15[i][j]);
					System.out.println();
				}
				break;
			case 16:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar16[i][j]);
					System.out.println();
				}
				break;
			case 17:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar17[i][j]);
					System.out.println();
				}
				break;
			case 18:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar18[i][j]);
					System.out.println();
				}
				break;
			case 19:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar19[i][j]);
					System.out.println();
				}
				break;
			case 20:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar20[i][j]);
					System.out.println();
				}
				break;
			case 21:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar21[i][j]);
					System.out.println();
				};
				break;
			case 22:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar22[i][j]);
					System.out.println();
				}
				break;
			case 23:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar23[i][j]);
					System.out.println();
				}
				break;
			case 24:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar24[i][j]);
					System.out.println();
				}
				break;
			case 25:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar25[i][j]);
					System.out.println();
				}
				break;
			case 26:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar26[i][j]);
					System.out.println();
				}
				break;
			case 27:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar27[i][j]);
					System.out.println();
				}
				break;
			case 28:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar28[i][j]);
					System.out.println();
				}
				break;
			case 29:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar29[i][j]);
					System.out.println();
				}
				break;
			case 30:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar30[i][j]);
					System.out.println();
				}
				break;
			case 31:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar31[i][j]);
					System.out.println();
				}
				break;
			case 32:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar32[i][j]);
					System.out.println();
				}
				break;
			case 33:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar33[i][j]);
					System.out.println();
				}
				break;
			case 34:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar34[i][j]);
					System.out.println();
				}
				break;
			case 35:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar35[i][j]);
					System.out.println();
				}
				break;
			case 36:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar36[i][j]);
					System.out.println();
				}
				break;
			case 37:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar37[i][j]);
					System.out.println();
				}
				break;
			case 38:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar38[i][j]);
					System.out.println();
				};
				break;
			case 39:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar39[i][j]);
					System.out.println();
				}
				break;
			case 40:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar40[i][j]);
					System.out.println();
				}
				break;
			case 41:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar41[i][j]);
					System.out.println();
				}
				break;
			case 42:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar42[i][j]);
					System.out.println();
				}
				break;
			case 43:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar43[i][j]);
					System.out.println();
				}
				break;
			case 44:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar44[i][j]);
					System.out.println();
				}
				break;
			case 45:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar45[i][j]);
					System.out.println();
				}
				break;
			case 46:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar46[i][j]);
					System.out.println();
				}
				break;
			case 47:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar47[i][j]);
					System.out.println();
				}
				break;
			case 48:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar48[i][j]);
					System.out.println();
				}
				break;
			case 49:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar49[i][j]);
					System.out.println();
				}
				break;
			case 50:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar50[i][j]);
					System.out.println();
				}
				break;
			case 51:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar51[i][j]);
					System.out.println();
				}
				break;
			case 52:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar52[i][j]);
					System.out.println();
				}
				break;
			case 53:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar53[i][j]);
					System.out.println();
				}
				break;
			case 54:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar54[i][j]);
					System.out.println();
				}
				break;
			case 55:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar55[i][j]);
					System.out.println();
				}
				break;
			case 56:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar56[i][j]);
					System.out.println();
				}
				break;
			case 57:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar57[i][j]);
					System.out.println();
				}
				break;
			case 58:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar58[i][j]);
					System.out.println();
				}
				break;
			case 59:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar59[i][j]);
					System.out.println();
				}
				break;
			case 60:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar60[i][j]);
					System.out.println();
				}
				break;
			case 61:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar61[i][j]);
					System.out.println();
				}
				break;
			case 62:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar62[i][j]);
					System.out.println();
				}
				break;
			case 63:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar63[i][j]);
					System.out.println();
				}
				break;
			case 64:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar64[i][j]);
					System.out.println();
				}
				break;
			case 13:
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) System.out.print(ar13[i][j]);
					System.out.println();
				}
				break;
			}
		}
	}

}
