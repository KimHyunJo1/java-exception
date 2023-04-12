package sample01;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp1 {

	public static void main(String[] args) {
		
		// 예외처리
		/*
		 * try ~ catch 구문을 사용해서 예외처리하기 , 부모가 밑에 자식이 위에 오게 적어야 한다.
		 *	
		 *	형식 
		 *		try {
		 *			예외 발생이 예상되는 수행문;
		 *			예외 발생이 예상되는 수행문;
		 *		} catch (예외클래스명1 변수명1) {
		 *			예외처리수행문1;
		 *			예외처리수행문1;
		 *		} catch (예외클래스명2 변수명2) {
		 *			예외처리수행문2;
		 *			예외처리수행문2;
		 *		} catch (Exception 변수명3) {	// 보험용(예상하지 못한 상황도 처리하기 위해서)
		 *			예외처리수행문3;
		 *			예외처리수행문3;
		 *		}
		 *
		 *		- try 블록의 수행문에서 예외클래스명1에 해당되는 예외가 발생하면
		 *		  첫번쨰 catch 블록에서 해당 예외를 가로채고 변수명1에 대입한 다음,
		 *		  예외처리수행문1을 실행한다.
		 *		- try 블록의 수행문에서 예외클래스명2에 해당되는 예외가 발생하면
		 *		  두번쨰 catch 블록에서 해당 예외를 가로채고 변수명2에 대입한 다음,
		 *		  예외처리수행문2을 실행한다.
		 *		- try 블록의 수행문에서 예상하지 못한 예외가 발생하면
		 *		  새번쨰 catch 블록에서 해당 예외를 가로채고 변수명3에 대입한 다음,
		 *		  예외처리수행문3을 실행한다.
		 *		
		 */
		
		// Checked Exception이 발생하는 수행문 실행하고, 예외처리하기
		try {
			FileWriter writer = new FileWriter("src/sample01/sample01.txt");
			writer.write("예외처리 실습해보기");
			writer.close();
		}	 catch (IOException ex) {	// catch로 잡은 예외처리를 ex에 담는다. 
				System.out.println("IOException이 발생하였습니다.");
		}
	}
}
