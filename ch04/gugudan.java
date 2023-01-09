package ch04;

public class gugudan {

	public static void main(String[] args) {
		int a =0;
		System.out.println("\t[구구단]");
		for(int i =1;i<=9;i++) {
			for(int j =1; j<=9; j++) {
				a = i*j;
				System.out.print("\t"+i+"*"+j+"="+a);
			}System.out.println();
		}
	}

}
