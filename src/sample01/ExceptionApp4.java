package sample01;

public class ExceptionApp4 {

//	public static void test1() throws IOException, ClassNotFoundException{
//		System.out.println("예외처리 위임하기 연습");
//		test2();
//	}
//	
//	public static void test2() throws IOException, ClassNotFoundException{
//		System.out.println("예외처리 위임하기 연습");
//		test3();
//	}
//	
//	public static void test3() throws IOException, ClassNotFoundException{
//		System.out.println("예외처리 위임하기 연습");
//		test4();
//		
//		Class.forName("java.io.String");
//	}
//	
//	public static void test4() throws IOException{
//		FileWriter writer = new FileWriter("src/sample01/sample04.txt");
//		writer.write("파일쓰기 연습");
//		writer.close();
//	}
	
	// UncheckedExcaption 사용 CheckedExcaption는 하나하나 다 써야해서 너무 귀찮음
	
	public static void test2(String str) { // 예외가 여기로 전달(2) 예외 처리 안했으니까 (3)으로 위임된다
		test1(str);
	}
	
	public static void test1(String str) {
		int number = Integer.parseInt(str);		// 오류 안남 예외는 먼저 여기서 발생함(1). 자동으로 위임처리가 된다. 
		System.out.println("number -> " + number);
	}
	
	public static void main(String[] args) {
		try {
			test2("1234");
			test2("1234오");
		} catch (NumberFormatException ex) {	// (3) 여기서 예외처리된다.
			System.out.println("유효한 숫자형식의 문자열이 아닙니다.");
		}
	}
}
