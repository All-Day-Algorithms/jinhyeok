
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		/** 
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	9498	시험 성적
		 */
		
		/*
		getMatcher(sc);
		*/
		
		/**	
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	10817	세 수
		 */
		
		/*
		getTreepleMiddleValue(sc);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	10871	X보다 작은 수
		 */
		
		/*
		getLessX(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 4	      1546	      평균
		 */
		
		/*
		getAverage(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5	     4344        평균은 넘겠지
		 */
		
		/*
		getAverageOver(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 6	      1110	     더하기 사이클
		 */
		
		/*
		getLoopCycle(sc);
		*/
	
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	1152	단어의 개수
		 */
		getTokenCount(sc);
	}
	
	public static void getTokenCount(Scanner sc) throws IOException {
		
		int value = new StringTokenizer(
						new BufferedReader(
								new InputStreamReader(System.in)).readLine())
																 .countTokens();
		
		System.out.print(value);
	}
	
	/**
	 * Test ::
	 * 1
	 * @param sc Scanner
	 */
	public static void getLoopCycle (Scanner sc) {
		
		int leak, root;
		
		leak = root = sc.nextInt();
		
		int count = 0;
		
		do {
			
			leak = (leak%10 *10) + ((leak/10 + leak%10)%10);
			count++;
		}while(root != leak);
		
		System.out.println(count);
	}
	
	/**
	 * Test ::
	 * 5
	 * 5 50 50 70 80 100
	 * 7 100 95 90 80 70 60 50
	 * 3 70 90 80
	 * 3 70 90 81
	 * 9 100 99 98 97 96 95 94 93 91
	 * 
	 * @param sc
	 */
	public static void getAverageOver (Scanner sc) {
		
		StringBuilder builder = new StringBuilder();
		
		int loop = sc.nextInt();
		
		int subloop;
		
		while(loop --> 0) {
			
			subloop = sc.nextInt();
			
			List<Integer> gradeList = getIntList(subloop, sc);
			
			final double dAverage = gradeList.stream()
					                         .reduce((x,y) -> x+y)
					                         .get() / (double)subloop;
			
			builder.append(String.format("%.3f%%\n", gradeList.stream()
					                                          .filter(x -> x>dAverage)
					                                          .count() / (double)subloop *100 ));
		}
		
		System.out.println(builder.toString());
	}
	
	/**
	 * Test ::
	 * 3
	 * 40 80 60
	 * 
	 * @param sc Scanner
	 */
	public static void getAverage (Scanner sc) {
		
		int loop = sc.nextInt();
		
		List<Double> list = getDoubleList(loop, sc);
		
		final Double MaxScore = list.stream()
				                    .sorted((x,y)->(int)(y-x))
				                    .findFirst()
				                    .get();
		
		double value = list.stream()
				           .map(x->x/MaxScore*100)
				           .collect(Collectors.averagingDouble(x->x));
		
		System.out.println(value);
		
	}
	
	public static void getMatcher (Scanner sc) {
		
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

	/**
	 * Test ::
	 * 10 20 30
	 * 
	 * @param sc Scanners
	 */
	public static void getTreepleMiddleValue (Scanner sc){
		
		int value = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt())
					.stream()
					.sorted()
					.collect(Collectors.toList())
					.get(1);
		
		System.out.println(value);
	}
	
	/**
	 * Test ::
	 * 10 5
	 * 1 5 7 9 21 5 6 7 8 2
	 * 
	 * @param sc Scanner
	 */
	public static void getLessX (Scanner sc) {
	
		int loop     = sc.nextInt();
		
		int lessThen = sc.nextInt();
		
		List<Integer> list = getIntList(loop, sc);

		String value = list.stream()
                        .filter(x->x<lessThen)
                        .collect(Collectors.toList())
                        .toString()
                        .replaceAll("[\\[,\\]]", "");
		
		System.out.println(value);
		
	}
	
	public static <T> List<T> getList (int loop, Scanner sc, Class<T> klazz, ScannerCallback<T> scannerCallback) {
		
		List<T> list = new ArrayList<>();
		
		while(loop --> 0) {

			list.add(scannerCallback.getValue(sc));
		}
		
		return list;
	}

	public static List<Integer> getIntList (int loop, final Scanner sc) {
		
		return getList(loop, sc, Integer.class, scanner -> scanner.nextInt());
	}
	
	public static List<Double> getDoubleList (int loop, Scanner sc) {
		
		return getList(loop, sc, Double.class , scanner -> scanner.nextDouble());
	}
	
	interface ScannerCallback<T> {
		
		T getValue(Scanner sc);
	}
	
	
}
