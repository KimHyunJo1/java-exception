package sample01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionApp2 {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("src/sample01/sample.txt");
			BufferedReader br = new java.io.BufferedReader(reader);
			String text = br.readLine();
			System.out.println(text);
			br.close();
		} catch (FileNotFoundException ex) {						// 자식
			System.out.println("지정된 파일을 찾을 수 없습니다.");
		} catch (IOException ex) {
			System.out.println("읽기 작업 중 오류가 발생하였습니다.");		// 부모가 밑으로
		}
	}
}
