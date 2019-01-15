package TT;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		/** 
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	9498	시험 성적
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		getMatcher(sc);
		*/
		
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	10817	세 수
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		getTreepleMiddleValue(sc);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	10871	X보다 작은 수
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		getLessX(sc);
		*/
	}
	
	public static void getMatcher(Scanner sc) {
		
		int grade = sc.nextInt();
		
		String gradeName;
		
		if(grade/90 == 1){
			gradeName = "A";
		} else if(grade/80 == 1) {
			gradeName = "B";
		} else if(grade/70 == 1) {
			gradeName = "C";
		} else if(grade/60 == 1) {
			gradeName = "D";
		} else {
			gradeName = "F";
		}
		
		
		System.out.println(gradeName);
	}

	public static void getTreepleMiddleValue(Scanner sc){
		
		int value = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt())
					.stream()
					.sorted()
					.collect(Collectors.toList())
					.get(1);
		
		System.out.println(value);
	}
	
	public static void getLessX(Scanner sc) {
	
		int loop = sc.nextInt();
		
		int lessThen = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		while(loop-->0) {
			
			list.add(sc.nextInt());
		}

		String value = list.stream()
						.filter(x->x<lessThen)
						.collect(Collectors.toList())
						.toString()
						.replace("[", "")
						.replace("]", "")
						.replace(",", "");
		
		System.out.println(value);
		
	}
	
}
