package TestSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	

	
	public static void main(String[] args) {
		 boolean exit = false;
		while(exit==false) {
			Menu();
			int c = Choose();
			switch (c) {
		       case 1:{
		    	goTest();
		    	   break;
		       }
               case 2:{
            	   
		    	  grade();
		    	   break;
		       }
               case 3:{
		    	   System.out.println("是否要退出,Y/N");
		    	   Scanner scanner = new Scanner(System.in);
		    	   String string = scanner.nextLine();
		    	   if(string .equalsIgnoreCase("Y")) {
		    		   exit = true;
		    	   }
		    	   break;
		       }
			}
		}
	}

	
	
		
	
	
	public static void Menu() {
		System.out.println("................考试系统.....................................................");
		System.out.println("1.开始考试");
		System.out.println("2.查看成绩");
		System.out.println("3.退出系统");
		System.out.println(".......................................");
	}
	
	public static int Choose() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1-3的选择");
		int choose = scanner .nextInt();
		while(true) {
			if(choose<1||choose>3) {
				System.out.println("输入错误，请重新输入");
				choose = scanner .nextInt();
			}else {
				break;
			}
			
		}
		return choose;
	}
	
	public static ArrayList<String> goTest() {
		Main m = new Main();
		ArrayList <String> list = new ArrayList<String>();
	   System.out.println("输入N进入下一题");
	   System.out.println("输入R返回上一题");
	   Scanner sc = new Scanner(System.in);
	   int count = 0;
	   while(count<10) {
		  System.out.println(m.fileReader().get(count));
		  System.out.println("请输入你要选择的答案A,B,C,D");
		  String answer  = sc.nextLine();
		  list.add( answer);
		  System.out.println("请选择");
		  String s  = sc.nextLine();
		  if(s.equalsIgnoreCase("N")) {
			  count++;
		  }else if(s.equalsIgnoreCase("R")) {
			  count--;
		  }else {
			System.out.println("输入错误");
		}
		  if(count==10) {
			  break;
		  }
		  
	  }
	   return list;
	  
	}
	
	public static void grade() {
		Main m = new Main();
		int score = 0;
       for(int i =0;i<10;i++) {
   	   System.out.println("正确答案为"+m.fileReader().get(i).getAnswer());
  	   System.out.println("你的答案为"+goTest().get(i));
   	   if(goTest().get(i).equalsIgnoreCase(m.fileReader().get(i).getAnswer())) {
  		  score+=10;
  		  System.out.println("总成绩为"+score);
 	  }
       }
		
		
	}
	
}
