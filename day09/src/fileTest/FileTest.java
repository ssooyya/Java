package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{
//		절대 경로 : 내가 어디에 위치해 있든 무조건 찾아가는 경로
//		상대 경로 : 내가 있는 위치에 따라 변하는 경로
//		자바에서는 기본 경로는 프로젝트 폴더이다.
		BufferedWriter bw = new  BufferedWriter(new FileWriter(new File("test.txt")));
		
		bw.write("안녕하세요.");
		bw.newLine(); //줄바꿈
		bw.write("반갑습니다.");
		
//		bw.flush(); //버퍼에 있는 데이터를 전송한다.
		bw.close();	//close를 사용하면 자동으로 버퍼를 비워준다. 전송해준다.
		
		BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
		
//		System.out.println((char)br.read());
//		System.out.println((char)br.read());
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
	}
}