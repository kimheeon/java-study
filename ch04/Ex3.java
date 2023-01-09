package ch04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//입력한 1~20사이의 숫자중에 3,6,9 인지를 판단하세요.
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요.");
				int a = sc.nextInt();
				
//				if(a>10) {
//					a-=10;
//					if(a==3||a==6||a==9) {
//						System.out.println("짝");
//					}else {
//						a+=10;
//						System.out.println(a);
//					}
//					}
//				else if(a==3||a==6||a==9) {
//					System.out.println("짝");
//				}else {
//					System.out.println(a);
//				}
				
				int b = a%10; // 십자리 날라가고 일자리만 리턴
				if(b!=0&&b%3==0) {
					System.out.println("짝");
				}else {
					System.out.println(a);
				}
			
	}

}
