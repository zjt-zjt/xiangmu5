package TestSystem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {

	
	public List<TestQuestions> fileReader() {
		List<String> list = new ArrayList<>();
		List<TestQuestions> l = new ArrayList<>();
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\Items.txt");
			
			br = new BufferedReader(fr);
			 String str = "";
			  while((str = br.readLine())!=null) {
				 if(str.trim().length()!=0) {
					 list.add(str);
				 }

			  }		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for(int i =0;i<list.size();i+=6) {
			String title = list.get(i);
			String A = list.get(i+1);
			String B = list.get(i+2);
			String C = list.get(i+3);
			String D = list.get(i+4);
			String answer= list.get(i+5);
			TestQuestions testQuestions = new TestQuestions(title, A, B, C, D, answer);
			l.add(testQuestions);
		}
		return l;
	}
	
	
	
	
	
}
