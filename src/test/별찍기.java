package test;

import java.util.Scanner;

public class 별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=0;j<=a-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
