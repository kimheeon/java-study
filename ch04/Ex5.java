package ch04;

public class Ex5 {

	public static void main(String[] args) {
		String month = "february";
		
		switch(month) {
		case "january":
			System.out.println("1월달");
			break;
		case "febuary":
			System.out.println("2월달");
			break;
		case "march":
			System.out.println("1월달");
			break;
		default:
			System.out.println("4월이후입니다");
		}
	}

}
