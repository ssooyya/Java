package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
		//현재 경로에 animal.txt 파일을 생성하고
		//파일 내용은 사슴, 고라니, 너구리, 토끼 네 가지 동물을 작성한다.
		//각 동물은 줄바꿈 후 다음 동물을 넣도록 한다.
		//반복문을 사용하여 데이터를 출력한다.
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
		
		String [] animals = {"사슴", "고라니", "너구리", "토끼"};
		
		for (String animal : animals) {
			bw.write(animal);
			bw.newLine();
		}
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(new File("animal.txt")));
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
//		while(true) {
//			line =  br.readLine();
//			if(line!=null) {
//				System.out.println(line);
//				continue;
//			}
//			break;
//		}
		br.close();
	}
}